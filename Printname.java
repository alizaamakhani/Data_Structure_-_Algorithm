import java.util.Scanner;
class Printname{
static void reverse(int n ){
    if(n==0){
        return;
    }
    System.out.println(n);

    reverse(n - 1 );
    
}
public static void main(String args[]){
    
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter number:"  );
    int n = sc.nextInt();
    reverse(n);
   sc.close();


}
}