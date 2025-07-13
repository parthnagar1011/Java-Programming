public class one_TO_n {

    public static void print_INS(int n) {

        if(n == 1) {
            System.out.println(1);
            return;
        }
        print_INS(n-1);
        System.out.println(n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        print_INS(n);
    }
}

