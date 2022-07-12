import java.util.Arrays;
import java.util.Scanner;
class HelloWorld {
public static void main (String[] args) 
  {
    
    Scanner in=new Scanner(System.in);
    int student =in.nextInt();
    int time =in.nextInt();
    String queue = in.next();
    char str[]=queue.toCharArray();
    char temp='i';
    for(int h =1;h<=time;h++){
      for(int i=0;i<=str.length-2;i++){
       if(str[i]=='B' && str[i+1]=='G')
        {
          temp=str[i];
          str[i]=str[i+1];
          str[i+1]=temp;
          i++;
        }
      }
    }
    for(int j=0;j<=str.length-1;j++){
       System.out.print(str[j]);
    }
  }
}
