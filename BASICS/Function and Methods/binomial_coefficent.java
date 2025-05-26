import java.util.*;

public class binomial_coefficent {
    public static int facto(int n) {
        int f = 1;

        for(int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binomial(int n, int r) {
        int ff = facto(n);
        int fr = facto(r);
        int nr = facto(n - r);

        int bino_coeff = ff / (fr * nr);
        return bino_coeff;
    }

    public static void main(String[] args) {
        
        System.out.println(binomial(5, 2));
    }

}
