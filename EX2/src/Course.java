public class Course {
    private int courseId;
    private String courseName;
    private Instructor instructor;
    public Course(int ID,String cn, Instructor i) {
        courseId=ID;
        courseName=cn;
        instructor=i;
    }
    public int getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public Instructor getInstructor() {
        return instructor;
    }
}
