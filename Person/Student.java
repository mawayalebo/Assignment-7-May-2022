package Person;

public class Student extends Person {
    // data members ‘roll’, ‘listOfSubjects’, their marks and methods ‘calculateGrade’
    private int roll;
    private String[] listOfSubjects;
    private int[] marks;

    public Student(int age, double weight, double height, String dateOfBirth, String address, int roll, String[] listOfSubjects, int[] marks) {
        super(age, weight, height, dateOfBirth, address);
        this.roll = roll;
        this.listOfSubjects = listOfSubjects;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String[] getListOfSubjects() {
        return listOfSubjects;
    }

    public void setListOfSubjects(String[] listOfSubjects) {
        this.listOfSubjects = listOfSubjects;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void addMarks(int roll, String[] listOfSubjects, int[] marks) {
        this.roll = roll;
        this.listOfSubjects = listOfSubjects;
        this.marks = marks;
    }

    public void calculateGrade() {
        // calculate the grade of the student
        if (marks[0] >= 90 && marks[1] >= 90 && marks[2] >= 90) {
            System.out.println("Grade: A+");
        } else if (marks[0] >= 80 && marks[1] >= 80 && marks[2] >= 80) {
            System.out.println("Grade: A");
        } else if (marks[0] >= 70 && marks[1] >= 70 && marks[2] >= 70) {
            System.out.println("Grade: B+");
        } else if (marks[0] >= 60 && marks[1] >= 60 && marks[2] >= 60) {
            System.out.println("Grade: B");
        } else if (marks[0] >= 50 && marks[1] >= 50 && marks[2] >= 50) {
            System.out.println("Grade: C+");
        } else if (marks[0] >= 40 && marks[1] >= 40 && marks[2] >= 40) {
            System.out.println("Grade: C");
        } else if (marks[0] >= 30 && marks[1] >= 30 && marks[2] >= 30) {
            System.out.println("Grade: D+");
        } else if (marks[0] >= 20 && marks[1] >= 20 && marks[2] >= 20) {
            System.out.println("Grade: D");
        } else if (marks[0] >= 10 && marks[1] >= 10 && marks[2] >= 10) {
            System.out.println("Grade: E+");
        } else if (marks[0] >= 0 && marks[1] >= 0 && marks[2] >= 0) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
        
    }
    
}
