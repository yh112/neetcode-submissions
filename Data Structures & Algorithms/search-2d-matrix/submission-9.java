class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length * matrix[0].length - 1;
        int mid = (l+r) / 2;

        while(l <= r) {
            int current = matrix[mid/matrix[0].length][mid%matrix[0].length];
            if(current == target) return true;
            else if(current > target) r = mid - 1;
            else l = mid + 1;

            mid = (l+r)/2;
        }
        return false;
    }
}
