public class primerange {

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
        

    public static void PrimeInRange(int n) {
        for(int i = 2; i<=n; i++){
            if (isPrime(i)){
                System.out.println(i + " ");
            }
        }    
    }
    public static void main(String[] args) {
        PrimeInRange(22);
}
}

