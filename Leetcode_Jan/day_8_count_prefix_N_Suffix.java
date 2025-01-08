package Leetcode_Jan;

public class day_8_count_prefix_N_Suffix {
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length ;
        int cnt = 0 ;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if( check(words[i] , words[j])){
                    cnt++;
                }
            
            }
        }
        return cnt ;
    }
    public boolean check(String check , String word){
        if(word.startsWith(check) && word.endsWith(check)) return true ;
        return false ;

    }
}
