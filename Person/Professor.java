package Person;

public class Professor extends Employee {
    // data members ‘courses’, ‘listOfAdvisee’ and their add/remove methods
    private String courses;
    private String listOfAdvisee;

    public Professor(int age, double weight, double height, String dateOfBirth, String address, double salary, String dateOfJoining, int experience, String courses, String listOfAdvisee) {
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

   //add/remove methods
    public void addCourse(String course) {
        this.courses = this.courses + "," + course;
    }
    //add advisee
    public void addAdvisee(String advisee) {
        this.listOfAdvisee = this.listOfAdvisee + "," + advisee;
    }

    //remove advisee
    public void removeAdvisee(String advisee) {
        this.listOfAdvisee = this.listOfAdvisee.replace(advisee, "");
    }
}
