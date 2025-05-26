import java.util.*;

public class factorial {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the Number :- ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Invalid Number");
        }

        else if (number <=1){
            System.out.println("Factorial is 1");
        }

        else {
            int fact = 1;
            for(int i = 1 ; i<= number; i++) {
                fact = fact*i;
            }
            System.out.println("The factorial of " + number +" is "+ fact);
            
        }
    }
}