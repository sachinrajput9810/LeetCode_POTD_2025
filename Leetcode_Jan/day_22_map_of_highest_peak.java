package Leetcode_Jan;

import java.util.LinkedList;
import java.util.Queue;

public class day_22_map_of_highest_peak {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length ;
        int n = isWater[0].length ;
        int height[][] = new int[m][n] ;
        Queue<int[]> q = new LinkedList<>() ;

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(isWater[i][j] == 1){
                    height[i][j] = 0 ;
                    q.add(new int[]{i,j}) ;
                }
                else height[i][j] = -1 ;
            }
        }
        int directions[][] = { {-1 , 0} , {0 , 1} , {1 , 0} , {0 , -1}  } ;
        while(!q.isEmpty()){
            int size = q.size() ;
            while(size-- > 0){
                int[] curr = q.poll() ;
                int i = curr[0] ;
                int j = curr[1] ;
                for(int dir[] : directions){
                    int i_  = i + dir[0] ;
                    int j_ = j + dir[1] ;
                    if(i_ >= 0 && j_ >= 0 && i_ < m && j_ < n && height[i_][j_] == -1){
                        q.add(new int[]{i_ , j_}) ;
                        height[i_][j_] = height[i][j] + 1 ;
                    }
                }
            }
        }
        return height ;
    }
}
