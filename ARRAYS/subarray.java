public class subarray {
    public static void  printsubarray(int num[]) {
        for (int i = 0; i< num.length;i++) {
            int start = i;
            for(int j = i; j <num.length; j++) {
                int end = j;
                for(int k = start; k <= end; k++) {
                    System.out.println(num[k]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        printsubarray(num);
    }
}
