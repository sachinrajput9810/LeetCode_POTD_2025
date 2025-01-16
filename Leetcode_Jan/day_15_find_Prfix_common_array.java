package Leetcode_Jan;

import java.util.HashSet;

public class day_15_find_Prfix_common_array {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length ; 
        int res[] = new int[n] ;
        HashSet<Integer> set = new HashSet<>() ;
        for(int i=0 ; i<n ; i++){
            int val1 = A[i] ;
            int val2 = B[i] ;
            set.add(val1) ;
            set.add(val2) ;
            int setSize = set.size() ;
            int commonEle = (i+1)*2 - setSize ;
            res[i] = commonEle ;
        }
        return res ;
    }
}
