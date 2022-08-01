package DailyTasks.Day39Recap.studentTask;

public class GraduateStudent extends Student {
    public GraduateStudent(String name, char gender, int age, int studentID, String fieldOfStudy, String schoolName, char grade) {
        super(name, gender, age, studentID, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        System.out.println(getName()+" "+"graduated");
    }
}
