import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
class HelloWorld { 

   public static void main (String[] args) 
   {
      Scanner in =new Scanner(System.in);
      int x=in.nextInt();
      int z=0;
      for(int i=1;i<=x;i++){
        int y=in.nextInt()+in.nextInt()+in.nextInt();
        if(y==(1+1+0) || y==(1+0+1)){
         z++;
        }else if(y==(1+1+1)){
         z++;
        }
      }
      System.out.println(z);
   }   
}   