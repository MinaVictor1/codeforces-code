import java.util.Arrays;
import java.util.Scanner;
class HelloWorld {
public static void main (String[] args) 
  {
    Scanner in=new Scanner(System.in);
    int x=in.nextInt();
    int y=in.nextInt();
    int v=0;
    int c=0;
    for(int i=1;i<=x;i++){
      int z=in.nextInt();
      if(z<=y){
        v+=1;
      }else{
        c+=2;
      }
    }
    System.out.println(v+c);
  }
}



