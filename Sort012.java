import java.util.Scanner;

public class Sort012{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
   System.out.println("Enter number of elements:");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
 
        for(int i = 0;i<n;i++){
            if(arr[i] == 0){
                count0++;
            }else if(arr[i] == 1){
                count1++;
            }else
                count2++;
        }
        int index = 0;
        while(count0>0){
            arr[index]=0;
            index++;
            count0--;
        }

        while(count1>0){
            arr[index]=1;
            index++;
            count1--;
        }

        while(count2>0){
            arr[index]=2;
            index++;
            count2--;
        }

        for(int i =0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
