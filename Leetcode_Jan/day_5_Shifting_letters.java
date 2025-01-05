package Leetcode_Jan;

public class day_5_Shifting_letters {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length() ;
        long pre[] = new long[n+1] ;
        for(int i=0 ; i<shifts.length ; i++){
            int start = shifts[i][0] ;
            int end = shifts[i][1] ;
            int dir = shifts[i][2] ;
        
            int val  = dir == 0 ? -1 : 1 ;
            pre[start] += val ;
            pre[end+1] -= val ;
        }
        for(int i=1 ; i<n ; i++){
            pre[i] += pre[i-1] ;
        }

        char[] chars = s.toCharArray() ;
        for(int i=0 ; i<n ; i++){
            long totalshifts = pre[i] ;
            totalshifts = ((totalshifts)%26 + 26 )%26 ;
            int newChar = (chars[i] - 'a' + (int)totalshifts )%26 ;
            chars[i] = (char)('a' + newChar) ;
        }
        return new String(chars) ;
    }
}
