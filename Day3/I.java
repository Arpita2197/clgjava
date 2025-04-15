 
 
 // Q   Sum of first N natural numbers using for loop ..........

 import java.util.Scanner;

 class I {

     public static void main(String[] args) {

         Scanner x = new Scanner(System.in);

          System.out.println("Enter a value");

           int N = x. nextInt();

            int sum=0;

            for(int i=1;i<=N;i++) {

                sum = sum + i;       
            }

             System.out.println(sum);
     }
 }