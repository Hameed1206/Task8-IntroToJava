import java.util.Scanner;

public class FifthQue {

    static int input;
    public static boolean checkIfPrime(int input){
        
        for(int i=2; i<=input/2; i++){
            if (input%i==0) {
            return false;
        }  }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        input = s.nextInt();
        if (checkIfPrime(input)) {
            System.out.println(input+" is a prime number");
        }
        else{
        System.out.println(input+" is not a prime number");
        }
    }
}
