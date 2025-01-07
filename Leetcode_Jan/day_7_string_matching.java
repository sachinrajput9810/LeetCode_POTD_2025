package Leetcode_Jan;

import java.util.ArrayList;
import java.util.List;

public class day_7_string_matching{
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>() ;
        int n = words.length ;
        for(int i=0 ; i<n ; i++){
            String word = words[i] ;
            for(int j=0 ; j<n  ; j++){
                if(i != j){
                    if(words[j].contains(word)){
                        res.add(word) ;
                        break ;
                    }
                }
            }
        }
        
        return res ;
    }
}