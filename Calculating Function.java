import java.util.Scanner;
class HelloWorld {
public static void main (String[] args) 
  {
    Scanner in=new Scanner(System.in);//-2
    Scanner in=new Scanner(System.in);
    long x=in.nextLong();
      if(x%2==0){
        System.out.println(x/2);
      }else{
        x-=1;
        x/=2;
        x+=1;
        System.out.println(-1*x);
      }
  }
}
