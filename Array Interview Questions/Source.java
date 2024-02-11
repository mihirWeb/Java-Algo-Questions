// import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class Source {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read three integers from STDIN
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Call the function to generate structures
        printStructures(a);
        printStructures(b);
        printStructures(c);
    }

    // Function to generate and print the structures
    public static void printStructures(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
