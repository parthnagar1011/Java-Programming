import java.util.Scanner;

public class method2 {

    // method example 2

    public static void CalculateSum(int num1 , int num2) {    // foraml parameters for defining the function.
        int sum = num1 +  num2;
        System.out.println("The Sum is : " + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        CalculateSum(a , b);   // when calling a function and the variable we are using called as ARGUMENTS or ACTUAL PARAMETERS. At the time of calling.
    }
    
}

