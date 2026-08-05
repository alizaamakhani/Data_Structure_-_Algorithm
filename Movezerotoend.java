import java.util.Scanner;

public class Movezerotoend{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of an array: ");
        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int temp[] = new int[n];
        int index = 0;
        for(int i = 0 ;i<n;i++){
            if(arr[i]!=0){
                temp[index] = arr[i];
                index++;
            }
        }
        for(int i = 0;i<n;i++){
            arr[i] = temp[i];
        }
        System.out.println("Array after moving zeros:");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}