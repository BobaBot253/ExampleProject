public class Main {
    public static void main(String[] args) {
        drawLine(); // the top
        for (int i = 8; i > 0; i -= 2) { // draw the top part of the diamond
            System.out.print("|");
            for (int j = 0; j < i / 2; j++) {
                System.out.print(" "); // left padding
            }
            System.out.print("/");
            for (int j = 0; j < 8 - i; j++) {
                System.out.print(".");
            }
            System.out.print("\\");
            for (int j = 0; j < i / 2; j++) {
                System.out.print(" "); // right padding
            }
            System.out.println("|");
        }
        drawLine(); // the bottom
    }

    public static void drawLine() {
        // 12 wide square, should have 12 characters
        // System.out.println("+----------+");
        System.out.print("+");
        for (int i = 0; i < 10; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}

