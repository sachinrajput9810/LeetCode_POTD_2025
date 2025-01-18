package Leetcode_Jan;

import java.util.PriorityQueue;

public class day_18_mincost_to_make_atleast_one_valid_path {
    int dir[][] = { {0 , 1} , {0 , -1} , {1 , 0} , {-1 , 0} } ;
    int m ;
    int n ;
    public int minCost(int[][] grid) {
        m = grid.length ;
        n = grid[0].length ;

        PriorityQueue<int[]> pq = new PriorityQueue<>( (a,b) -> Integer.compare(a[0] , b[0])) ;
        int res[][] = new int[m][n] ;
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                res[i][j] = Integer.MAX_VALUE ;
            }
        }

        pq.offer(new int[]{0,0,0}) ;
        res[0][0] = 0 ;
        while(!pq.isEmpty()){
            int curr[] = pq.poll() ;

            int currCost = curr[0] ;
            int i = curr[1] ;
            int j = curr[2] ;
            if(currCost > res[i][j]) continue ;
            for(int dir_i=0 ; dir_i < 4 ; dir_i++){
                int i_ = i + dir[dir_i][0] ;
                int j_ = j + dir[dir_i][1] ;
                if(i_ >=0 && j_ >= 0 && i_ < m && j_ < n){
                    int newCost = currCost + (grid[i][j]-1 != dir_i ? 1 : 0) ;
                    if(newCost < res[i_][j_] ){
                        res[i_][j_] = newCost ;
                        pq.offer(new int[]{newCost , i_ , j_}) ;
                    }
                }
            }
        }
        return res[m-1][n-1];
        
    }

}
