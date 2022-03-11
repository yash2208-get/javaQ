import java.util.*;
class com{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        
            int n=a.nextInt();
            int copy=n,sp=0;
            int num=100;
            char a1='A';
            for(int i=1; i<=n; i++ )
            {
                for(int j=1;j<=sp; j++)
                {
                    System.out.print("\t");
                }
                
                for(int col=1;col<=copy; col++)
                {
                    
                    if(i==1 || i==n || i==n/2){
                        System.out.print(num+"\t");
                         num--;         
                    }
                    
                    else{
                        System.out.print(a1+"\t");
                        a1++;                   
                        }
                    
                    
                }
               
                copy--;
                sp++;
             System.out.println();   
            }
    }
}