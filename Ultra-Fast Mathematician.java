import java.util.Arrays;
import java.util.Scanner;
class HelloWorld {
public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    String y= in.next();
    String b= in.next();
    char[]z=y.toCharArray();
    char[]c=b.toCharArray();
    //System.out.println(c[0]);
    for(int i=0;i<=c.length-1;i++){
      if(z[i]==c[i]){
        System.out.print("0");
      }else{
        System.out.print("1");
      }
    }
  }
}