import java.util.Arrays;
import java.util.Scanner;
class HelloWorld { 
public static void main (String[] args) 
  {
    Scanner in=new Scanner(System.in);
    int x =in.nextInt();
    int y=in.nextInt();
    for(int i =1;i<=y;i++){//510
      if(x%10==0){
        x/=10;
      }else{
        x-=1;
      }
    }
    System.out.println(x);
  }
}
