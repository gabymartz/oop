import figures.Square;

public class Main {
    public static void main(String[] args) {
        Square sq1 = new Square();
        sq1.setLength(4.85);
        sq1.printSquareProperties();

        Square sq2 = new Square(3.69);
        sq2.printSquareProperties();
    }
}
