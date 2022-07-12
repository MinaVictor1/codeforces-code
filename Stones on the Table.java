import java.util.Arrays;
import java.util.Scanner;
class HelloWorld { 
public static void main (String[] args) 
  {
    Scanner in=new Scanner(System.in);
    int x=in.nextInt();
    char []arr=new char[x];
    String str=in.next();
    int count=0;
    for(int i=0;i<x;i++){
      arr[i]=str.charAt(i);
    }
    for(int j=0;j<=x-2;j++){
      for(int y=j+1;y<=j+1;y++){
        if(arr[j]==arr[y]){
          count++;
          break;
        }
      }
    }
    System.out.println(count);
  }
}
