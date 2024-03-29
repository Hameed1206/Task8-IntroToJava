import java.util.Scanner;
public class TaskEightFirstQue {
    //Declaring 4 Integer variables, 
    //since main method is static we declare all variables as static
    static int a;
    static int b;
    static int c;
    static int d;
    public static void main(String[] args) {
        
        System.out.println("Enter the values");
        Scanner s = new Scanner(System.in);
        
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();
        
        if (a+b > c+d) {
         System.out.println("The sum of a="+a+" and b="+b+" is "+(a+b)+
        ", which is greater than the sum of c="+c+" and d="+d+
        ", which is "+(c+d));
        }
        else{
        System.out.println("The sum of a="+a+" and b="+b+" is "+(a+b)+
         ", which is *NOT* greater than the sum of c="+c+" and d="+d+
         ", which is "+(c+d));    
        }
    }
}
