import java.util.Arrays;
import java.util.Scanner;
class HelloWorld {
public static void main (String[] args) 
  {
    Scanner in=new Scanner(System.in);
    int count=1;
    String y=in.nextLine();
    char [] z=new char[y.length()];
    for(int i=0;i<z.length;i++){
       z[i]=y.charAt(i);
    }
    bre:{
      for(int j=0;j<z.length-1;j++){
        count=1;
        for(int f=j+1;f<z.length;f++){
          if(z[j]==z[f]){
            count++;
          }else{
            break;
          }
          if(count==7){
            break bre;
          }
        }
      }
    }
    if(count==7){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}