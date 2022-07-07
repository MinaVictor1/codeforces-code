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
    Scanner in =new Scanner(System.in);
    int x=in.nextInt();
    int count=0;
    if(x<=5){
      System.out.println("1");
    }else{
      while(x>5){
        x-=5;
        count++;
      }
      if(x<5){
        count++;
      }
      else if(x==5){
        count++;
      }
      System.out.println(count);
    }
  }
}
