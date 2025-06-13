import java.util.*;
public class MutliDimensionalarrays {
    public static void main(String[] args) {

        // Arrays as input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int r = sc.nextInt();
        System.out.println("Enter Columns : ");
        int c = sc.nextInt();

        int [][] arrs = new int [r][c];
        
        for(int i =0; i<r;i++){
            for(int j = 0 ; j < c; j++){
                arrs[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2D array is:");
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {  // Corrected condition
                System.out.print(arrs[i][j] + " ");
            }
            System.out.println(); // Print newline after each row
        }
        
        // Initalizing arrays
        int [][] arr = new int[3][2];

        int [][] arr2 = {{1,2,3},
                        {4,5,6}};

        // print

        for(int i = 0; i < arr2.length;i++){
            for(int j = 0 ; j < arr2[i].length; j++) {

                // System.out.println(arr2[i][j]);
            }
        }

        // Jagged arrays
        int[][] jaggedArr = new int[3][];
        jaggedArr[0] = new int[]{1, 2, 3};
        jaggedArr[1] = new int[]{4, 5};
        jaggedArr[2] = new int[]{6, 7, 8, 9};

        for (int[] row : jaggedArr) {
            for (int num : row) {
                // System.out.print(num + " ");
            }
        // System.out.println();
        }
    }
}

