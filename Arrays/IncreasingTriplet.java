package Arrays;

public class IncreasingTriplet {
   public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }
        return false;
    }
     public static void main(String[] args) {
        IncreasingTriplet obj = new IncreasingTriplet();  // yaha "Solution" ki jagah "IncreasingTriplet"
        int[] nums = {2, 1, 5, 0, 4, 6};
        System.out.println(obj.increasingTriplet(nums));
    }
}

//run:- javac Arrays/IncreasingTriplet.java  THEN:- java Arrays.IncreasingTriplet