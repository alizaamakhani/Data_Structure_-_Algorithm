import java.util.Scanner;

public class PalindromeString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter any string : ");
         String palindrome = sc.nextLine();

        palindrome = palindrome.toLowerCase();
        String reverse ="";
        for(int i = palindrome.length()-1; i >= 0; i--){
            reverse = reverse + palindrome.charAt(i);
        }
        if(palindrome.equals(reverse)){
            System.out.println("yes, it is palindrome");
        }else{
            System.out.println("No, it is not palindrome");
        }
        sc.close();
       

    }
}

