package figures;

public class Square {
    private double length;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    //calculate Perimeter
    public double getSquarePerimeter() {
        return this.length * 4;
    }

    //calculate Area
    public double getSquareArea() {
        return (this.length * this.length);
        //return Math.pow(this.length, 2);
    }

    //Print Square Properties
    public void printSquareProperties() {
        System.out.println("*************** Square Properties **************");
        System.out.println("Length: " + length + " [cm]");
        System.out.println("Perimeter: " + getSquarePerimeter() + " [cm]");
        System.out.println("Area: " + getSquareArea() + " [cm2]");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
