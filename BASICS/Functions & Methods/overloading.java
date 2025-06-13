public class overloading {

    public static int overload(int a , int  b){
        return a+b;
    }

    public static int overload(int a , int  b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(overload(5, 6));
        System.out.println(overload(5, 6, 8));
    }
}
