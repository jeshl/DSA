public class SelectionSort {

    public static void Selection(int[] numbers){
        for(int i = 0; i < numbers.length - 1; i ++){
            int position = i; //current minimum postion
            for(int j = i + 1; j < numbers.length; j ++){
                if(numbers[position] > numbers[j]){
                    position = j; //update with minimum position
                }
            }
            int temp = numbers[position];
            numbers[position] = numbers[i];
            numbers[i] = temp;
        }
    }

    public static void PrintArr(int[] numbers){
        for(int i = 0; i < numbers.length; i ++){
            System.out.print(numbers[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1, 9, 8, 3, 11, 7, 2, 2, 13};
        Selection(numbers);
        PrintArr(numbers);
    }
}
