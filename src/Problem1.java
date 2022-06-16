import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        //Create scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        System.out.print("Enter c: ");
        int c = input.nextInt();
        System.out.print("Enter d: ");
        int d = input.nextInt();

        // Call methods
        sum(a,b,c,d);
        multiple(a,b,d);
        division(b,d);
        subtraction(b,c);
    }
    // Define sum, multiple, division and subtraction methods
    public static void sum(int a ,int b, int c, int d)
    {
        int results = a + b + c+ d;
        System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + results);
    }
    public static void multiple(int a, int b, int d)
    {
        int results = a * b * d;
        System.out.println(a + "*" + b + "*" + d + "=" + results);
    }
    public static void division(int b, int d)
    {
        double results = (double) d / b;
        System.out.println(d + "/" + b + "=" + results);
    }
    public static void subtraction(int b, int c)
    {
        int results =  b-c;
        System.out.println(b + "-" + c + "=" + results);
    }
}


