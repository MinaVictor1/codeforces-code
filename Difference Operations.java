import java.util.*;
class HelloWorld {
public static void main (String[] args) 
  {
    Scanner in =new Scanner(System.in);
    int x=in.nextInt();
    for(int i=1;i<=x;i++){
      int y=in.nextInt();
      int [] z=new int[y];
      boolean fact=true;
      for(int g=0;g<y;g++){
        z[g]=in.nextInt();
      }
      for(int j=1;j<y;j++){
        if(z[j]%z[0]!=0)
            fact=false;
      }
      if(fact){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
  }
}
