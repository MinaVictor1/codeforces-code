import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
class HelloWorld { 

   public static void main (String[] args) 
   {
      Scanner in =new Scanner(System.in);
      int x=in.nextInt();
      for(int i=0;i<=x;i++){
         String str=in.nextLine();
         if(str.length()>=5){
            System.out.print(str.charAt(0));
            System.out.print(str.length()-2);
           System.out.println(str.charAt(str.length()-1));
         }else{
            System.out.println(str);
         }

      }
   }   
}   