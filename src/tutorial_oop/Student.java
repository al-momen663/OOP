package tutorial_oop;

import java.util.Scanner;

public class Student extends Person {
    private int id;
    private double cgpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public static void display(Person person, Student student) {
        System.out.println("Student name is: "+person.getName());
        System.out.println("Student age is: "+person.getAge());
        System.out.println("Student id is: "+student.getId());
        System.out.println("Student cgpa is: "+student.getCgpa());
    }
    public static void main(String[] args) {

        Person person = new Person();
        Student student = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        person.setName(sc.nextLine());

        System.out.print("Enter the age of student: ");
        person.setAge(sc.nextInt());

        System.out.print("Enter the ID: ");
        student.setId(sc.nextInt());

        System.out.print("Enter the cgpa: ");
        student.setCgpa(sc.nextDouble());

        display(person, student);

    }
}
