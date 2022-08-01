package day39_EncapsulationAndInheritance.cydeoTask;



public class Cydeo {
    public static void main(String[] args) {

        Developer developer=new Developer("Hasan",28,'M',"Developer",1234,20000);

        Tester tester=new Tester("Olga",27,'F',"SDET",345,21000);

        Teacher teacher=new Teacher("Daniel",35,'M',"Math Teacher",765,30000);

        Student student=new Student("Ahmet",20,'M',349085,"Enginer");

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(student);

        System.out.println("---------------------------------------------------------");

        developer.setAge(37);

        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("-----------------------------------------------------------");

        developer.work();
        tester.work();
        teacher.work();
        //student.work();has not the that method
        System.out.println("------------------------------------------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();
        System.out.println("----------------------------------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();
        tester.createTicket();

        System.out.println("-----------------------------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();
        //teacher.createTicket();
        teacher.work();

        System.out.println("-----------------------------------------------------------");

        student.eat();
        student.drink();
        student.sleep();
       // student.createTicket();
        student.study();
    }
}
