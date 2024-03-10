import java.util.Scanner;

public class Box {
    float height;
    float width;

    public static void main(String[] args) {
        Box box1 = new Box();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height: ");
        box1.height = sc.nextFloat();
        System.out.println("Input width: ");
        box1.width = sc.nextFloat();


        System.out.println("Height: "+box1.height);
        System.out.println("Width: "+box1.width);

    }


}
