package sierpinski;


import org.apache.commons.lang3.StringUtils;

import static utilities.Utilities.BLOCK_CHAR;

public class SierpinskiTriangle {
    public static void main(String[] args) {
        drawTriangle(4);

        drawSierpinskiTriangle(3, 2);
    }
    public static String drawTriangle(int height) {
        if (height < 3) {
            return null;
        }

        int width = getWidth(height);
        int midPoint = getMidpointIndex(height);

        StringBuilder lineBuilder = new StringBuilder();
        for (int i = 0; i < height - 1; i++) {
            //Create line of spaces
            String line = StringUtils.repeat(" ", width);

            //Place in left block
            int indexToReplace = midPoint - i;
            line = line.substring(0, indexToReplace) + BLOCK_CHAR
                    + line.substring(indexToReplace + 1);

            //Place in right block
            indexToReplace = midPoint + i;
            line = line.substring(0, indexToReplace) + BLOCK_CHAR
                    + line.substring(indexToReplace + 1);

            //Add line in
            lineBuilder.append(line).append("\n");
        }

        //Add last line with only bricks
        lineBuilder.append(StringUtils.repeat(BLOCK_CHAR, width));

        return lineBuilder.toString();
    }

    public static void drawSierpinskiTriangle(int order, int size) {
     //TODO: Implement this
    }

    public static int getWidth(int height) {
        return height * 2 - 1;
    }

    public static int getMidpointIndex(int height) {
        return height - 1;
    }
}
