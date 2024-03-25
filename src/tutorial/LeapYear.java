package tutorial;

import java.util.Scanner;

public class LeapYear {
        public static boolean isLeapYear(int year) {
            // A year is a leap year if it is divisible by 4 but not by 100,
            // or if it is divisible by 400.
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input a year: ");
            int year = sc.nextInt();

            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }


