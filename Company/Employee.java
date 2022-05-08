package Company;

public class Employee {
    //containing information name, id, address, salary
    private String name;
    private int id;
    private String address;
    private double salary;

    //Write necessary constructor and read/write methods
    public Employee(String name, int id, String address, double salary) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
 
}
