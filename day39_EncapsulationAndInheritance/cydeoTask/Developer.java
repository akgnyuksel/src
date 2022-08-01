package day39_EncapsulationAndInheritance.cydeoTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, String jobTitle, int employeeId, double salary) {
        super(name, age, gender, jobTitle, employeeId, salary);
    }
    public void fixingBugs(){
        System.out.println(getJobTitle()+" "+getName()+" is fixing the bugs");
    }


    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is developing the application");
    }
}
