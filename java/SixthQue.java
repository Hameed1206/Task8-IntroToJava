import java.util.Scanner;

public class SixthQue {
    
    public static void main(String[] args) {
        
        System.out.println("Enter a number");
        int a;
        int b = 1;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        for(int i=1; i<=a; i++){
            b = b*i;
        }
        System.out.println("Tha factorial of "+a+" is "+b);
    }
}
