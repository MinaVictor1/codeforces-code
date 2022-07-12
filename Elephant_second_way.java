import java.util.Arrays;
import java.util.Scanner;
class HelloWorld { 
public static void main (String[] args) 
  {
   Scanner in =new Scanner(System.in);
   int x=in.nextInt();
   if(x%5==0){
    System.out.println(x/5);
   }
   else{
   System.out.println((x/5)+1); 
  }
  }
}
