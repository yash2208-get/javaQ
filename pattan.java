import java.util.*;
class pattan{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        
            int n=a.nextInt();
            for(int i=1; i<=n;i++)
            {
                for(int j=0;j<i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        
    }
}