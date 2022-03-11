import java.util.*;
class p4{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);        
            int n=a.nextInt();
            int sp=0,st=n;
            for(int i=1; i<=n; i++ )
            {   
                for(int j=1;j<=sp; j++)
                {
                    System.out.print("\t");
                }
                for(int x=1; x<=st; x++)
                {
                    System.out.print("*\t");    
                }
                sp++;
                st--;
                System.out.println();   
            }
    }
}