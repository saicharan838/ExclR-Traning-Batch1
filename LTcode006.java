public class LTcode006 {
    
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int uniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        return uniqueIndex + 1;
    }
    public static void main(String[] args) {
        LTcode006 solution = new LTcode006();
        int[] nums = {1, 1, 2, 2, 3, 3, 4};
        int length = solution.removeDuplicates(nums);
        System.out.println("The new length of the array is: " + length);
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
