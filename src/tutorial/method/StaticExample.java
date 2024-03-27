package tutorial.method;

public class StaticExample {
    static String name = "Eva";
    public int age = 100;

    void nonStatic() {

       //display();
        System.out.println("My name is Momen");
        System.out.println("My age is 25");

    }
    void nonStatic(int age){
        this.age = age;
        System.out.println("Age changes to "+age);
    }
   /* static void display(){
        this.age = age;
        age = 22;
        System.out.println("static age is "+age);
        System.out.println("static name is "+name);
    }*/
     void display(String name){
        StaticExample.name = name;

        System.out.println("Name changed to: "+name);
    }


    public static void main(String[] args) {
        StaticExample obj = new StaticExample();
        obj.nonStatic();
        //display();
        obj.display("Jannathul");
        obj.nonStatic(22);
    }
}
