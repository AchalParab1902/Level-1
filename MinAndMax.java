// 2.Find the maximum and minimum element in 1D/2D array
import java.util.*;
public class MinAndMax{
    public static void Min1D(int[] arr){
        int min=arr[0];
        for(int a:arr){
        if(a<min){
            min=a;
        }
      }
      System.out.println("Minimum Element in 1D array :"+min);   
    }
    public static void Max1D(int[] arr){
        int max=arr[0];
        for(int a:arr){
        if(a>max){
            max=a;
        }
      }
      System.out.println("Maximum Element in 1D array :"+max);
    }

    public static void Max2D(int arr2[][]){
      int max=arr2[0][0];
      for(int[] num:arr2){
        for(int a:num){
        if(a>max){
            max=a;
        }
        }
      }
      System.out.println("Maximum Element in 2D array :"+max);
    }

    public static void Min2D(int arr2[][]){
       int min=arr2[0][0];
        for(int[] num:arr2){
          for(int a:num){
        if(a<min){
            min=a;
        }
          }
      }
      System.out.println("Minimum Element in 2D array :"+min);
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of 1D array");
       int n=sc.nextInt();
       int arr[]=new int[n];
       
       System.out.println("Enter value of 1D array");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
     
      Max1D(arr);
      Min1D(arr);

      System.out.println("Enter the size of 2D array");
      int n2=sc.nextInt();
      int arr2[][]=new int[n2][n2];
      System.out.println("Enter the value of 1D array");
      for(int i=0;i<n2;i++){
        for(int j=0;j<n2;j++){
          arr2[i][j]=sc.nextInt();
        }
      }
      Min2D(arr2);
      Max2D(arr2);
    }
}