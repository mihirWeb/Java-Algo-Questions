
// question: a non-decreasing sorted array is given now return the array of the square of elements in non-decreasing order

import java.util.Scanner;

public class SquareSort{

    // try to do it with only one array but didnt satisfy the condition -10,-4,-1,2,8,16

    // static void sortWithSquare(int[] arr){

    //     int i=0, k=0; 
    //     int j=arr.length-1;
    //     arr[i]=arr[i]*arr[i];
        
    //     while(i!=j){
        
    //         if(arr[i] >= arr[j]*arr[j]){
    //             k=arr[i];
    //             arr[i]=arr[j]*arr[j];
    //             arr[j]=k;
    //             j--;
    //         }
    //         else if(arr[i] <= arr[j]*arr[j]){
    //             arr[j]=arr[j]*arr[j];
    //             j--;
    //         }
    //     }

    //     System.out.println("The new array is: ");
    //     for(int x=0;x<arr.length;x++)
    //     System.out.println(arr[x]);
    // }




    // with 2 array

     static void sortWithSquare(int[] arr){

        int i=0, k=0; 
        int j=arr.length-1;
        // arr[i]=arr[i]*arr[i];

        int[] arr2 = new int[arr.length];
        
        while(i<=j){
        
            if(arr[i]*arr[i] >= arr[j]*arr[j]){
                arr2[k++]=arr[i]*arr[i];
                i++;
            }
            else if(arr[i]*arr[i] < arr[j]*arr[j]){
                arr2[k++]=arr[j]*arr[j];
                j--;
            }

            // if(i==j){
            //     arr2[k]=arr[i]*arr[i];
            // }
        }

        System.out.println("The new array is: ");
        for(int x=arr2.length-1;x>=0;x--)
        System.out.println(arr2[x]);
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array in non-decreasing order");

        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();

        sortWithSquare(arr);
        sc.close();
    }
}
