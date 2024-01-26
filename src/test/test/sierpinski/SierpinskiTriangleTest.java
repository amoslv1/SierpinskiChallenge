package sierpinski;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SierpinskiTriangleTest {

    @Test
    void getWidth_returnsCorrectWidth() {
        int height = 10;
        int expected = 19;
        assertThat(SierpinskiTriangle.getWidth(height)).isEqualTo(expected);
    }

    @Test
    void getMidpointIndex_returnsCorrectIndex() {
        int height = 10;
        int expected = 9;
        assertThat(SierpinskiTriangle.getMidpointIndex(height)).isEqualTo(expected);
    }

}