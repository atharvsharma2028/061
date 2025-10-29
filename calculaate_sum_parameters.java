import java.util.*;
public class calculaate_sum_parameters {
    public static int calculatesum(int num1 ,int num2) {    // PARAMETERS OR FORMAL PARAMETERS
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a,b);      // ARGUMENTS OR ACTUAL PARAMETERS 
        System.out.println("sum is :" + sum);
    }
    
}
