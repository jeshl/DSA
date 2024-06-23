public class demo {

    //Trapping Rain water
    public static int Trapping_Rainwater1(int[] height_of_bars, int width){

        int[] left_max1 = new int[height_of_bars.length];
        left_max1[0] = height_of_bars[0];
        for(int i = 1; i < height_of_bars.length; i++){
            left_max1[i] = Math.max(left_max1[i - 1], height_of_bars[i]); //checking previous left boundary with current bar height
        }
        
        int[] right_max1 = new int[height_of_bars.length];
        right_max1[height_of_bars.length - 1] = height_of_bars[height_of_bars.length - 1];
        for(int i = height_of_bars.length - 2; i >= 0; i--){
            right_max1[i] = Math.max(right_max1[i + 1], height_of_bars[i]);
        }
        
        int trapped_water = 0;
        for(int i = 0; i < height_of_bars.length; i++){
        int water_level = Math.min(right_max1[i], left_max1[i]);
        trapped_water += (water_level - height_of_bars[i]) * width;
        }

      return trapped_water;

    }
    public static void main(String[] args) {
        int[] height_of_bars = {4, 2, 0, 6, 3, 2, 5};
        int width = 1;
        System.out.println(Trapping_Rainwater1(height_of_bars, width));
    }
}
