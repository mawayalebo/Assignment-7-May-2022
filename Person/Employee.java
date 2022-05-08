package Person;
//Employee will have additional data member ‘salary’, ‘dateOfJoining’, ‘experience’ 
public class Employee extends Person {
    private double salary;
    private String dateOfJoining;
    private int experience;

    public Employee(int age, double weight, double height, String dateOfBirth, String address, double salary, String dateOfJoining, int experience) {
        super(age, weight, height, dateOfBirth, address);
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    
    
}
