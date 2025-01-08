import java.util.Scanner;

public class Relational {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Eligibility critieria for driving license");

        System.out.print("Enter your age please! ");

        int age = input.nextInt();

        if (age> 18 ){
            System.out.println("you are eligible for Driving license");

        }else {
            System.out.println("You are not eligible ! We Regret");
        }
    }
}
