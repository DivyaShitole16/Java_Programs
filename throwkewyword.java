import java.util.*;
 public class throwkeyword
{
    void checkAge()
   {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter Your Age");
       int age=s.nextInt();
       if(age<18)
       {
         throw new ArithmeticException("You are not Eligible");
        }
       else
       {
         System.out.println("Access granted- you are old enough!");
       }
   }
        public static void main(String[]arg)
        {
           throwkeyword t= new throwkeyword();
           t.checkAge();
         }
}
