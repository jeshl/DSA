public class Practice {
    //find the elements occuring twice in array
    // public static boolean Find_twice(int[] prices){
    //     for(int i = 0; i < numbers.length; i++){
    //         for(int j = i + 1; j < numbers.length; j++){
    //             if(numbers[i] == numbers[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;

    // }

    public static void BubbleSort(int[] numbers){
        for(int i = 0; i < numbers.length - 1; i++){
            System.out.println("im printed outside");
            for(int j = 0; j < numbers.length - 1 - i; j++){
                System.out.println("im printed inside!!");
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }


    public static void PrintArr(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
    int[] numbers = {7, 6, 3, 4, 5};
    //{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    BubbleSort(numbers);
    PrintArr(numbers);
    }
}
