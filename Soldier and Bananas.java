import java.util.Arrays;
import java.util.Scanner;
class HelloWorld { 
public static void main (String[] args) 
  {
    Scanner in =new Scanner(System.in);
    int banana_price=in.nextInt();
    int money=in.nextInt();
    int n_banana=in.nextInt();
    int x=0;
    for(int i=1;i<=n_banana;i++){
      x+=i;
    }
    int total_price=banana_price*x;
    if((total_price-money)<0){
      System.out.println("0");
    }else{
    System.out.println(total_price-money);
  }
  }
}
