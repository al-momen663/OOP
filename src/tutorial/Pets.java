package tutorial;

public class Pets {

    public String color;
    public int weight;
    public String activity;

    Pets() {
        color = "White";
        activity = "Sitting";

    }

     Pets(String color, String activity) {
        this.color = color;
        this.activity = activity;
    }
    Pets(String color) {
        this.color = color;
        activity = "Sitting";
    }

    public void printPets(){
        System.out.println(color+ " Cat is " +activity);
    }
    public void updateInfo(int weight){
        this.weight = weight;
        System.out.println(color+" Cat's weight is now "+weight+" kg");
    }
    public void updateInfo(String color, String activity){
        this.color = color;
        this.activity = activity;
    }
    public void updateInfo(String color){
       this.color = color;
    }
    public static void main(String[] args) {

        Pets cat1 = new Pets();
       Pets cat2 = new Pets("Brown", "Jumping");
       Pets cat3 = new Pets("Black");

       cat1.printPets();
       cat2.printPets();
       cat3.printPets();
       cat1.updateInfo("Gray");
       cat2.updateInfo(10);
       cat3.updateInfo("Cinnamon", "Eating");
       cat1.printPets();
       cat3.printPets();



    }
}

/*
public class Pets {

    public String name;
    public String color;
    public int weight;
    public String activity;

    public Pets(String color, String activity) {
        this.color = color;
        this.activity = activity;
    }
    public Pets(String color) {
        this.color = color;
        activity = "Sitting";
    }
    public Pets() {
        color = "White";
        activity = "Sitting";

    }
    public void printPets(){
        System.out.println(color+ " dog is " +activity);
    }
    public void updateInfo(int weight){
        this.weight = weight;
        System.out.println(color+" dog's weight is now "+weight+" kg");
    }
    public void updateInfo(String color, String activity){
        this.color = color;
        this.activity = activity;
    }
    public void updateInfo(String color){
       this.color = color;
    }
    public static void main(String[] args) {

        Pets dog1 = new Pets();
        Pets dog2 = new Pets("Brown", "Jumping");
        Pets dog3 = new Pets("Black");

        dog1.printPets();
        dog2.printPets();
        dog3.printPets();
        dog1.updateInfo("Gray");
        dog2.updateInfo(10);
        dog3.updateInfo("Cinnamon", "Eating");
        dog1.printPets();
        dog3.printPets();

    }
}
*/