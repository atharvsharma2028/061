import java.util.*;

public class incometax_calc {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        if(income <= 500000) {
            System.out.println("No tax");
        } else if(income>= 500000 && income <= 1000000) {
            System.out.println("Your tax is " +(0.2 * (income)));
        } else if(income> 1000000) { 
            System.out.println("Your tax is " +(0.3 * (income)));
        } else {
            System.out.println("Invalid income");
        }
        }
        


    }
    

