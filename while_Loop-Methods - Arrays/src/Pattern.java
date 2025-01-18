import javax.crypto.spec.PSource;

public class Pattern {
    public static void main(String[] args) {
        printPattern(30 );
    }

    public static void printPattern(int rowNo){
       int  row = 0;
        while(row < rowNo){
            System.out.print("*");
            int i =0;
            while(i < row){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;

        }

    }
}
