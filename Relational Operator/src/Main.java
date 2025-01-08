import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //relational operator are the programming language constructs used to compare two entities and determine the relationship between them
        //These operator generally evaluate the true or false value ex , == , === , >= , <= , != , !==

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");

        double num = sc.nextDouble();

        if(num == 8){  //equal to comparison
            System.out.println("Your number is equal to : " + num);
//
//        }else if (num != 0) {  //not equal to comparison
//            System.out.println(num);
        } else if(num > 90){  //greater than comparison
            System.out.println("You have entered the greator number :" + num);
        }
        else{
            System.out.println("invalid number");
        }
    }
}


//if the condition is not satisfied the code will return false and the block of code won't run