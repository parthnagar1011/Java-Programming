
// Opposite Right Angled Isosceles Triangle
// ****
// ***
// **
// *

import java.util.Scanner;

public class oppositerightangled {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int  i = 1; i <= n; i++) {
            for(int j = i ; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

