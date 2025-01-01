import javax.naming.OperationNotSupportedException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Shorthand operator are used to short the code when same type of variable are repeated;

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the first number: ");

        int a = Input.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = Input.nextInt();

        //a = a+b; //this is the normal way of doing this;

        //now do the same using the shorthand operator;

        a += b; //Addition Shorthand

        // a -= b; //Subtraction shorthand

       // a *= b; //Multiplication Shorthand

       // a /= b; //Division shorthand

       // a %= b; //Remainder or Module assignment




        System.out.println(a);
    }
}