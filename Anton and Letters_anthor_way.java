import java.util.*;
class HelloWorld {
public static void main (String[] args) 
  {
    Scanner in =new Scanner(System.in);
    String x=in.nextLine();
    long z=x.chars().distinct().count()-4;
    if(x.length()==3){
      System.out.println("1");
    }else if(z<=0){
      System.out.println("0");
    }else if(z>0){
      System.out.println(z);
    }
  }
}