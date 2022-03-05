import java.util.*;
class Main
{
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int fac=2; fac * fac<=n ;fac++)
  {
    while(n%fac==0)
    {
      n=n/fac;
      System.out.print(fac+" ");
    }
  }
  if(n!=1){
    System.out.print(n);
  }
 }
}