// Q. Write a program to print sum of product of non-zero digits of numbers?

import java.util.*;

public class sumofrpoduct_nonzero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int product = 1;

        boolean nonzero = false;

        while (n != 0) {
            int lastdigit = n % 10;
            if ( lastdigit != 0) {
                product *= lastdigit;
                nonzero = true;
            }
            n /= 10;
        }
        if(nonzero) {
            System.out.println(product);
        }
        else {
            System.out.println("Has Zeroes");
        }
    }
}
