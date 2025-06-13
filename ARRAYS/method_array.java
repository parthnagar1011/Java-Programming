public class method_array {
    
    public static void update(int n[]) {
        for(int i = 0; i < n.length; i++) {
            n[i] = n[i] + 1;
        }
    }

    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5, 6, 7, 8};
        update(n);
        for(int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
