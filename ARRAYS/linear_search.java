public class linear_search {
    
    public static int linearsearch(int number[] , int key) {

        for(int i = 0; i <= number.length; i++){
            if(number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {1,2,3,3,4,5,7,8,6,9};
        int key = 1;
        
        int index = linearsearch(number, key);

        if(index == -1) {
            System.out.println("Not found");
        }
        else {
            System.out.println(index);
        }
    }
}
