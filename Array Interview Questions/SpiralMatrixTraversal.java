
//    Print the elements of matrix in spiral traversal 

import java.util.Scanner;

public class SpiralMatrixTraversal {

    static int[] SpiralTraverse(int[][] arr, int r, int c){

        int[] arr2 = new int[r*c];
        // int top_r=0, bottom_r=r-1, left_c=0, right_c=c-1;

        


        return arr2;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimension of array:");
        System.out.println("row: ");
        int r = sc.nextInt();
        System.out.println("column: ");
        int c = sc.nextInt();

        int[][] arr= new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }


        SpiralTraverse(arr, r, c);
        sc.close();

    }
    
}
