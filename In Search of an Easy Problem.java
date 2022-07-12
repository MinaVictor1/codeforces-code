import java.util.Arrays;
import java.util.Scanner;
class HelloWorld {
public static void main (String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int v=0;
    for(int i=1;i<=n;i++){
        int z=sc.nextInt();
        if(z==1){
            v++;
        }
    }
    
    if(v>0){
        System.out.println("HARD");
    }else{
        System.out.println("EASY");
    }
  }
}
