package Person;

class Person {
    //Person has data members ‘age’, ’weight’, ‘height’, ‘dateOfBirth’, ‘address’ with proper reader/write methods
    private int age;
    private double weight;
    private double height;
    private String dateOfBirth;
    private String address;

    //Write necessary constructor and read/write methods
    public Person(int age, double weight, double height, String dateOfBirth, String address) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
}