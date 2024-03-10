public class Person {
    private String name; 
    // Private variables to restrict direct access

    private int age;
    // Public getter and setter methods for controlled access

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
}

