public class explicit {
    public static void main (String[]args){
        int num = 500;
        byte num2 = (byte) num;  //this is explicit conversion here we can observe data loss;
        // we have to explicitly defined the data type for conversion it does not convert automatically;

        System.out.println(num);
        System.out.println(num2);  // here we can see the loss of data because the conversion was from larger datatype to smaller datatype;

    }
}
