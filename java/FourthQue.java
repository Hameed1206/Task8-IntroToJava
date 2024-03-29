import java.util.Scanner;
public class FourthQue {
    
    public static void main(String[] args) {
        
       int a;
       int b;
       int c;
       System.out.println("Enter the Values");
       Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();

        System.out.println("Value of a before swapping is "+a);
        System.out.println("Value of b before swapping is "+b);
        System.out.println("================================");

        c=a;
        a=b;
        b=c;

        System.out.println("Value of a after swapping is "+a);
        System.out.println("Value of b after swapping is "+b);
    }
}
