package day39_EncapsulationAndInheritance.cydeoTask;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, String jobTitle, int employeeId, double salary) {
        super(name, age, gender, jobTitle, employeeId, salary);
    }


    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is teaching to students");
    }
}
