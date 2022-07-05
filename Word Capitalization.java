import java.util.Arrays;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.Arrays;
class HelloWorld { 
public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    char l =Character.toUpperCase(str.charAt(0));
    System.out.print(l);
    for(int i =1;i<=str.length()-1;i++){
      System.out.print(str.charAt(i));
    }
  }
}
