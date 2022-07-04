import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
class HelloWorld { 

   public static void main (String[] args) 
   {
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      int count=0;
      int a[]=new int[n];
      for(int i=0;i<=n-1;i++){
         a[i]=in.nextInt();
      }
      for(int x=0;x<=n-1;x++){
         if(a[x]>=a[k-1]&&a[x]>0){
            count++;
         }
      }
      System.out.println(count);
   }  
}
