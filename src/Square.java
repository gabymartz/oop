public class Square {
    public static void main(String[] args) {
        printSquare(5);
        printSquare(10);
        // Example Print
        printSquare(6);
        printSquare(4);
    }

    public static void printLine(int n){
        System.out.println("----------Printing Line ( "  +  n  + ")----------");
        System.out.println(" ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(" * ");
        }

    }
    public static void printSquare(int n){
        System.out.println("-------Printing Square "  +  n  + "-------");
        System.out.print(" ");
        for(int w=0; w < n; w++){
            System.out.print("*");
        }

        System.out.println(" ");
    }
}
