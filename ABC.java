class ABC {

    public static void main(String[] args) {

         int a = 123;

         int sum =0;

 
          while(a>0) {

          

             int temp=a%10;
             sum=sum+temp;
             a =a%10;
          }

           System.out.println(sum);
    }
}