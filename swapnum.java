public class swapnum {

    public static void swapnumber(int a , int b) {

        int temp;

        temp = a;
        a = b;
        b = temp;
        
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        swapnumber(num1, num2);
    }
}
