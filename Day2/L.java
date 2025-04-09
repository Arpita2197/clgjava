class L {

     //Q12  check whether a number is prime or not....


   public static void main(String[] args) {

       int num =100;
       int count=0;

        for(int i=2; i<=num; i++) {

            if(num % i==0) {

                 count++;

            }        
     }

             if(count==1) {

                   System.out.println("number is a prime number");

             }


           else {

                      System.out.println("number is not  a prime number");
                  
              }
        
   }
       
}