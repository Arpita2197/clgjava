// Q   Sum of first N natural numbers using while loop ..........

 import java.util.Scanner;

 class I1 {

     public static void main(String[] args) {

         Scanner x = new Scanner(System.in);

          System.out.println("Enter a value");

           int N = x. nextInt();

            int sum=0;

        
             while(N<=15) {

                 sum = sum + N;

                 N++;
      
             }

              System.out.println(sum);

           
     }
 }