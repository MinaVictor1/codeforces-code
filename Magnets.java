import java.util.Arrays;
import java.util.Scanner;
class HelloWorld {
public static void main (String[] args) 
  {
    Scanner in =new Scanner(System.in);
    int x=in.nextInt();
    int [] y=new int[x];
    int count=0;
    for(int i=0;i<=y.length-1;i++){
      y[i]=in.nextInt();
    }
    for(int j=0;j<=y.length-2;j++){
      if(y[j]!=y[j+1]){
        count++;
      }
    }
    System.out.println(count+1);
  }
}
