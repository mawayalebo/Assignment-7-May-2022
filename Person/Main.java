package Person;

public class Main {
    public static void main(String[] args) {
        //instance of 5 people
        Person p1 = new Person(20, 70, 1.75, "01/01/2000", "123 Main St");
        Person p2 = new Person(30, 60, 1.75, "01/01/2000", "123 Main St");
        
        //make person 1 a Student
        Student s1 = new Student(p1.getAge(), p1.getWeight(), p1.getHeight(), p1.getDateOfBirth(), p1.getAddress(), 1, new String[] {"Math", "Physics", "Chemistry"}, new int[] {90, 90, 90});

        //make person 2 & 3 a Employee
        Employee e1 = new Employee(p2.getAge(), p2.getWeight(), p2.getHeight(), p2.getDateOfBirth(), p2.getAddress(), 100000, "01/01/2000", 10);
       // Employee e2 = new Employee(p3.getAge(), p3.getWeight(), p3.getHeight(), p3.getDateOfBirth(), p3.getAddress(), 100000, "01/01/2000", 10);
       
        //make Employee 1 Professor
        Professor pf1 = new Professor(e1.getAge(), e1.getWeight(), e1.getHeight(), e1.getDateOfBirth(), e1.getAddress(), e1.getSalary(), e1.getDateOfJoining(), e1.getExperience(), "Math", "John");
        //professor add advisee
        pf1.addAdvisee("mpho");

        //make Employee 2 Technician
        //Technician te1 = new Technician(e2.getAge(), e2.getWeight(), e2.getHeight(), e2.getDateOfBirth(), e2.getAddress(), e2.getSalary(), e2.getDateOfJoining(), e2.getExperience(), "Computer", "Mary");

        //display all details professor 1 
        System.out.println("Professor Deails" );
        System.out.println("Professor 1 age: " + pf1.getAge());
        System.out.println("Professor 1 weight: " + pf1.getWeight());
        System.out.println("Professor 1 height: " + pf1.getHeight());
        System.out.println("Professor 1 date of birth: " + pf1.getDateOfBirth());
        System.out.println("Professor 1 address: " + pf1.getAddress());
        System.out.println("Professor 1 salary: " + pf1.getSalary());
        System.out.println("Professor 1 date of joining: " + pf1.getDateOfJoining());
        System.out.println("Professor 1 experience: " + pf1.getExperience());
        System.out.println("Professor  advisees: " + pf1.getListOfAdvisee());
        //make a space
        System.out.println();
        //display all details of Student 1
        System.out.println("Student Details");
        System.out.println("Student 1 age: " + s1.getAge());
        System.out.println("Student 1 weight: " + s1.getWeight());
        System.out.println("Student 1 height: " + s1.getHeight());
        System.out.println("Student 1 date of birth: " + s1.getDateOfBirth());
        System.out.println("Student 1 address: " + s1.getAddress());
        //display student 1 list of subjects and marks
        //loop through list of subjects
        for (int i = 0; i < s1.getListOfSubjects().length; i++) {
            System.out.println("Student 1 subject: " + s1.getListOfSubjects()[i] + " marks: " + s1.getMarks()[i]);
        }
    } 
    

}
