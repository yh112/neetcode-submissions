class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while(true) {
            if (nums.length <= j) return i + 1;
            if (nums[i] == nums[j]) j++;
            else {
                nums[i+1] = nums[j];
                i++;
            }
        }
    }
}