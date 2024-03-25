public class Student {

    public String name;
    public int id;
    public double cgpa;
    public String section;
    Student() {
        //default constructor
    }

    public void setData(String name, int id, double cgpa, String section){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.section = section;
    }
    public void display(){
        System.out.println("Student name: "+name);
        System.out.println("Student ID: "+id);
        System.out.println("Student CGPA: "+cgpa);
        System.out.println("Student section: "+section);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        // storing info in reference of object
        student1.setData("Eva", 1153, 3.92, "A");
        student2.setData("Momen", 1154, 3.68, "A");

        student1.display();
        student2.display();

    }
}
