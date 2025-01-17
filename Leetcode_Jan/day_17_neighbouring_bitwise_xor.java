package Leetcode_Jan;

public class day_17_neighbouring_bitwise_xor {
    public boolean doesValidArrayExist(int[] derived) {
        int xor = 0 ;
        for(int val : derived) xor = (xor ^ val) ;
        return xor == 0 ;
    }
}
