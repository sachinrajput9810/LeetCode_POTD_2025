package Leetcode_Jan;

import java.util.HashMap;

public class day_20_first_painted_row_or_col {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int len = arr.length ;
        int n = mat.length ;
        int m = mat[0].length ;

        int rowCnt[] = new int[n] ;
        int colCnt[] = new int[m] ;
        
        HashMap<Integer , int[] > map = new HashMap<>() ;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                map.put(mat[i][j] , new int[]{i , j}) ;
            }
        }

        for(int i=0 ; i<len ; i++){
            if(map.containsKey(arr[i])){
                int[] pos = map.get(arr[i]) ;
                int row = pos[0] ;
                int col = pos[1] ;

                rowCnt[row]++ ;
                colCnt[col]++ ;
                if(rowCnt[row] == m || colCnt[col] == n) return i ;
            }
            

        }
        return -1 ;
    }
}
