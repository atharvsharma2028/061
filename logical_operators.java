public class logical_operators {
    public static void main(String args[]){
        int A = 10;
        int B = 5;
        System.out.println((A==B) && (A<B));  // false && true = false
        System.out.println((A==B) || (A<B));  // false || true
        System.out.println(!(A==B));          // !(false) = true
    }
    
}
