// Q. WAP to print reverse of number and also reverse sum?

import java.util.*;
public class reverseofn {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0;
        int sum = 0;      // for reverse sum
        while (n != 0) {
            int lastdigit = n % 10;
            rev *= 10;
            rev += lastdigit;
            sum+=lastdigit;   // for reverse sum
            n = n / 10;
        }
        System.out.println(rev);
        System.out.println(sum);  // for reverse sum
    }
}
