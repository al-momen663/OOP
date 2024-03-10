public class Calculation {

    int number;

    public Calculation() {
    }

    public void evenOrOdd(int number){

        if(number%2 == 0){
            System.out.println("The number "+number+" you have inputted is an even number ");
        }else {
            System.out.println("The number "+number+" you have inputted is an odd number ");
        }
    }
    public void positiveOrNegative(int number){
        if(number>0) {
            System.out.println("The number " + number + " you have inputted is an positive number ");

        } else {
            System.out.println("The number "+number+" you have inputted is a negative number ");
        }
    }
    public void leapYear(int number) {
        if(number % 4 == 0){
            if(number%100==0) {
                if (number % 400 == 0)
                    System.out.println(number + " Is a leapYear");
                else System.out.println(number+" Is not a leapYear");

            } else System.out.println(number+" Is a leapYear");
        }else {System.out.println(number+" Is not a leapYear");}

    }

}
