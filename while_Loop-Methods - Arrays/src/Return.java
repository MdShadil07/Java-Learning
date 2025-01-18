import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Sum Of number");
//
//        System.out.print("Enter the first number: ");
//        int num1 = input.nextInt();
//        System.out.print("Enter the second number ");
//        int num2 = input.nextInt();
//
//        int sum = num1 + num2;
//        System.out.println(sum);

        // the above code is the normal way of writing there is no return statement;

        //now let's call the method

        sum(5,7);
    }

    public static int sum( int num1,  int num2){
        int sum = num1 + num2;
        System.out.println(sum);
        return sum;  //this is the return statement where the value of sum will be returned on the terminal or console;
    }
}
