
// question: rotate the array right wise by k steps where k can be greater than n 

import java.util.Scanner;

public class ArrayRotation {

    static void RotateArr(int[] arr, int k){
        
        // approach 1 with making array 
        
        // int[] arr2 = new int[arr.length];
        // int move = k%(arr.length);
        // int z=0;

        // for(int i=0;i<move;i++)
        //     arr2[i]=arr[arr.length-move+i];

        // for(int i=move; i<arr.length;i++){
        //     arr2[i]=arr[z];
        //     z++;
        // }

        // approach 2 without making 2nd array *********** LECTURE 21----TIME-> 59:00 ************

        int move = k%(arr.length);
        int j=0;
        for(int i=0;i<(arr.length-move);i++){
            int x=arr[i];
            arr[i]=arr[arr.length-move-1-i];
            arr[arr.length-move-1-i]=x;
        }

        for(int i=arr.length-move;i<arr.length;i++){
            int x=arr[i];
            arr[i]=arr[arr.length-1-j];
            arr[arr.length-1-j]=x;
            j++;
        }
        j=0;
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            arr[i]=arr[arr.length-1-j];
            arr[arr.length-1-j]=x;
            j++;
        }

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array you want: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the value of Array");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the no. of steps you want to rotate: ");
        int k = sc.nextInt();

        RotateArr(arr, k);

        sc.close(); 
    }
}
