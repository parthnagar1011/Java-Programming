// Q.  Write a program to print sum of digits?


import java.util.*;

public class sumofdigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n =  sc.nextInt();

        int sum = 0;

        while (n != 0) {
            int lastdigit = n % 10;

            sum = sum + lastdigit;
            n = n / 10;
        }
        System.out.println(sum);
    }
}