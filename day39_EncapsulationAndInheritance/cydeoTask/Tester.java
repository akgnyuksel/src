package day39_EncapsulationAndInheritance.cydeoTask;

public class Tester extends Employee {


    public Tester(String name, int age, char gender, String jobTitle, int employeeId, double salary) {
        super(name, age, gender, jobTitle, employeeId, salary);
    }

    public void createTicket(){
        System.out.println(getJobTitle()+" "+getName()+" is creating ticket");
    }


    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is testing application");
    }
}
