import java.util.Scanner;

public class ArraySeraching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {2,4,6,12,45,9,89,45,89};
        System.out.print("Enter the number you want to search: ");
        int search = sc.nextInt();
        int index = 0;
        while (index <= arr.length-1){
            if(arr[index]== search){
                System.out.println(arr[index] + "index is" + index);
            }
            System.out.println("Number not found");
            index++;
        }
    }
}
