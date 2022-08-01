package DailyTasks.Day39Recap.studentTask;

public class Student extends Person {
    private int studentID;
    private String fieldOfStudy, schoolName;
    private char grade;

    public Student(String name, char gender, int age, int studentID, String fieldOfStudy, String schoolName, char grade) {
        super(name, gender, age);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if((fieldOfStudy.isEmpty()||fieldOfStudy.equals(null))){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if((schoolName.isEmpty()||schoolName.equals(null))){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(!(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F')){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        this.grade = grade;
    }

    public void study(){
        System.out.println(getName()+" "+"is studying");
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", studentID=" + studentID +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
/*
2. Create a subclass of Person named Student:
Extra variables:studentId,fieldOfStudy, grade, schoolName
Encapsulate all the fields
Add a constructor that can set all the fields
Condition:
1. filedOfStudy and schoolName should not be set to null
2. filedOfStudy and schoolName should not be empty
3. grade must be valid (A, B, C, D, F)
Extra methods:study()
toString(): name, age,gender, studentId, fieldOfStudy, grade, schoolName should be included

 */