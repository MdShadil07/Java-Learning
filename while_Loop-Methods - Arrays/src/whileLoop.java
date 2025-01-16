import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//
//        int num = 0; //initialization
//
//        while(num < 1000){ // Condition
//            num++; //updating the value
//            System.out.println(num);
//
//        }
        int num = 0;
        while(num<5){
            num = sc.nextInt();
            System.out.println("The Number is: " + num);
            num++;   
        }
    }
}
