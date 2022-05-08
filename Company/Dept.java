package Company;
//Create a class “Dept” that has a name, location, employees (an array of Employee) and a method to add an employee.
public class Dept {
    
    private String name;
    private String location;
    private Employee[] employees = new Employee[6];

   //accessors
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

   //modifiers
    public void setName(String name) {
         this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    //methods “add” and “remove” to add and remove an employee to/from this department
    public void add(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    public void remove(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == employee) {
                employees[i] = null;
                break;
            }
        }
    }

    //Write a main() function and create “Information Technology” department. Add five employees and print yearly expenditure for this department.
    public static void main(String[] args) {

        Dept dept = new Dept();
        //add dept name
        dept.setName("Information Technology");
        //add dept location
        dept.setLocation("Pretoria");


        //instances of employees
        Employee employee1 = new Employee("Jack", 1, "Mabopane", 85000, "Senior Java developer");
        Employee employee2 = new Employee("Zein", 2, "Garankuwa", 25000, "Junior Java developer");
        Employee employee3 = new Employee("Lebo", 3, "Pretoria", 40000, "React Developer");
        Employee employee4 = new Employee("Jill", 4, "Culinan",  30000 , "UI/UX Designer");
        Employee employee5 = new Employee("Jim", 5, "Pretoria", 20000, "Programmer");

        //add employees to department
        dept.add(employee1);
        dept.add(employee2);
        dept.add(employee3);
        dept.add(employee4);
        dept.add(employee5);

        //print yearly expenditure for this department.
        double totalExpenditure = 0;

        for (int i = 0; i < dept.employees.length; i++) {
            if (dept.employees[i] != null) {
                totalExpenditure += dept.employees[i].getYearlySalary();
            }
        }
        System.out.println("the total yearly expenditure for "+ dept.getName() + " department located at " + dept.getLocation() + " is "+ totalExpenditure);
    }

}
