

// Transpose of a matrix without using another array

import java.util.Scanner;

public class TransposeArray {

    // facing some issues due to object 

    // static void Swap(int x, int y, Object[] arr){
    //     int temp = 0;
    //     temp = arr[x][y];
    //     arr[x][y]=arr[y][x];
    //     arr[y][x]=temp;
    // }

    // static void Transpose(Object[] arr){

    //     for(int i=0;i<arr.length-1;i++){
    //         for( int j=i+1;j<arr[0].length;j++){
    //             Swap(i, j, arr);
    //         }
    //     }
    // }

    static void PrintArray(int[][] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }


    static void Transpose(int[][] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr[0].length;j++){

                // swapping without using other variable

                arr[i][j] = arr[i][j] + arr[j][i];
                arr[j][i] = arr[i][j] - arr[j][i];
                arr[i][j] = arr[i][j] - arr[j][i];
            }
        }

        
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

        Transpose(arr);
        sc.close();

        PrintArray(arr);

    }
}
