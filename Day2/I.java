class I {

     //Q9  check if a year is leap year

      //solution  ==  Leap year ==  4 sa divisible , (400 is divisible ho aur tab hee 100 is divisible na ho.....)

      public static void main(String[] args) {

         int year = 2025;

          if (year % 4==0  && ( year % 100 != 0 || year % 400 == 0)) {

             System.out.println("Year is leap year");

          }

           else {

             System.out.println("Year is not a Leap year");

           }

           

          
      }
     
     
}