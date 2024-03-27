package tutorial.ip;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Dog dog1 = new Dog(12, "Haddi");
        Dog dog2 = new Dog(0, "");
        dog1.bark();
        dog2.setAge(13);
        dog2.eat();
        dog2.eat("Meat");
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.setAge(1);
        cat2.eat();
        cat1.eat("Biscuit");
    }
}
