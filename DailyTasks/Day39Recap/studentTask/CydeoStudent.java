package DailyTasks.Day39Recap.studentTask;

public class CydeoStudent extends Student{
    private int batchNumber;
    private int groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, char gender, int age, int studentID, String fieldOfStudy, String schoolName, char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, gender, age, studentID, fieldOfStudy, schoolName, grade);
       setBatchNumber(batchNumber);
       setGroupNumber(groupNumber);
       setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }
    public void setBatchNumber(int batchNumber) {
        if(batchNumber<=0){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }
    public void setGroupNumber(int groupNumber) {
        if(groupNumber<=0){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage) {
        if((programmingLanguage.isEmpty()||programmingLanguage.equals(null))){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" "+"is eating");
    }

    @Override
    public void drink() {
        System.out.println(getName()+" "+"is drinking");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" "+"is sleeping");
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", studentID=" + getStudentID() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", schoolName='" + getSchoolName() + '\'' +
                ", grade=" + getGrade() +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
