import java.util.Scanner;

public class EighthandNinethQues {
    
    public static void main(String[] args) {

       // Que 8
        String s = "Welcome to Guvi";
        for(int i=1; i<=10; i++){
            System.out.println(i+", "+s);
        }
 
       // Que 9 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 60) {
            System.out.println("Age "+age+" is a senior citizen.");
        } else {
            System.out.println("Age "+age+"  is not a senior citizen.");
        }
    }
}
