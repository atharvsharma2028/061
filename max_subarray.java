public class max_subarray {
    public static void maxsubarray(int numbers[]){
        for(int i = 0; i<numbers.length;i++){
            int start = i;
            for(int j = i; j< numbers.length;j++){
                int end = j;
                 for(int k = start; k <= end; k++){
                    System.out.print(numbers[k]+ " ");
                }
                System.out.println();
            }
            
                System.out.println(); 

        }
          
    }
    
}
