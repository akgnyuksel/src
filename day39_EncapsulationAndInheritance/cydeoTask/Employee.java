package day39_EncapsulationAndInheritance.cydeoTask;

public class Employee extends Person{
    private String jobTitle;
    private int employeeId;
    private double salary;

    public Employee(String name, int age, char gender, String jobTitle, int employeeId, double salary) {
        super(name, age, gender);
       setJobTitle(jobTitle);
       setEmployeeId(employeeId);
      setSalary(salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+" "+"is working");
    }

    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                '}';
    }
}
