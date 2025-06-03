// 1.Reverse an Array (in place or using extra space)
import java.util.*;
public class reverse{
    public static void reverseArray(int[] arr,int n,int len){
        for(int i=0;i<n/2;i++){
         int temp=arr[i];
         arr[i]=arr[len-1];
         arr[len-1]=temp;
         len--;
      }
      System.out.println("After revering");
         for(int a:arr){
        System.out.print(a+" ");
      }

    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of array");
       int n=sc.nextInt();
       int arr[]=new int[n];
       int len=arr.length;
       System.out.println("Enter value of array");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println("Before reversing");
      for(int a:arr){
        System.out.print(a+" ");
      }
      System.out.println();
      reverseArray(arr,n,len);
      
    }
}