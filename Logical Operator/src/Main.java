import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //The logical operator are used when there are multiple condition to be satisfied for the result to be true

        //example : num must be greater than 5 and less than 30 -- here we have two condition one can be implemented using the relational operator but the conflict will raises when it comes to 2nd condition

        //Types : AND(&&) , OR (||) ,NOT(!);

        Scanner sc =  new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Are you Female? (true/False");
        boolean isFemale = sc.nextBoolean();

        if(age < 5){
            System.out.println("You got 70% off");
        } else if (age > 60 && !isFemale){ //AND -- when every condition is true than only the result is true otherwise false
            //NOT -- it invert the boolean value here it will invert the ture into false
            System.out.println("You have got 50%off");
        }else if ( isFemale){ //OR -- if any one condition is ture than result will also be true
            System.out.println("You got 30% off");
        }else{
            System.out.println("Invalid");
        }
    }
}


//AND ----- if all the condition is true than only result will be true otherwise false

//like this through Logical operator we can check multiple condition at once----