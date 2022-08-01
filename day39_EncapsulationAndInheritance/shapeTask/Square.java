package day39_EncapsulationAndInheritance.shapeTask;

public class Square extends Shape{
    private double side;

    public Square(String name, double side) {
        super(name);
       setSide(side);
    }

    public Square(String name) {
        super(name);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            System.err.println("Invalid side "+side);
            System.exit(1);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
