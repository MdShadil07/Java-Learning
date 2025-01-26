import java.util.Scanner;

public class twoDimensionalArray {
    public static void main(String[] args) {
        System.out.println("This is your array lecture");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number of row: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of col: ");
        int col = sc.nextInt();

        int [][] newArr = new int [row][col]; //initialization of an array

        for(int i =0; i< newArr.length; i++){
          for(int j =0; j<newArr.length; j++){
              System.out.println("Enter the element for position [" + i +"][" + j +"] :");
              newArr[i][j]= sc.nextInt();
          }
        }
        System.out.println("The Entered 2D array is: ");

        for(int i=0; i<newArr.length; i++){
            for(int j=0; j<newArr.length; j++){
                System.out.println(newArr[i][j]);
            }
        }
    }
}

