public class unary {
    public static void main(String[] args) {
        // Unary operators are used on a single operand.
        // They include increment (++), decrement (--), positive (+), and negative (-).

        // Example 1: Negative (-) operator
        int x = 5;
        int y = -x;  // Converts the positive value of x to negative
        System.out.println("Using the negative operator:");
        System.out.println("Original value of x: " + x);
        System.out.println("Value of y (-x): " + y);

        // Example 2: Pre-Increment (++a) and Pre-Decrement (--a)
        int a = 7;

        int b = ++a; // Pre-increment: Increments 'a' first, then assigns it to 'b'
        int c = --a; // Pre-decrement: Decrements 'a' first, then assigns it to 'c'

        System.out.println("\nUsing pre-increment and pre-decrement:");
        System.out.println("Value of a after pre-increment (++a): " + b);
        System.out.println("Value of a after pre-decrement (--a): " + c);

        // Example 3: Post-Increment (a++) and Post-Decrement (a--)
        int p = 8;

        System.out.println("\nUsing post-increment:");
        System.out.println("Original value of p: " + p);

        int temp = p++; // Post-increment: Assigns the current value of 'p' to 'temp' first, then increments 'p'
        System.out.println("Value assigned to temp (p++): " + temp);
        System.out.println("Value of p after post-increment: " + p);

        // Resetting p to demonstrate potential confusion with p = p++
        p = 8; // Reset p to its original value
        System.out.println("\nDemonstrating the issue with 'p = p++':");
        p = p++; // Post-increment increments p but assigns the original value of p back to itself
        System.out.println("Value of p after 'p = p++': " + p); // p remains the same

        // Correct usage of post-increment
        System.out.println("\nCorrect usage of post-increment:");
        p = 8; // Reset p again
        System.out.println("Original value of p: " + p);
        p++;
        System.out.println("Value of p after p++: " + p);
    }
}
