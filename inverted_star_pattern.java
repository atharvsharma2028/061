import java.util.*;

public class inverted_star_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<=5; i++){
            for(int j = 5; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    
}
