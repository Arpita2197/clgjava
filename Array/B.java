 
  // Q take input from user in an array and print them.....

import java.util.Scanner;

class B {


     public static void main(String[] args) {

         Scanner a = new Scanner(System.in);

          System.out.println("enter the size of array");

          int n = a.nextInt();

           int arr[] = new int[n];

            
          System.out.println("enter the value of array");

           for(int i=0;i<n;i++) {

            arr[i] = a.nextInt();

           }

        for(int k=0;k<arr.length;k++) {

             System.out.println(arr[k]);
        }

     }

     
}