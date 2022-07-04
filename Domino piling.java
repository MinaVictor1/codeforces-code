import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
class HelloWorld { 

   public static void main (String[] args) 
   {
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      int area_rectangula=n*k;
      System.out.println(area_rectangula/2);
   }  
}
