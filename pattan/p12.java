import java.util.*;
 class fib {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
            int n=a.nextInt();
            int n1=0,n2=1,n3;
            for(int i=1; i<=n;i++)
            {

                for(int j=1;j<=i;j++)
                {
                    System.out.print(n1+"\t ");
                    n3=n1+n2;
                    n1=n2;
                    n2=n3;
                    // System.out.print(0);
                    
                }
                System.out.println("");
            }

    }
}