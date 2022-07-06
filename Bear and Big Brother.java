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
    int a=in.nextInt();
    int b=in.nextInt();
    int count =1;
    if(a>b){
      System.out.println("0");
    } 
    for(int i=0;i<=100;i++){
      a=a*3;
      b=b*2;
      if(a>b){
        break;
      }else{
        count++;
      }
    }
    System.out.println(count);
  }
}