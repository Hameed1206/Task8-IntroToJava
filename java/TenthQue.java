import java.util.Scanner;

public class TenthQue {
    
    static int c;
    public static void main(String[] args) {
        
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        c=a;
        int count = 0;
        while (a>0) {
            int b = a/10;
            a=b;
            count++;
        }
        System.out.println("Number of digits in "+c+" is "+count);
    }
}
