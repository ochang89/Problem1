import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        System.out.print("Enter c: ");
        int c = input.nextInt();
        System.out.print("Enter d: ");
        int d = input.nextInt();

        sum(a,b,c,d);
        multiple(a,b,d);
        division(b,d);
        subtraction(b,c);
    }
    public static int sum(int a ,int b, int c, int d)
    {
        int results = a + b + c+ d;
        System.out.println(a+"+"+b+"+"+c +"+"+d+"="+results);
        return results;
    }
    public static void multiple(int a, int b, int d)
    {int results = a * b * d;
        System.out.println(a+"*"+b+"*"+d +"="+results);
    }
    public static void division(int b, int d)
    {double results = (double) d / b;
        System.out.println(d+"/"+b +"="+results);

        }
    public static void subtraction(int b, int c)
    {
        int results =  b-c;
        System.out.println(b+"-"+c +"="+results);
    }
}


