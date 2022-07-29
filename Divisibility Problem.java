import java.util.*;
class HelloWorld {
public static void main (String[] args) 
  {
    Scanner in =new Scanner(System.in);
    int z=in.nextInt();
    for(int i=1;i<=z;i++){
      int x=in.nextInt();
      int y=in.nextInt();
      if(x%y==0){
        System.out.println("0");
      }else{
        System.out.println(Math.abs((x%y)-y));
      }
    }
  }
}