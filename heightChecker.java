import java.util.Arrays;

public class heightChecker {
    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        if(Arrays.equals(heights, expected)){
            return 0;
        }else{
            for(int i = 0; i < heights. length; i++){
                if(heights[i] != expected[i]){
                    count ++;
                }
            }
        }
       return count;
    }

    public static void main(String[] args){
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(heights));
    }
}