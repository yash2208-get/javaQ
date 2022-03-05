import java.util.*;
class pattan3{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        
            int n=a.nextInt();
            // int n1=n;
            for(int i=1; i<=n; i++ )
            {   
                int n1=i;
                int nst=n-n1;
                for(int j=1;j<=nst; j++)
                {
                    System.out.print("\t");
                }
                for(int col=1; col<=n1;col++){
                    System.out.print("\t*");
                }
             System.out.println();   
            }
    }
}