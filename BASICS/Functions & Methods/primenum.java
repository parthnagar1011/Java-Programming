public class primenum {

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for(int i = 2; i<=n-1; i++) {
            if(n%2==0){
                isPrime = false;
                break;
            }
            
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}
