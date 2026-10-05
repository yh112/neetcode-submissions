class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0)
            return false;

        Set<Integer> set = new HashSet<>();
        int i = 0;

        while(i < nums.length) {
            if(set.contains(nums[i])) return true;
            if(i >= k) {
                set.remove(nums[i - k]);
            }
            set.add(nums[i++]);
        }
        return false;
    }
}