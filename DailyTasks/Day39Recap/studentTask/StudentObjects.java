package DailyTasks.Day39Recap.studentTask;

public class StudentObjects {
    public static void main(String[] args) {

        Student student=new Student("Hasan",'F',25,12,"Law","CydeoSchool",'A');

        System.out.println(student);
        student.study();
        student.drink();
        student.eat();
        System.out.println("----------------------------------------------------------------------");

        UndergraduateStudent undergraduateStudent=
                new UndergraduateStudent("Mehmet",'M',29,34245,"Mechanical","ITU",'B' );
        System.out.println(undergraduateStudent);

        System.out.println("-----------------------------------------------------");
        CydeoStudent cydeoStudent=
                new CydeoStudent("Didem",'F',24,98,"SDevelopment","BAU",'B',25,245,"Java");

        cydeoStudent.study();
        cydeoStudent.drink();
        cydeoStudent.eat();
        cydeoStudent.sleep();
        cydeoStudent.setName("Berfin");
        System.out.println(cydeoStudent);

    }
}
