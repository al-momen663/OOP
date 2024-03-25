package tutorial;

import java.util.Scanner;
public class PrintMultiples {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of N: ");
            int N = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                int result = N * i;
                System.out.printf("%d * %d = %d\n", N, i, result);
            }
        }
}
