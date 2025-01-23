package Leetcode_Jan;

public class day_23_countServers {
    public int countServers(int[][] grid) {
        int m = grid.length ;
        int n = grid[0].length ;

        int rowCnt[] = new int[m] ;
        int colCnt[] = new int[n] ;

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                rowCnt[i] += grid[i][j] ;
                colCnt[j] += grid[i][j] ;
            }
        }
       
        int ans = 0 ;
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(grid[i][j] == 1 && ( rowCnt[i] > 1 || colCnt[j] > 1)){
                    ans++ ;
                }
            }
        }
        return ans ;
    }
}
