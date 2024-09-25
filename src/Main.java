import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // корни квадратного уравнения
        // a, b, c
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        //System.out.printf("a="+a);
        double d = b*b - 4*a*c;
        if(d > 0) {
            double x1 = (-b+Math.sqrt(d))/(2*a);
            double x2 = (-b-Math.sqrt(d))/(2*a);
            System.out.printf("x1 = %.2f, x2 = %.2f", x1, x2);
        } else if(d == 0) {
            double x = -b/(2*a);
            System.out.printf("x = %.2f",x);
        } else {
            System.out.print("Not solve!");
        }
    }
}