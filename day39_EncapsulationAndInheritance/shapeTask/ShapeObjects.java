package day39_EncapsulationAndInheritance.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square=new Square(10);


        System.out.println(square);
        square.setSide(15);
        System.out.println("----------------------------------");

        Rectangle rectangle=new Rectangle(5,6);

        System.out.println(rectangle);

        System.out.println( "------------------------------");



        Circle circle=new Circle(10);

        System.out.println(circle);



    }
}
