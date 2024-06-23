public class Trapping_Rainwater {

    public static int Rainwater(int[] bars_height){
        //calculate left max boundary
        int[] left_max = new int[bars_height.length];
        left_max[0] = bars_height[0];
        for(int i = 1; i < bars_height.length; i++){
            left_max[i] = Math.max(bars_height[i], left_max[i - 1]);
        }

        //calculate right max boundary

        int[] right_max = new int[bars_height.length];
        right_max[bars_height.length - 1] = bars_height[bars_height.length - 1];

        for(int i = bars_height.length - 2; i >= 0; i--){
            right_max[i] = Math.max(bars_height[i], right_max[i + 1]);
        }

        //calculate min of left and right max to find water level

        int trappedwater = 0;
        for(int i = 0; i < bars_height.length; i++){
            int waterlevel = Math.min(left_max[i], right_max[i]);
            trappedwater += waterlevel - bars_height[i];
        }
        return trappedwater;

        //trapped water = water level - current bar height
    }

    public static void main(String[] args) {
        int[] bars_height = {4, 2}; 
        int result = Rainwater(bars_height);
        System.out.println(result);
    }
}
