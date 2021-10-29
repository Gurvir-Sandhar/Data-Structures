/**
 * Binary Search algorithm using recursion
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        return helper(nums, 0, nums.length -1, target);
    }
    
    public int helper(int[] nums, int low, int high, int target) {
        if(low >= high) {
            if(nums[low] == target) {
                return low;
            }
            return -1;
        }
        int mid = (high + low) / 2;

        if(nums[mid] == target) {
            return mid;
        } else if(nums[mid] > target) {
            return helper(nums, 0, mid-1, target);
        } else {
            return helper(nums, mid+1, high, target);
        }
    }
}