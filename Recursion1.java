import java.util.Scanner;

public class Recursion1 {
    public void static EvenNo(int n){
        if(n==0){
            return;
        }
        if(n%2==0){
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
    }
    
}
