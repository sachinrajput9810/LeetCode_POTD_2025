package Leetcode_Jan;

import java.util.ArrayList;
import java.util.List;

public class day_10_word_subsets {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>() ;
        int maxFreq[] = new int[26] ;
        for(String word : words2){
            int temp[] = new int[26] ;
            for(char ch : word.toCharArray()){
                temp[ch-'a']++ ;
            }
            for(int i=0 ; i<26 ; i++){
                maxFreq[i] = Math.max(maxFreq[i] , temp[i]) ;
            }
        }

        for(String word : words1){
            int freq[] = new int[26] ;
            for(char ch : word.toCharArray()){
                freq[ch - 'a']++ ;
            }

            boolean check = true ;
            for(int i=0 ; i<26 ; i++){
                if(freq[i] < maxFreq[i]){
                    check = false ;
                    break ;
                }
            }
            if(check) res.add(word) ;

        }
        return res ;
    }
}
