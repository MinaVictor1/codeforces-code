import java.util.Arrays;
import java.util.Scanner;
class HelloWorld {
public static void main (String[] args) 
  {
    Scanner in=new Scanner(System.in);
    String y=in.nextLine();
    if(y.contains("0000000")||y.contains("1111111")){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }
  }
}