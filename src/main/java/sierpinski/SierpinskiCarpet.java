package sierpinski;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Array;

import static utilities.Utilities.BLOCK_CHAR;

public class SierpinskiCarpet {

   public static void main(String[] args) {
        drawSierpinskiCarpet(3, 27);
    }
    
    public static String drawSierpinskiCarpet(int order, int size) {
        //TODO: Implement this
        String result = new StringBuilder()
                .append("███\n")
                .append("█ █\n")
                .append("███")
                .toString();
        System.out.println("This is the carpet from drawSierpinskiCarpet:\n" + result);
        return result;
    }

    public static String holePuncher(String fullRug) {
        int firstRowToPunch = 4;
        int firstColumnToPunch = 4;
        int numberOfRowsToPunch = 3;
        int indexToPunch;
        String[] arrayOfStrings = fullRug.split("\n");
        for (int i = 0; i < arrayOfStrings.length - 1; i++) {
            if (i == 3 || i == 4 || i == 5) {
                String row = arrayOfStrings[i];
                row = row.substring(0, 3) + "   " + row.substring(6);
                arrayOfStrings[i] = row;
            }
        }

        String result = String.join("\n", arrayOfStrings);
        System.out.println(result);
        return result;
    }

    static String lineFullBuilder(int height) {
       return StringUtils.repeat(BLOCK_CHAR, height) + "\n";
    }

    static String lineHolesBuilder(int height) {
        StringBuilder holeyLine = new StringBuilder();
        for (int i = 0; i < height / 3; i++) {
            holeyLine.append(BLOCK_CHAR + " " + BLOCK_CHAR);
        }
        return holeyLine.toString() + "\n";
    }

    public static String rugBuilder(int height) {
       StringBuilder completeCarpet = new StringBuilder();
        for (int i = 0; i < height / 3; i++) {
        StringBuilder oneFullRow = new StringBuilder();
            oneFullRow.append(lineFullBuilder(height))
                    .append(lineHolesBuilder(height))
                    .append(lineFullBuilder(height));
            completeCarpet.append(oneFullRow);
        }
        System.out.println("This is the full rug of size " + height + ": \n" + completeCarpet);
        return completeCarpet.substring(0, completeCarpet.length() - 1); // removes trailing \n
   }

    public static boolean sizeIsValid(int order, int size) {
        // Smallest Unit Size ^ Order = Carpet Size
        // Size must be a square/cube etc number
        return true;
    }
}
