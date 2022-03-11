import java.util.*;
class co{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        
            int n=a.nextInt();
            int copy=n,sp=n/2;
            int num=100;
            char a1='A';
            for(int i=1; i<=n; i++ )
            {
                for(int s=1;s<=sp;s++){
                    System.out.print("\t");
                }               
                for(int col=1;col<=i; col++)
                {
                    // if(i==1 || i==n || i==n/2){
                    //     System.out.print(num+"\t");
                    //      num--;         
                    // }
                    // else{
                    //     System.out.print(a1+"\t");
                    //     a1++;                   
                    //     }                   
                    System.out.print("*\t");
                }
                sp--;
               
                // copy--;
                // sp++;
             System.out.println();   
            }
    }
}