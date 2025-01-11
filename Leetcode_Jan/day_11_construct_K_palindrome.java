package Leetcode_Jan;

import java.util.HashMap;

public class day_11_construct_K_palindrome {
     public boolean canConstruct(String s, int k) {
        int n = s.length() ;
        if(n < k) return false ;
        HashMap<Character , Integer> map = new HashMap<>() ;
        for(char ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch , 0)+1) ;
        }
        int cnt = 0 ;
        for(char key : map.keySet()){
            int freq = map.get(key) ;
            if(freq%2 != 0) cnt++ ;
        }

        return cnt <= k ;
    }
}
