import java.util.*;
class pttan15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 1 , nspaces = n/2 , nstars = 1,num=1;
        while(row <= n){
            for(int i = 1 ; i <= nspaces ; i++){
                System.out.print("\t");
            }    int temp=num;         
            for(int i = 1 ; i <= nstars ; i++)
            {
                 
                System.out.print(temp +"\t");
                if(i <= nstars/2){
                    temp=temp+1;
                }
                else{
                    temp=temp-1;
                }
                
            }

            System.out.println();
            
            if(row <= n/2){ 
                nspaces = nspaces - 1;
                nstars = nstars + 2;
                num++;
            }else{ 
                nspaces = nspaces + 1;
                nstars = nstars - 2;
                num=num-1;
            }
            row++;
        }
    }
}