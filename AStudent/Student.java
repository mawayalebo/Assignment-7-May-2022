package AStudent;
//implement a class “student” with the following members. Name of the student. Marks of the student obtained in three subjects.
public class Student {
    String name;
    int marks1;
    int marks2;
    int marks3;
    
    //Function to assign initial values.
    void assign(String n, int m1, int m2, int m3) {
        name = n;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    //Function to compute total average.
    int average() {
        return (marks1 + marks2 + marks3) / 3;
    }

    //Function to display the student's name and the total marks.
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Total marks: " + (marks1 + marks2 + marks3));
    }

    //main function to demonstrate the functioning of the above.
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.assign("John", 90, 90, 90);
        s1.display();
        System.out.println("Average: " + s1.average());
    }

}
