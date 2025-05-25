import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of num1 : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the value of num2 : ");
        int num2 = sc.nextInt();

        System.out.println("Enter the operator : ");
        char oprt = sc.next().charAt(0);

        switch (oprt) {
            case '+':
                System.out.println(num1 + num2);
                break;

                case '-':
                System.out.println(num1 - num2);
                break;

                case '*':
                System.out.println(num1 * num2);
                break;

                case '/':
                System.out.println(num1 / num2);
                break;
        
            default:
            System.out.println("Invalid Request");
                break;
        }

        
    }
}
