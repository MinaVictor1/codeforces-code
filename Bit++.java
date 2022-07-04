import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
class HelloWorld { 

   public static void main (String[] args) 
   {
      Scanner in =new Scanner(System.in);
      int x=0;
      int n=in.nextInt();
      for(int i=1;i<=n;i++){
         String operation=in.next();
         if(operation.charAt(1)=='+'){
            x++;
         }
         else{
            x--;
         }
      }
      System.out.println(x);
   }  
}