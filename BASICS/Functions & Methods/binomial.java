public class binomial {
    
    public static int facto(int n) {
        int f = 1;
        for(int i = 1 ;  i <= n; i++){
            f = f * i;
        }
        return f;
    }

    public static int bio_coeff(int n , int r) {
        int ff = facto(n);
        int fr = facto(r);
        int nr = facto(n-r);

        int bionCoeff = ff /(fr * nr);
        return bionCoeff;
    }

    public static void main(String[] args) {
        System.out.println(bio_coeff(5, 2));
    
    }
    
}
