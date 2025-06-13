import java.util.*;

public class array1 {
    public static void main(String[] args) {
        
        // creating an array
        String fruits[] = new String[100];
        
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Grapes";

        // output 1

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);


        // taking input

        Scanner ar = new Scanner(System.in);

        String fruit[] = new String[10];

        fruit[0] = ar.next();
        fruit[1] = ar.next();
        fruit[2] = ar.next();

        // output uning loop

        for(int i = 0; i<fruit.length; i++) {
            System.out.println("Fruit :" + fruit );

        }
    }
}
