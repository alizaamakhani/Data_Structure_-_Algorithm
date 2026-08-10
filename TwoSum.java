import java.util.Scanner;

public class TwoSum{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
   System.out.println("Enter number of elements:");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean found = false;
        int target;
        System.out.println("target:");
        target =  sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(arr[i] + arr[j] == target ){
                    found = true;
                    break;
                }
            }
        }
        if(found)
            System.out.println("Yes");
            else
           System.out.println("NO")
            
        }
}

