import java.util.Arrays;
import java.util.Scanner;

class HelloWorld {
public static void main (String[] args) 
  {
    Scanner in=new Scanner(System.in);//-2
    double x=in.nextInt();
    double y;
    double count=0;
    for(int i=1;i<=x;i++){
      y=in.nextInt();
      count+=(y/100);
    }
    System.out.println((count/x)*100);
  }
}