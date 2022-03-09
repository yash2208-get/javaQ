import java.util.*;
class p17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 1 ;
        int n2=1;
        int spanc=n/2;
        while(row <= n){ 
            for(int i = 1 ; i <=spanc ; i++){
                if(row==n/2+1){
                    System.out.print("*\t");    
                }
                else
                {
                    System.out.print("\t");
                }
                
            }
            for(int i = 1 ; i <=n2 ; i++){
                System.out.print("*\t");
            }
            if(row <= n/2){ 
                // nspaces = nspaces + 2;
                n2 = n2  +1;
            }else{ 
                // nspaces = nspaces - 2;
                n2 = n2 - 1;
            }
            System.out.println();
            row++;
        }
    }
}