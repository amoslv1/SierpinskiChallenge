package sierpinski;

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

    protected static boolean sizeIsValid(int order, int size) {
        // Smallest Unit Size ^ Order = Carpet Size
        // Size must be a square/cube etc number
        return true;
    }
}
