public class func_overload {
    
    public static int sum(int a, int b){
        return a+ b;
    }

    public static double sum(double a, double b) {
        return a+b;
    }

    public static void main(String[] args) {

        System.out.println(sum(5, 8));
        System.out.println(sum(4.5, 8.2));
    }
}
