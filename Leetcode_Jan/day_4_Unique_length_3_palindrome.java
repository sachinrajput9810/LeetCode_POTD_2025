package Leetcode_Jan;

import java.util.HashSet;

public class day_4_Unique_length_3_palindrome {
    public int countPalindromicSubsequence(String s) {
        int n = s.length() ;
        int cnt = 0 ;
        Pair arr[] = new Pair[26] ;
        for(int i=0 ; i<26 ; i++) arr[i] = new Pair(-1 , -1) ;

        for(int i=0 ; i<n ; i++){
            int idx = s.charAt(i) - 'a' ;
            if(arr[idx].first == -1) arr[idx].first = i ;
            else arr[idx].second = i ;
        }

        for(int i=0 ; i<26 ; i++){
            if(arr[i].first != -1 && arr[i].second != -1){
                HashSet<Character> set = new HashSet<>() ;
                for(int j=arr[i].first+1 ; j<arr[i].second ; j++){
                    set.add(s.charAt(j)) ;
                }
                cnt += set.size() ;
            }
        }
        return cnt ;
    }
}
