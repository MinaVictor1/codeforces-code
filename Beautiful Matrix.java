import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
class HelloWorld { 

   public static void main (String[] args) 
   {
      Scanner in =new Scanner(System.in);
      int count =0;
      int[][] matrix = new int[5][5];
      for(int i=0;i<=4;i++){
         for(int j=0;j<=4;j++){
          matrix[i][j]=in.nextInt();
          while(matrix[i][j]==1){
            count+= (Math.abs(i-2))+(Math.abs(j-2));
            break;
           }
         }
       }  
      System.out.println(count);
   }
}