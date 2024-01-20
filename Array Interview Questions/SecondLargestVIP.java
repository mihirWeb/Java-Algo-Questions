

// question: find the second largest integer in the given array 

import java.util.Scanner;

public class SecondLargestVIP {

    static void SecLar(int[] arr){
        int largest=Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;
        // int num=0;

        for(int i=0;i<arr.length;i++){

            if(largest<arr[i]){
                second=largest;
                largest=arr[i];
                // num=i;
            } 

            if(second<arr[i] && arr[i]<largest){
                second=arr[i];
            }

        }
        // second=0;
        // for(int i=0;i<arr.length;i++){

        //     if(num==i){
        //         continue;
        //     }

        //     if(second<arr[i]){
        //         second=arr[i];
        //     } 

        // }

        System.out.println(second);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the size of array");
        int x = sc.nextInt();
        int[] arr = new int[x];

        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();

        SecLar(arr);

        sc.close();
    }
    
}
