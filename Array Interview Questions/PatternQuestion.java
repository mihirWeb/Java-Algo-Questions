import java.util.Scanner;

public class PatternQuestion{
    public static void main(String[] args) {
        

        // question 1
        // print the no. of digits in a number

        Scanner sc =  new Scanner(System.in);
        // System.out.print("Enter the number to count the :- ");

        // long number = sc.nextLong();
        // int digit=1;

        // while(number/10!=0){
        //     digit++;
        //     number = number/10;
        // }

        // System.out.println("The no. of digits is :- "+ digit);



        // question 2
        // reverse the digit of a number

        // long reverse=0;
        // int i=0;

        // while(number>0){
        //     reverse= reverse*10 + (number%10);
        //     if(reverse==0){
        //         i++;
        //     }
        //     number=number/10;
        // }
        
        // System.out.print("The reverse no. is:- ");

        // for(int x=0; x<i; x++){
        //     System.out.print(0);
        // }
        // System.out.println(reverse);



        // question 3
        // find the sum of the series S = 1-2+3-4+5....n 

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int a=0;
        int b=0;
        int sum=0;

        for(int x=1; x<=n; x++){
            if(x%2==0){
                a+=x;
            }
            else{
                b+=x;
            }
        }

        sum=b-a;

        System.out.println("The sum of series:- "+ sum);




        // question 4
        // print the border of a square
        // i am using the above value of n for this

        for(int x=1; x<=n; x++){
            if(x==1 || x==n){
                for(int y=1; y<=n;y++){
                    System.out.print("*");
                }
                System.out.println("");

            }
            else{
                for(int y=1; y<=n; y++){
                    if(y==1 || y==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    
                    }
                }
                System.out.println("");
            }
        }

        sc.close();



        // question 5
        // numerical rectangular pattern like  123456
                                         //    234561
                                         //    345612
                                         //    ....


        for(int x=1;x<=n;x++){
            int z=x;
            int z2=1;
            for(int y=1; y<=n; y++){
                
                if(z<=6){
                    System.out.print(z);
                    z++;
                }
                else{
                    System.out.print(z2);
                    z2++;

                }
            }
            System.out.println("");
        }






    }
}