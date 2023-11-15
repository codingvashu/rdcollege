public class Recursion2 {
    void printDigit(int n){
        if(n=0){
            return;
        }
        printDigit(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printDigitRec obj= new printDigitRec();
        obj.printdigit(n:10)
        
    }
    
}
