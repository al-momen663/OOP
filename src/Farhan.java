import java.util.Scanner;

public class Farhan {
    int favourit1;
    int favourit2;
    String name;
    public static void main(String[] args) {

Farhan fh = new Farhan();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        fh.name = input.nextLine();

        System.out.print("Enter your first number: ");
        fh.favourit1 = input.nextInt();

        System.out.print("Enter your second number: ");
        fh.favourit2 = input.nextInt();

        input.close();

        int multiplication = fh.favourit1*fh.favourit2;

        System.out.println("Your inputted name: "+fh.name);
        System.out.println("Sum of two favorite numbers: "+ (fh.favourit1+fh.favourit2) + "\n"+
                            "Multi of two number: "+ multiplication);


    }

}
