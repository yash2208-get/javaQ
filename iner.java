import java.util.*;
import java.lang.Math;
class iner{

public static void main(String[] args) {
  Scanner sn=new Scanner(System.in);
  int a=sn.nextInt();
 public int pos=1;
  int sum=0;
  while(a != 0)
  {
    int de=a%10;
    // 
    int value= pos * Math.pow(10,de-1);
    sum+=value;
System.out.println(sum);
  }
 }
}