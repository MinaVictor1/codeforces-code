package com.mycompany.mavenproject2;

import java.util.*;

public class Mavenproject2 {

   public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    int z=in.nextInt();
    int [] x=new int[z]; 
    int [] y=new int[z];
    int count=0;
    for(int h=0;h<=z-1;h++){
      x[h]=in.nextInt();
      y[h]=in.nextInt();
    }
    for(int i=0;i<=z-1;i++){
      for(int j=i+1;j<=z-1;j++){
        if(x[i]==y[j]){
          count++;
        }
        if(y[i]==x[j]){
          count++;
        }
      }
    }
    System.out.println(count);
  }  
}