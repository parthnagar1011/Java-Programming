public class sortedarray {
    public static boolean searcharray(int matrix[][] , int key) {

        int row = 0;
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0) {
            if(matrix[row][column]  == key){
                System.out.println("Found");
                return true;
            }
            else if(key < matrix[row][column]) {
                column--;
            }
            else {
                row++;
            }
        }
        System.out.println("Not Found");
        return false;
    }

public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9,10,11,12},
            {13,14,15,16}
        };

        System.out.println(searcharray(matrix, 15));
    }
}

