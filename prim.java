import java.util.*;  
class Main
{
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       int a=scn.nextInt();
       int flag=1;
       for(int j=0;j<=a;j++)
       {
           System.out.println("Enter a number ");
           int b=scn.nextInt();
            for(int i=2; i*i<=b;i++)
            {
                if(b%i==0)
                {
                flag=0;
                break;
                }
            }
            if(flag==1)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Prime not");
            }  
       }
   }
  }


    //     for(int i=2; i<=(a/2);i++)
    //   {
    //     if(a%i==0)
    //     {
    //       flag=0;
    //       break;
    //     }
    //   }
    //   if(flag==1)
    //   {
    //     System.out.println("Prime");
    //   }
    //   else
    //   {
    //     System.out.println("Prime not");
    //   }
    // https://nados.io/question/is-a-number-prime?zen=true



   // import java.util.*;
  
//   public class Main{
  
//   public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
  
//        int a=scn.nextInt();
//        int flag=1;
       
//       for(int i=2; i*i<=a;i++)
//       {
//         if(a%i==0)
//         {
//           flag=0;
//           break;
//         }
//       }
//       if(flag==1)
//       {
//         System.out.println("Prime");
//       }
//       else
//       {
//         System.out.println("Prime not");
//       }
//    }
//   }