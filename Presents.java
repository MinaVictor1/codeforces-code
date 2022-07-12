import java.util.Arrays;
import java.util.Scanner;
class HelloWorld {
public static void main (String[] args) 
  {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gifts = new int[n+1];
 
        for (int i = 1; i <= n; i++) {
            int b = sc.nextInt();
            gifts[b] = i;
        }
        for (int i = 1; i <= n; i++) {
            System.out.printf(gifts[i] + " ");
        }
  }
}



