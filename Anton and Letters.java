import java.util.*;
class HelloWorld {
public static void main (String[] args) 
  {
    Scanner in =new Scanner(System.in);
    String str=in.nextLine();
    HashSet<Character> set=new HashSet();  
    for(int i=0;i<=str.length()-1;i++){
      set.add(str.charAt(i));
    }
    set.remove('{');
    set.remove('}');
    set.remove(',');
    set.remove(' ');
    System.out.println(set.size());
  }
}