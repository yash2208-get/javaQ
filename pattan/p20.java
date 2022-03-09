import java.util.*;
class pttan20{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        
            int n=a.nextInt();
            // int n1=n;
            for(int i=1; i<=n; i++ )
            {   
                for(int j=1; j<=n; j++)
                {
                    if(j==1 || j==n)
                    {
                        System.out.print("*\t");
                    }
                    else if (i==j || i+j==n+1){
                        if(i>=n/2+1)
                        {
                            System.out.print("*\t");
                        }
                        else
                        {
                            System.out.print("\t");
                        }
                        
                    }

                    else
                    {
                            System.out.print("\t");
                        
                    }
                    
                }
             System.out.println();   
            }
    }
}