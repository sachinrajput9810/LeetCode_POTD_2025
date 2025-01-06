package Leetcode_Jan;

public class day_6_Min_operation_to_move_All_balls_to_each_box {
    public int[] minOperations(String boxes) {
        int n = boxes.length() ;
        int ans[] = new int[n] ;
        int totalOnes = 0 ;
        int first = 0 ;
        for(int i=0 ; i<boxes.length() ; i++){
            char ch = boxes.charAt(i) ;
            if(ch  == '1'){
                totalOnes++ ;
                first += i  ;
            }
        }
        ans[0] = first ;
        int left = boxes.charAt(0) == '0' ? 0 : 1 ;
        for(int i=1 ; i<n ; i++){
            int right = totalOnes - left ;
            ans[i] = ans[i-1] - right + left ;
            if(boxes.charAt(i) == '1') left++ ;
        }
        return ans ;
    }
}
