import java.util.Arrays;
import java.util.Scanner;
class HelloWorld {
public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    int [] x=new int[4];
    int count=0;
    for(int i=0;i<=x.length-1;i++){
      x[i]=in.nextInt();
    }
    for(int j=0;j<=x.length-2;j++){
      for(int f=j+1;f<=x.length-1;f++){
        if(x[j]==x[f]){
          count++;
          break;
        }
      }
    }
    System.out.println(count);
  }
}