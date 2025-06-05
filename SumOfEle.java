// 3.Sum of all elements in a 1D/2D array.
import java.util.*;
public class SumOfEle{
    public static void sumOf1DArray(int[] arr){
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        System.out.println("Sum of 1D array is : "+sum);

    }

    public static void sumOf2DArray(int[][] arr2){
        int sum=0;
        for(int[] num:arr2){
        for(int a:num){
            sum+=a;
        }
        }
        System.out.println("Sum of 2D array is : "+sum);
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
     sumOf1DArray(arr);

     System.out.println("Enter the size of 2D array");
     System.out.println("Enter rows of array");
      int row=sc.nextInt();
      System.out.println("Enter cols of array");
      int col=sc.nextInt();
      int arr2[][]=new int[row][col];
      System.out.println("Enter the value of 1D array");
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          arr2[i][j]=sc.nextInt();
        }
      }
      sumOf2DArray(arr2);

}
}
