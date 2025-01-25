public class Array {
    public static void main(String[] args) {
        int [] myArr = new int[7]; // here 7 is the size of an array

        myArr[0]= 98;  // we can assign the value in any order and here the datatype is int so we can
        //insert only integer value
        myArr[1]=8;
        myArr[2]= 9;
        myArr[3]= 90;
        myArr[4]= 78;
        myArr[5]= 68;
        myArr[6]= 38;
//        myArr[7]=48; //this will create an error Array index out of bounds as the size of the array is only 7 and it is accessing the 8 position

//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
//        System.out.println(myArr[5]);
//        System.out.println(myArr[6]);
//        System.out.println(myArr[7]);  //not accessible as the size of the array is only 7


       int index = 0;
       while(index <= myArr.length){
           System.out.println("This is the index " + index + " this is the value " + myArr[index]);
           index++;
       }


    }
}
