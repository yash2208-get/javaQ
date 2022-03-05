import java.util.*;
  
   class Main{
  
  public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int num=scn.nextInt();
      int n1=0,n2=1,n3;
      int i=1;
      while ( i<=num ) 
      {
        n3=n1+n2;
        System.out.println(n1);
        n1=n2;
        n2=n3;
        i++;
      }
   }
  }