import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
class HelloWorld { 
public static void main (String[] args) 
   {
     Scanner in =new Scanner(System.in);
     String str =in.next();
     String str1 =in.next();
     int compare = str.compareToIgnoreCase(str1);
     if(str.equalsIgnoreCase(str1)){
      System.out.println("0");
     }else if(compare>0){
      System.out.println("1");
     }else if(compare<0){
      System.out.println("-1");
     }
   }
}