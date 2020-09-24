/**
 * The deadline of this assignment is 09/25/2020 23:59 PST.
 * Please feel free to contact Yafei and Yaqi for any questions.
 */

public class ArrayMaxSum {
    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number)
     * which has the largest sum and outprint its sum.
     *
     * Example 1:
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     *
     * Example 2:
     * Input: nums = [1]
     * Output: 1
     */
    public static int maxSubArray(int[] nums) {
        //write your code here
        int max=nums[0];
        int sum;
        for(int i=0;i<nums.length;i++){
             sum=nums[i];
            if (max<sum) max=sum;
            for(int j=i+1;j<nums.length;j++){
                sum=sum+nums[j];
                if(max<sum) max=sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        //write your code here
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}