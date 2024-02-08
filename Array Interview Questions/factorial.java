import java.util.Scanner;

public class factorial {

    static int facto(int n){
        if(n==1 || n==0){
            return 1;
        }
        n=n*facto(n-1);
        return n;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int x = facto(n);
        System.out.println(x);

        sc.close();
    }
    
}
