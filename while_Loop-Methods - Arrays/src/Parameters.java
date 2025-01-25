public class Parameters {
    /* parameters are the value that a function or method takes */
public static int square(int n){ // here the int n is the parameters and a function can take multiple parameters
    int res = n*n;
    System.out.println("The Square is :" + res);
    return res;
}
    public static void main(String[] args) {
        square(8); //this is the calling of the method or function 
    }
}
