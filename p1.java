import java.util.*;
class pattan1{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        
            int n=a.nextInt();
            // int n1=n;
            for(int i=1; i<=n; i++ )
            {
                int nst=n-i;
                for(int j=1;j<=nst; j++)
                {
                    System.out.print("* ");
                }
             System.out.println();   
            }
    }
}