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
    String number = in.next();
    int count=0;
    for(int i=0;i<=number.length()-1;i++){
      if(number.charAt(i)=='4'||number.charAt(i)=='7'){
        count++;
      }
    }
    if(count==7||count==4){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }
}
