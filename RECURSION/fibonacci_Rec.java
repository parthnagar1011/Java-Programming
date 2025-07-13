public class fibonacci_Rec {

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int N1 = fibo(n-1);
        int N2 = fibo(n-2);
        int Nth = N1 + N2;
        return Nth;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibo(n));
    }
}


