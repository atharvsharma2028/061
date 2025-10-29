import java.util.*;

public class chk_no_is_prime_or_not {     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2; i < n-1; i++){
            if(n%i == 0) {  // not prime
                isPrime = false;
            
            }
            if(n == 2) {
                System.out.println("Prime");
            } 
        }
        if(isPrime == true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    
}
