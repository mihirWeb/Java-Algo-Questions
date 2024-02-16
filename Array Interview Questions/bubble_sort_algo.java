import java.util.Scanner;

public class bubble_sort_algo {


    static int[] bubble_sort(int[] arr){

        int n= arr.length;

        for(int i=0; i<n-1; i++){

            boolean flag = false;
            for(int j=0; j<n-1-i; j++){

                if(arr[j]>arr[j+1]){
                    int y = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = y;
                    flag = true;
                }
            }

            if(!flag){
                return;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // int[] sort_arr = new int[n];
        System.out.println("enter array");

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        arr = bubble_sort(arr);

        System.out.println("Sorted array is :-");

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
    
}
