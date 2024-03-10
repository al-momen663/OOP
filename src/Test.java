public class Test {

    int max = 100;   //instance variable
    static int var = 50;    // static variable

    public static void main(String[] args) {
        int a = 10, b = 20;      // local variable
        System.out.println(a + b);
        Test obj = new Test();
        System.out.println(obj.max);
        System.out.println(var);
        sum();
    }
    public static void sum()
    {
        Test obj = new Test();
        System.out.println(obj.max);
        System.out.println(var);
        //System.out.println(a+b);
    }
}

