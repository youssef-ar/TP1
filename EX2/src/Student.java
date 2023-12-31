import java.util.ArrayList;

public class Student {
    private int studentID;
    private String firstName;
    private String lastName;
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Student(int ID, String fn, String ln, ArrayList<Course> c) {
        studentID = ID;
        firstName = fn;
        lastName = ln;
        courses = c;
    }

    public int getStudentId() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void enroll(Course c) {
        courses.add(c);
    }
}
