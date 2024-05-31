public class Main {
    public static void main(String[] args) {
       printLine(5);
       printLine(10);
       printLine(15);
    }
    public static void printLine(int n){
        for(int i = 0; i < n; i++){
            System.out.println("* ");
        }
        System.out.println(" ");
    }
}
