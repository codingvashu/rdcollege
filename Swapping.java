import java.util.Scanner;

public class Swapping {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
          int x,y;
          System.out.println("Enter the value of X");
          System.out.println("Enter the value Y ");
          x = sc.nextInt(); 
          y = sc.nextInt(); 
          x = x + y;
          y = x - y;
          x = x - y;
          System.out.println("After Swapping");
          System.out.println("Value of x is :" + x);
          System.out.println("Value of y is :" + y);
          sc.close();
        }
    }

