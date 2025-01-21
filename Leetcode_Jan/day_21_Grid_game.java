package Leetcode_Jan;

public class day_21_Grid_game {
    public long gridGame(int[][] grid) {
        long ans = Long.MAX_VALUE ;
        long pref1 = 0 ;
        long pref2 = 0 ;
        int n = grid[0].length ;
        for(int i=0 ; i<n ; i++){
            pref1 += grid[0][i] ;
        }
        for(int i=0 ; i<n ; i++){
            pref1 -= grid[0][i] ;
            ans = Math.min(ans , Math.max(pref1 , pref2)) ;
            pref2 += grid[1][i] ;
        }
        return ans ;
    }
}
