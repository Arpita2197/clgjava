

  // using switch case and taking input from users ........print monday to sunday.....


   
    import java.util.Scanner;

class B {

   public static void main(String[] args) {

      Scanner x = new Scanner(System.in);
  
          System.out.println("enter a value : ");

          int a =  x. nextInt();
  

         switch(a) {

             case 1 : System.out.println("Monday");

               break;

               case 2 : System.out.println("Tueday");

                break;

                 case 3 : System.out.println("Wednesday");

               break;

                     case 4 : System.out.println("Thursday");

               break;
        
                      case 5 : System.out.println("Friday");

               break;
 
                    case 6 : System.out.println("Satuday");

               break;

                     case 7 : System.out.println("Sunday");

               break;

                 default : System.out.println("Not a Day");


                
                
                

         }
        
   }

     
}