// Q. WAP to program to print all the ASCII value and their equivalent character of 26 alphabets 
// using a while loop?

public class AsciiAlphabets {
    public static void main(String[] args) {
        char ch = 'A';  // Start from uppercase A

        System.out.println("Uppercase letters:");
        while (ch <= 'Z') {
            System.out.println(ch + " -> " + (int) ch);
            ch++;
        }

        ch = 'a';  // Start from lowercase a

        System.out.println("\nLowercase letters:");
        while (ch <= 'z') {
            System.out.println(ch + " -> " + (int) ch);
            ch++;
        }
    }
}

