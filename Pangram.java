package com.mycompany.mavenproject2;

import java.util.*;

public class Mavenproject2 {

   public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    int x=in.nextInt();
    String str=in.next();
    String str1=str.toLowerCase();
    System.out.println(str1.chars().distinct().count());
    if(str1.chars().distinct().count()==26){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }  
}