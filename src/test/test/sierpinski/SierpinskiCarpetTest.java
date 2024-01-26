package sierpinski;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SierpinskiCarpetTest {

    private final static String ORDER_1 =  """
            ███
            █ █
            ███""";

    public static final String ORDER_2 = new StringBuilder()
            .append("*********\n")
            .append("* ** ** *\n")
            .append("*********\n")
            .append("***   ***\n")
            .append("* *   * *\n")
            .append("***   ***\n")
            .append("*********\n")
            .append("* ** ** *\n")
            .append("*********")
            .toString();

    @Test
    void drawSierpinskiCarpet_drawsOrder1Carpet() {
        int order = 1;
        int size = 3;
        String result = SierpinskiCarpet.drawSierpinskiCarpet(order, size);
        // Putting "\n" in both actual and expected just for better readability in log
        assertThat("\n" + result).isEqualTo("\n" + ORDER_1);
    }

    @Test
    void drawSierpinskiCarpet_drawsOrder2Carpet() {
        int order = 2;
        int size = 9;
        String result = SierpinskiCarpet.drawSierpinskiCarpet(order, size);
        // Putting "\n" in both actual and expected just for better readability in log
        assertThat("\n" + result).isEqualTo("\n" + ORDER_2);
    }

    @Test
    void orderIsValid_returnsFalseWhenInvalid() {

    }

    @Test
    void sizeIsValid_returnsTrueWhenValid() {
        // smallest unit 3
        int order = 2;
        int size = 9;
        boolean result = SierpinskiCarpet.sizeIsValid(order, size);
        assertThat(result).isTrue();
    }

    @Test
    void sizeIsValid_returnsTrueWhenValidWithLargerSmallestUnit() {
        // smallest unit 6
        int order = 2;
        int size = 36;
        boolean result = SierpinskiCarpet.sizeIsValid(order, size);
        assertThat(result).isTrue();
    }

    @Test
    void sizeIsValid_returnsFalseWhenInvalid() {
        int order = 2;
        int size = 10;
        boolean result = SierpinskiCarpet.sizeIsValid(order, size);
        assertThat(result).isFalse();
    }

    @Test
    void sizeIsValid_returnsFalseWhenInvalidDueToInvalidSmallestUnit() {
        // smallest unit 4 (invalid)
        int order = 2;
        int size = 16;
        boolean result = SierpinskiCarpet.sizeIsValid(order, size);
        assertThat(result).isFalse();
    }
}