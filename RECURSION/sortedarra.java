public class sortedarra {
    public static boolean is_sorted(int arr[], int i) {
        if(i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return is_sorted(arr, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(is_sorted(arr, 0));
    }
}
