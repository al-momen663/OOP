package tutorial;
public class Student {

    public String name;
    private int id;
    public double result;
    public String section;

    public Student() {
        // A default constructor

    }

    /* creating a store info public method ans passing the pearmeter of name
     result and section*/
    public void storeInfo(String name, double result, String section) {
        this.name = name;
        this.result = result;
        this.section = section;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void showInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + getId());
        System.out.println("Student Result: " + result);
        System.out.println("Student Section: " + section);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        // store info in reference of object
        student1.storeInfo("Eva", 3.92, "A");
        student1.setId(1153);

        student2.storeInfo("Momen", 3.68, "A");
        student2.setId(1154);


        // show output in reference of object and method
        student1.showInfo();
        student2.showInfo();
    }
}

