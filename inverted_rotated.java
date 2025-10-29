public class inverted_rotated {
    public static void inverted(int n){
        //outer 
        for (int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= n-i; j++){ 
                System.out.print(" ");
            }

            for(int j = 1; j <= i ; j++){
                System.out.print("*"); 
            }

            System.out.println();
            }

        }
      
         
          public static void main(String args[]){
               inverted(5);
    }
    
}
