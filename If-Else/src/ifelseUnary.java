import java.util.Scanner;

public class ifelseUnary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");

        double num = sc.nextDouble();

//        double v = num > 0 ? num * 3 : 0;
//        System.out.println(v);


        double res = num > 0 ? num-4 : num;  //this is ternary operator used for single argument or condition;
        System.out.println(res);
    }
}
