
import java.util.Scanner;

// question: find all possible pairs in the array whose sum is equal to the given no. x

public class PairSum {

    static void Pairs(int num, int[] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                    if(arr[i]+arr[j]==num){
                        System.out.println("("+ arr[i]+","+arr[j]+")");
                    }
            }
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        int[] arr = new int[10];

        System.out.println("Enter the number x: ");
        num=sc.nextInt();

        System.out.println("Enter the array of 10 numbers: ");
        for(int i=0; i<arr.length; i++)
            arr[i]=sc.nextInt();

        Pairs(num, arr);



        sc.close();



    }
    
}
