import java.util.Scanner;

class Name{
    static void printName(String name,int count){
        if(count == 5){
        return;
        }
        System.out.println(name);

        printName(name , count+1);


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        printName(name , 0);
        sc.close();


    }
}
