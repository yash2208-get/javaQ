import java.io.*;
import java.util.*;
 class find
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] =new int[n];
        for(int i=0 ; i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        System.out.println(a);
        int d = scn.nextInt();
        int a=find(arr,d);
        System.out.println(a);

    }
    public static int find(int arr[],int ele){
        for(int j=0; j <=arr.length; j++){
            if(arr[j]==ele){
                return j;
            }
        }
        return -1;
    }
}