// import java.util.Scanner;   

// wheather a number is present or not in an array

// public class LinearSearch {

//     static boolean Search(int[] arr, int num, int idx){

//         if(arr[idx] == num){
//             return true;
//         }
//         if(idx==arr.length-1){
//             return false;
//         }

//         return Search(arr,num,idx+1);

//     }

//     public static void main(String[] args) {
//         int[] arr = {12, 13, 14, 15, 16, 17};
//         int num = 15;
//         int idx=0;

//         Search(arr, num, idx);

//         if(Search(arr,num,idx)){
//             System.out.print("Yes");
//         }
//         else{
//             System.out.print("No");
//         }

//     }
// }


// how many times the number is present 

public class LinearSearch {

    static int Search(int[] arr, int num, int idx, int i){

        if(arr[idx] == num){
            i++;
        }
        if(idx==arr.length-1){
            return i;
        }

        return Search(arr,num,idx+1,i);

    }

    public static void main(String[] args) {
        int[] arr = {15, 15, 14, 15, 16, 17, 15};
        int num = 15;
        int idx=0;
        int i=0;

        System.out.print(Search(arr, num, idx, i));

        // if(Search(arr,num,idx)){
        //     System.out.print("Yes");
        // }
        // else{
        //     System.out.print("No");
        // }

    }
}