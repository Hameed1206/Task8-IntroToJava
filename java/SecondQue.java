import java.util.Scanner;
public class SecondQue {
    
    static int a;
    public static void main(String[] args) {
     
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();

        if (a%2==0) {
            System.out.println(a+" is a even number");
            }
            else{
                System.out.println(a+" is a odd number");
        }
    }
}
