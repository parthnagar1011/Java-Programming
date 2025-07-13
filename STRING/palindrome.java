public class palindrome {

    public static boolean isPalindrome(String str) {
    for(int i = 0; i<str.length()/2; i++) {
        int n = str.length();
        if(str.charAt(n) != str.charAt(n-1-i)) {
            return false;
        }
    }
    return false;
}
    public static void main(String[] args) {
        String str = "Parth";

        System.out.println(isPalindrome(str));
    }
}