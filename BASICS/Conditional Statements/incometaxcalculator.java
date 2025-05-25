import java.util.Scanner;
public class incometaxcalculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your Income ");
        int income = sc.nextInt();
        
        System.out.println("Your tax is -");

        if (income<=800000) {

            System.out.println("NO Need to PAY TAX");
            
        } else if (income>=800001 && income<=1100000){
            
            System.out.println(income*0.2);
        } else {
            System.out.println(income*0.3);
        }        
    }
}