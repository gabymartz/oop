public class Triangulo {
    public static void main(String[] args) {
        int altura = 3;

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}