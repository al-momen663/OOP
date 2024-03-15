package tutorial;
public class Student {

    public String name;
    private int id;
    public double result;
    public String section;

    public Student(String name, int id, double result, String section) {
        this.name = name;
        this.id = id;
        this.result = result;
        this.section = section;
    }

    public void storeInfo(String name, int id, double result, String section) {
        this.name = name;
        this.id = id;
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
        System.out.println("Student ID: " + id);
        System.out.println("Student Result: " + result);
        System.out.println("Student Section: " + section);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Eva", 1153, 3.92, "A");
        Student student2 = new Student("Momen", 1154, 3.68, "A");

        student1.showInfo();
        student2.showInfo();
    }
}

