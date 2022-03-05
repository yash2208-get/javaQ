import java.util.*;
class Main1 
{
  public static void main(String[] args) 
  {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    for(int i=1;i<10;i=i+2)
    {

    }
    if(a>b)
    {
        if(a>c)
        {
            System.out.println("larger number"+a);
        }
        else
        {
            System.out.println("larger number"+c);
        }
    }
    else
    {
        if(b>c)
        {
            System.out.println("larger number"+b);
        }
        else
        {
            System.out.println("larger number"+c);
        }
    }
  }
}