import java.util.Arrays;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
import javax.print.DocFlavor.STRING;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;

import java.util.Arrays;
/*
  -1+2-3+4-5+6-7+8-9+10-11+12-13+14-15+16
*/

import java.util.Scanner;
class HelloWorld {
public static void main (String[] args) 
  {
    Scanner in=new Scanner(System.in);//-2
    int x=in.nextInt();
    int p=-1;
    for(int i=2;i<=x;i++){
      if(i%2==0){
        p+=i;
      }else{
        p-=i;
      }
    }
    System.out.println(p);
  }
}