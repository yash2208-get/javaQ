import java.util.*;
class pattan5{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        
            int n=a.nextInt();
            int number=1;
            // int n1=n;
            for(int i=1; i<=n; i++ )
            {
                int nst=n+1-i;
                for(int j=1;j<=nst; j++)
                {
                    
                    System.out.print("\t"+ number);
                    number++;
                }
             System.out.println();   
            }
    }
}