public class conditional_statement {
    public static void main(String args[]) {
        int age = 13;
        if (age<18) {
            System.out.print("Minor");
            if(age>12) {
                System.out.print("Teenager");
            }
        } else {
            System.out.print("Adult");
        }
    }
    
}
