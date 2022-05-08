package Person;

public class Technician extends Employee {
    // data members ‘courses’, ‘listOfAdvisee’ and their add/remove methods
    private String courses;
    private String listOfAdvisee;

    public Technician(int age, double weight, double height, String dateOfBirth, String address, double salary, String dateOfJoining, int experience, String courses, String listOfAdvisee) {
        super(age, weight, height, dateOfBirth, address, salary, dateOfJoining, experience);
        this.courses = courses;
        this.listOfAdvisee = listOfAdvisee;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getListOfAdvisee() {
        return listOfAdvisee;
    }

    public void setListOfAdvisee(String listOfAdvisee) {
        this.listOfAdvisee = listOfAdvisee;
    }

    
}
