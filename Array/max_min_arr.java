import java.io.*;
import java.util.*;
 class Max
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter Array Element Number :");
        for(int i=0 ; i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        // int d = scn.nextInt();
        int a=find(arr);
        System.out.println(a);

    }
    public static int find(int arr[])
    {
        int max=arr[0];
        int min=arr[0];
        for(int j=0; j <=arr.length-1; j++){
            if(arr[j]>=max){
                max=arr[j];
            }
            if(arr[j]<=min){
                min=arr[j];
            }

        }
        System.out.println("Max value "+max);
        System.out.println("Max value "+min);
        // int sw=max-min;
        return min;
        // return -1;
    }
}