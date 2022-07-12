import java.util.Arrays;
import java.util.Scanner;
class HelloWorld { 
public static void main (String[] args) 
  {
    Scanner in=new Scanner(System.in);
    String w1=in.next();
    String w2=in.next();
    int z=0;
    char [] o1=w1.toCharArray();
    char [] o2=w2.toCharArray();
    for(int i=0;i<=o1.length-1;i++){
      for(int j=(o2.length-1)-i;j>=0;j--){
        if(o1[i]==o2[j]){
          z++;
        }else if(o1[i]!=o2[j]){
          break;
        }
        break;
      }
    }
    if(z==o1.length){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
