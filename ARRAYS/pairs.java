public class pairs {
    public static void printpairs(int number[]) {
        int tp = 0;
        for(int i = 0; i< number.length; i++) {
            int current = number[i];

            for(int j = i+1; j < number.length; j++) {
                System.out.println("(" + current + " " + number[j] + ")");
                tp ++;
            }
        }
        System.out.println("Total pairs" + tp);
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        printpairs(number);
    }
}
