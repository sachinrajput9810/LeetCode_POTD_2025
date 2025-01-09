package Leetcode_Jan;

public class day_9_counting_words_With_prefix {
    public int prefixCount(String[] words, String pref) {
        int cnt = 0 ;
        for(String str : words){
            if(str.startsWith(pref)) cnt++ ;
        }
        return cnt ;
    }
}
