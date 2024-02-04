

// question: find the unique number in the given array 

import java.util.Scanner;

public class UniqueArray {

    static void UniqueNumbers(int[] arr) {

        System.out.println("The unique list of elements is: ");
        for (int i = 0; i < arr.length; i++) {
            int x=0;
            for (int j = 0; j < arr.length; j++) {

                if (i == j) {
                    continue;
                }
                if (arr[i] == arr[j]) {
                    break;
                }
                x++;
                if (x == arr.length-1) {
                    System.out.println(arr[i]);
                }

            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array you want: ");
        int x = sc.nextInt();

        int[] arr = new int[x];

        System.out.println("Enter the value of Array");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        UniqueNumbers(arr);

        sc.close();

    }

}
