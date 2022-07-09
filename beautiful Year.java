import java.util.Arrays;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
import javax.print.DocFlavor.STRING;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;

import java.util.Arrays;

import java.util.Scanner;
class HelloWorld {
public static void main (String[] args) 
  {
    Scanner in=new Scanner(System.in);
    int year=in.nextInt();
    int count=0;
    brea:{
      for(int i=0;i<=9000;i++){
      count=0;
      year++;
      String x= Integer.toString(year);
      for(int j=0;j<=2;j++){
        for(int z=j+1;z<=3;z++){
          if(x.charAt(j)!=x.charAt(z)){
            count++;
          }
          if(count==6){
            System.out.println(year);
            break brea;
          }
        {
      }
     }
    }
   }
  }
 }
}



