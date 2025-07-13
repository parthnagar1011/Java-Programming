public class n_NaturalNum {

    public static int print_Natural(int n) {
        if (n == 1) {
            return 1;
        }

        int NN = (n-1);
        int store = n + print_Natural(NN);
        return store;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(print_Natural(n));
    }
}
