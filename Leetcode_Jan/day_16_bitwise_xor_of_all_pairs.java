package Leetcode_Jan;

public class day_16_bitwise_xor_of_all_pairs {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor = 0 ;
        if(nums2.length%2 != 0){
            for(int val : nums1){
                xor = (xor ^ val);
            }
        }
        if(nums1.length%2 != 0){
            for(int val : nums2){
                xor = (xor ^ val);
            }
        }
        return xor ;
    }
}
