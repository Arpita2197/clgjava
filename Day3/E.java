

 // enter a input from user and then write its spelling...

 import java.util.Scanner;
 
 class E {

 
    public static void main(String[] args) {

         Scanner a = new Scanner(System.in);

          System.out.println("Enter a number");

           int x = a.nextInt();

            switch(x) {

                 case 1 : System.out.println("One");

                  break;

                    case 2 : System.out.println("Two");

                  break;

                    case 3 : System.out.println("Three");

                  break;

                    case 4 : System.out.println("Four");

                  break;

                    case 5 : System.out.println("Five");

                  break;

                    case 6 : System.out.println("Six");

                  break;

                    case 7 : System.out.println("Seven");

                  break;


                    case 8 : System.out.println("Eight");

                  break;


                    case 9 : System.out.println("Nine");

                  break;


                   default : System.out.println("nothing");
            }
    }


 }