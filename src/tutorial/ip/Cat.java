package tutorial.ip;

public class Cat extends Animal{
    int age;
    String food;
    public Cat(){
        System.out.println("Cat is meowing");
    }
    public int setAge(int age){
        this.age = age;
        System.out.println("Age sated to "+age);
        return age;
    }
    void eat(){
        System.out.println("The cat is eating");
    }
    void eat(String food){
        System.out.println("Cat eats "+food);

    }
}
