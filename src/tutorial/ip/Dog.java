package tutorial.ip;

public class Dog extends Animal{

    public int age;
    public String food;

    void bark(){
        System.out.println("The dog is barking");
    }
    public int setAge(int age){
        this.age = age;
        System.out.println("Age sated to "+age);
        return age;
    }
    public Dog(int age, String food){
        this.age = age;
        this.food = food;
        System.out.println("Dogs age is "+age);
        System.out.println("Dog eats "+food);
    }
    void eat(){
        System.out.println("The dog is eating");
    }
    void eat(String food){
        System.out.println("Dog eat this "+food);
    }

}
