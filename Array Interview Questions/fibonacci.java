import java.util.Scanner;

public class fibonacci {

    static int fibo(int n){

        if(n==1 || n==0){
            // System.out.println(1);
            return n;
        }
        else if(n==0){
            // System.out.println(0);
            return 0;
        }
        else{
            int x = fibo(n-1) + fibo(n-2);
            // System.out.println(x);
            return x;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        for(int i = 0; i<n;i++)
            System.out.println(fibo(i));
            
        sc.close();
    }

}
