public class n_TO_1 {

    public static void print_DSC(int n) {

        if(n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n + " ");
        print_DSC(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        print_DSC(n);
    }
}