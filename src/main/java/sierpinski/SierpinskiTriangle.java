package sierpinski;

public class SierpinskiTriangle {
    public static void main(String[] args) {
        drawTriangle(4);

        drawSierpinskiTriangle(3);
    }
    public static String drawTriangle(int height){
        //TODO: Implement this
        return "***";
    };
    
    public static void drawSierpinskiTriangle(int order) {
     //TODO: Implement this   
    }

    protected static int getWidth(int height) {
        return height * 2 - 1;
    }

    protected static int getMidpointIndex(int height) {
        return height - 1;
    }
}
