public class convert_D2B {
     public static void decTobin(int n){
        int   pow = 0;
        int decNum = n;
        int myNum = decNum;
        int binNum = 0;
        while(n>0){
            int rem = n % 2;
            binNum = binNum + (rem *(int)(Math.pow(10,pow)));
            pow++;
            n = n/2;
        }
        System.out.println("Binary form of " + myNum + " = " + binNum);



       }
       public static void main(String args[]){
        decTobin(9);
       }
}
