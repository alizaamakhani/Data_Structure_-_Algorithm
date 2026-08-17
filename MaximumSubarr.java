import java.util.Scanner;

public class MaximumSubarr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter array elements:");
        for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
        }
        int Max = arr[0];
        int sum = arr[0];
        for(int i = 0 ; i<n;i++){
            sum = Math.max(arr[i], sum + arr[i]);
            Max = Math.max(Max, sum);
        }
          System.out.println("Maximum subarray sum = " + Max);

        sc.close();
        }
    }

