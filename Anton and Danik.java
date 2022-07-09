import java.util.Arrays;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.transform.Source;

import java.util.Arrays;

import java.util.Scanner;
class HelloWorld { 
public static void main (String[] args) 
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int A=0;
    int D=0;
    String game=in.next();
    char [] g=game.toCharArray();
    for(int i=0;i<=n-1;i++){
      if(g[i]=='A'){
        A++;
      }else {
        D++;
      }
    }
    if(A>D){
      System.out.println("Anton");
    }else if(A<D){
      System.out.println("Danik");
    }else if(A==D){
      System.out.println("Friendship");
    }
  }
}
