import java.util.*;
public class strings {

    public static void PrintLetters(String Full_N) {
            for(int  i = 0 ; i < Full_N.length(); i++) {
                System.out.println(Full_N.charAt(i));
            }
        }
    public static void main(String[] args) {
        
        // creating a string
        char arr []= {'a','b','c'};

        String str = "abcd";

        String str2 = new String("xyz");


        Scanner sc = new Scanner(System.in);

        // String name = sc.next();
        // System.out.println(name);

        // Use nextline() to print full line.

        // String name2 = sc.nextLine();
        // System.out.println(name2);

        // System.out.println(name2.length());

        // Concatenation

        String FN = "Parth";
        String LN = "Nagar";
        String Full_N = FN + " " + LN;
        System.out.println(Full_N);
        
        // charAt() Method

        System.out.println(Full_N.charAt(1));

        PrintLetters(Full_N);
    }
}