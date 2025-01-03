package Leetcode_Jan;

public class day3_waysToSplitArray {
    public int waysToSplitArray(int[] nums) {
        long totalSum = 0 ;
        int n = nums.length ;
        for(int val : nums) totalSum += val ;
        long sum = 0 ;
        int cnt = 0 ;
        for(int i=0 ; i<n-1 ; i++){
            int val = nums[i] ;
            sum += val ;
            long remain = totalSum - sum ;
            if(sum >= remain) cnt++ ;
        }
        return cnt ;
    }
}
