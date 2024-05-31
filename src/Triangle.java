public class Triangle {
    public static void main(String[] args) {
        printTriangle(3);
    }
    public static void printTriangle(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
