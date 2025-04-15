// Q   Sum of first N natural numbers using while loop ..........

 import java.util.Scanner;

 class I2 {

     public static void main(String[] args) {

         Scanner x = new Scanner(System.in);

          System.out.println("Enter a value");

           int N = x. nextInt();

            int sum=0;

            int i=1;

        
             while(i<=N) {

                 sum = sum + i;

                 i++;
      
             }

              System.out.println(sum);

           
     }
 }