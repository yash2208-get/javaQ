import java.util.*;
class Main{    
    public static void main(String[] args) {
      Scanner sr=new Scanner(System.in);
      int num=sr.nextInt();
      int temp=1;
      int copy=num;
      while(copy>9)
      {
        copy=copy/10;
        temp=temp*10;
        
      }  
      // temp=temp/10;
      while(temp!=0)
      {
        int de=num/temp;
        System.out.println(de);
        num=num%temp;
        temp=temp/10;
      }
       
     }
    }