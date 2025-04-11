
 // make a calculator....

 import java.util.Scanner;

 class D {

     public static void main(String[] args) {

         Scanner z = new Scanner(System.in);

          System.out.println("enter a first number");

           int a = z. nextInt();

            System.out.println("enter a first number");

             int b = z.nextInt();

             System.out.println("enter a operator");

              char ch = z.next().charAt(0);

               switch(ch) {

                 case '+' : System.out.println(a+b);

                   break;

                     case '-' : System.out.println(a-b);

                   break;

                     case '*' : System.out.println(a*b);

                   break;

                     case '/' : System.out.println(a/b);

                   break;

                    default : System.out.println("nothing");

                   break;
               }


     }
 }