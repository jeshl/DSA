public class Practice1 {

    //Bubble Sort
    public static void BubbleSort1(int[] numbers){
        for(int i = 0; i < numbers.length - 1; i ++){
            for(int j  = i + 1; j < numbers.length; j++){
                if(numbers[i] > numbers[j]){
                    int temp1 = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp1;
                }
            }
        }

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }



    //Selection Sort
    public static void Selectionsort(int[] numbers){
        for(int i = 0; i < numbers.length - 1; i ++){
            int curr_position = i;
            for(int j = i + 1; j < numbers.length; j ++){
                if(numbers[curr_position] > numbers[j]){
                    curr_position = j;
                }
            }
            int temp1 = numbers[curr_position];
            numbers[curr_position] = numbers[i];
            numbers[i] = temp1;
        }
     
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        // for (int i : numbers) {
        //     System.out.print(numbers[i] + " ");
        // }
    }
  
    //Count Sort
    public static void CountSort(int[] numbers){

    int max = Integer.MIN_VALUE;
    //find the maximum elements
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }

    
    //Create an array with size of maximum value
        int[] freqArray = new int[max + 1]; // if 10 is highest then 0 - 10 = 11

        for(int i = 0; i < numbers.length; i ++){
            int freq = 0;
            int j = 0;
            while (j < numbers.length - 1 && numbers[j] == numbers[j + 1]) {
                freq ++;
                freqArray[numbers[i]] += freq; 
                j ++;
            }
       
        }

        for(int i = 0; i < freqArray.length; i ++){
            System.out.print(freqArray[i] + " ");
        }

    }
    public static void main(String[] args) {
        // int[] numbers = {9, 8, 7, 3, 11, 1, 4}; 
        //BubbleSort1(numbers);

        int[] numbers = {9, 9, 8, 8, 8, 3, 1, 4, 6, 4, 4};
        //Selectionsort(numbers);

        CountSort(numbers);
    }
}
