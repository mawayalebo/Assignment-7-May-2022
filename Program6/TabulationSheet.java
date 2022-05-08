package Program6;

class TabulationSheet{
   //A tabulation sheet contains roll numbers and marks of each student for a particular subject
   //This class should have a method for adding the marks and roll no of a student
    private int rollNo;
    private int marks;
    

    public TabulationSheet(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void addMarks(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }


}