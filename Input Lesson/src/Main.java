import java.util.Scanner; //this is the predefined classes written by java within util there are lot of classes but we are using the Scanner class


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Scanner class help to take input from the user
        System.out.println("Enter your name\n");
        String name = sc.nextLine();  //here nextLine() specifies the datatype , if we want to take integer value from the user than we shoud use nextInt()..each dataType has it's own way to call
        // we will cover that later
        System.out.println(name);

    }
}