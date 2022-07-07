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
    String str=in.next();
    int upper=0;
    int lower=0;
    for(int i=0;i<=str.length()-1;i++){
    if(Character.isUpperCase(str.charAt(i))){
        upper++;
    }else{
        lower++;
    }
   }
   if(lower>=upper){
    System.out.println(str.toLowerCase());
   }else{
    System.out.println(str.toUpperCase());
   }
  }
}
