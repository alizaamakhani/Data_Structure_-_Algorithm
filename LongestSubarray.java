import java.util.Scanner;

public class LongestSubarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k:");
        int k = sc.nextInt();
        int maxlength = 0;

        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = i ; i<n;j++){
                sum = sum + arr[j];
                if(sum == k){
                    int length = j-i+1;
                    if(length > maxlength){

                    }
                }
            }
        }
        System.out.println("Longest Subarray is:"+ maxlength);
    
    sc.close();
}
}