
// Q. WAP to print sum of all even digit in number?

import java.util.*;
public class sumofevendigit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        while (n != 0) {
            int lastdigit = n % 10;

            if(lastdigit % 2 == 0){
                sum += lastdigit;
            }
            n /= 10;
        }

        System.out.println(sum);
    }
}
