import java.util.Scanner;

public class MaximumConsecutive{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements of an array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter array elements(0 and 1):");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0; 
        int maxcount = 0;

        for(int i = 0 ; i<n;i++){
            if(arr[i] == 1){
                count++;
                if(count>maxcount){
                    maxcount = count;
                }

            }else{
                count = 0;
            }
        }
        System.out.println("Maximum consecutive 1's =" + maxcount );

    }
}