import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number to check the Remainder: ");

        double num = sc.nextDouble();

        System.out.print("Enter the number for divisible: ");

        double dev = sc.nextDouble();

        if (num % dev != 0){
            double res = num % dev;
            System.out.println(res);
        }else {
            System.out.println("Invalid number");
        }

    }
}
