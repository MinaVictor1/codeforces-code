import java.util.Arrays;
import java.util.Scanner;
class HelloWorld {
public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    int x=in.nextInt();
    for(int i=1;i<=x;i++){
      if(i%2==0){
        System.out.print("I love ");
      }else{
        System.out.print("I hate ");
      }
      if(i!=x){
        System.out.print("that ");
      }else{
        System.out.print("it ");
      }
    }
  }
}