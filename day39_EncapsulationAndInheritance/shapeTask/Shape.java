package day39_EncapsulationAndInheritance.shapeTask;

public class Shape {
    public Shape(String name) {
       setName(name);
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.err.println("Name can not be null");
            System.exit(1);//sometthing went wrong
        }
        if(name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }
    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }

  @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
