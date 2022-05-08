package Program6;

public class MarkSheet {
    //A mark sheet contains marks of all subjects for a particular student.
    //This class should have a method to add name of a student and marks in each subject
    private String name;
    private int[] marks;

    public MarkSheet(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void addMarks(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    //main function
    public static void main(String[] args) {
        //create 3 student objects
        Student s1 = new Student("John", 1, new String[]{"English", "Maths", "Science", "History", "Geography"});
        Student s2 = new Student("Mary", 2, new String[]{"English", "Maths", "Science", "History", "Geography"});
        Student s3 = new Student("Peter", 3, new String[]{"English", "Maths", "Science", "History", "Geography"});

        //, Five “Tabulationsheet” objects for Five subjects
        TabulationSheet t1 = new TabulationSheet(1, 100);
        TabulationSheet t2 = new TabulationSheet(1, 90);
        TabulationSheet t3 = new TabulationSheet(1, 80);
        TabulationSheet t4 = new TabulationSheet(1, 70);
        TabulationSheet t5 = new TabulationSheet(1, 60);

        //5 tabulation sheets for roll no 2 
        TabulationSheet t6 = new TabulationSheet(2, 40);
        TabulationSheet t7 = new TabulationSheet(2, 60);
        TabulationSheet t8 = new TabulationSheet(2, 73);
        TabulationSheet t9 = new TabulationSheet(2, 60);
        TabulationSheet t10 = new TabulationSheet(2, 44);

        //5 tabulation sheets for roll no 3
        TabulationSheet t11 = new TabulationSheet(3, 40);
        TabulationSheet t12 = new TabulationSheet(3, 10);
        TabulationSheet t13 = new TabulationSheet(3, 43);
        TabulationSheet t14 = new TabulationSheet(3, 20);
        TabulationSheet t15 = new TabulationSheet(3, 44);


        //three “Marksheet” object for three students.
        MarkSheet m1 = new MarkSheet("John", new int[]{t1.getMarks(), t2.getMarks(), t3.getMarks(), t4.getMarks(), t5.getMarks()});
        MarkSheet m2 = new MarkSheet("Mary", new int[]{t6.getMarks(), t7.getMarks(), t8.getMarks(), t9.getMarks(), t10.getMarks()});
        MarkSheet m3 = new MarkSheet("Peter", new int[]{t11.getMarks(), t12.getMarks(), t13.getMarks(), t14.getMarks(), t15.getMarks()});

        //print the marksheet of each student
        System.out.println("Marksheet of " + s1.getName());
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Marks: " + m1.getMarks()[0] + ", " + m1.getMarks()[1] + ", " + m1.getMarks()[2] + ", " + m1.getMarks()[3] + ", " + m1.getMarks()[4]);

        System.out.println("Marksheet of " + s2.getName());
        System.out.println("Roll No: " + s2.getRollNo());
        System.out.println("Marks: " + m2.getMarks()[0] + ", " + m2.getMarks()[1] + ", " + m2.getMarks()[2] + ", " + m2.getMarks()[3] + ", " + m2.getMarks()[4]);

        System.out.println("Marksheet of " + s3.getName());
        System.out.println("Roll No: " + s3.getRollNo());
        System.out.println("Marks: " + m3.getMarks()[0] + ", " + m3.getMarks()[1] + ", " + m3.getMarks()[2] + ", " + m3.getMarks()[3] + ", " + m3.getMarks()[4]);
        


        

    }

    
}


