public class Instructor {
    private int instructorId;
    private String firstName;
    private String lastName;
    public Instructor(int ID,String fn,String ln) {
        instructorId=ID;
        firstName=fn;
        lastName=ln;
    }
    public int getInstructorId() {
        return instructorId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}
