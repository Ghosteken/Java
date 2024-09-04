    public class MainTs {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        
        if (result != null) {
            System.out.println("The indices are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}


