package Leetcode_Jan;

public class day_13_Minimum_len__of_string{
    public int minimumLength(String s) {
        int len = 0 ;
        int freq[] = new int[26] ;
        for(char ch : s.toCharArray()){
            freq[ch-'a']++ ;
        }
        for(int count : freq){
            if(count == 0) continue ;
            else if(count%2 == 0) len += 2 ;
            else len += 1 ;
        }
        return len ;
    }
}