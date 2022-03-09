import java.util.*;
class pattan3{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        
            int n=a.nextInt();
            int nsp=n-1;
            int nst=1;
            for(int i=1; i<=n; i++ )
            {   
                for(int j=1;j<=nsp; j++)
                {
                    System.out.print("\t");
                }
                for(int col=1; col<=nst;col++)
                {
                    System.out.print("*\t");
                }
                nsp--;
                nst++;
             System.out.println();   
            }
    }
}