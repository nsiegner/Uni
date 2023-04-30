import java.util.Random;

public class HelloWorld {
   
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] toSort = new int[1000];
        for(int i = 0; i<toSort.length;i++){
            int rndNum = rnd.nextInt(101);
            toSort[i] = rndNum;
            
        }

        sort(toSort);

        for(int i=0;i<toSort.length;i++){
            System.out.println(toSort[i]);
        }
        


    }

    public static void sort(int[] array){
        boolean sorted = false;

        while(sorted == false){
            int sorts = 0;
            
            for(int i=0; i<array.length - 1;i++){
                
                if(array[i] > array[i+1]){
                    int m = array[i];
                    array[i] = array[i+1];
                    array[i+1] = m;
                    sorts ++;
                }



            }
            if(sorts == 0){
                sorted = true;

            }

        }



    }
    

 


}
