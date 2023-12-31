import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create instructors
        Instructor instructor1 = new Instructor(1, "John", "Doe");
        Instructor instructor2 = new Instructor(2, "Jane", "Smith");

        // Create courses
        Course course1 = new Course(101, "Introduction to Programming", instructor1);
        Course course2 = new Course(202, "Data Structures", instructor2);

        // Create students
        Student student1 = new Student(1001, "Alice", "Johnson", new ArrayList<>());
        Student student2 = new Student(1002, "Bob", "Smith", new ArrayList<>());

        // Enroll students in courses
        student1.enroll(course1);
        student1.enroll(course2);
        student2.enroll(course1);

        // Display student information
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Name: " + student1.getFirstName() + " " + student1.getLastName());
        System.out.println("Courses enrolled:");

        for (Course course : student1.getCourses()) {
            System.out.println("  Course ID: " + course.getCourseId());
            System.out.println("  Course Name: " + course.getCourseName());
            System.out.println("  Instructor: " + course.getInstructor().getFirstName() + " " + course.getInstructor().getLastName());
            System.out.println();
        }

        System.out.println("------------------------------");
    }



}