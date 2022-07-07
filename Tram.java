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
    int x =in.nextInt();
    int m=0;
    int n=0;
    for(int i=1;i<=x;i++){
     int y=in.nextInt();
     int z=in.nextInt();
     m+=z-y;
     if(m>n){
        n=m;
     }
    }
    System.out.println(n);
  }
}
