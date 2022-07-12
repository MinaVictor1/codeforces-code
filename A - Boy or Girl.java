import java.util.Arrays;
import java.util.Scanner;
class HelloWorld { 
public static void main (String[] args) 
  {
    Scanner in =new Scanner(System.in);
    String str=in.next();
    int count=0;
    for(int i=0;i<=str.length()-2;i++){
      for(int j=i+1;j<=str.length()-1;j++){
        if(str.charAt(i)==str.charAt(j)){
          count++;
        }
      }
    } 
    int x=str.length()-count;
    if(x%2==0){
      System.out.println("CHAT WITH HER!");
    }else{
      System.out.println("IGNORE HIM!");
    }
    
  }
}
