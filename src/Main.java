import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the person: ");
        String name = sc.nextLine();
        System.out.print("Enter the age of the person: ");
        int age = sc.nextInt();
        person1.setName(name);
        person1.setAge(age);
        System.out.println("Person1 Name is: "+person1.getName());
        System.out.println("Person1 Age is: "+person1.getAge());


    }
}

/*


        Calculation calculation = new Calculation();
        System.out.println("Please input a number: ");
        int x = sc.nextInt();

        calculation.evenOrOdd(x);

        System.out.println("please input a signed number: ");
        int y = sc.nextInt();
        calculation.positiveOrNegative(y);
        calculation.positiveOrNegative(3);
        calculation.leapYear(2024);*/