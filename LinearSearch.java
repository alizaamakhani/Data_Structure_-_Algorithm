import java.util.Scanner;

public class LinearSearch{
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of an elements:");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("enter the array elements:");
    for(int i = 0 ; i<n;i++){
        arr[i] = sc.nextInt();
    }
    int num; 
    System.out.println("num:");
    num = sc.nextInt();
    int index = -1;
    for(int j = 0 ; j<n;j++){
    if (num == arr[j]) {
        index = j;
        break;
        
    }
    
    }
    System.out.println("value of index of that num is: " + index);
    sc.close();

 }
}