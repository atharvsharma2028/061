public class largest_of_3_numbers {
    public static void main(String args[]) {
        int a = 5;
        int b = 3;
        int c = 1;
        if (a >= b && a >= c) {
            System.out.print("a is largest");
        } else if (b >= a && b >= c) {
            System.out.print("b is largest");
        } else {
            System.out.print("c is largest");
        }

    }
    
}
