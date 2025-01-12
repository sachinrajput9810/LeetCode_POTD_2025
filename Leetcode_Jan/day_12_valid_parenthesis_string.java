public class day_12_valid_parenthesis_string {
    public boolean canBeValid(String s, String locked) {
        int n = s.length() ;
        if(n%2 != 0) return false ;
        Stack<Integer> unlockedBrackets = new Stack<>() ;
        Stack<Integer> openBrackets = new Stack<>() ;

        for(int i=0 ; i<n ; i++){
            if(locked.charAt(i) == '0') unlockedBrackets.push(i) ;
            else if(s.charAt(i) == '('){
                openBrackets.push(i) ;
            }
            else{
                if(!openBrackets.isEmpty()){
                    openBrackets.pop() ;
                }
                else if(!unlockedBrackets.isEmpty()){
                    unlockedBrackets.pop() ;
                }
                else return false ;
            }
        }

        while(!unlockedBrackets.isEmpty() && !openBrackets.isEmpty() && (openBrackets.peek() < unlockedBrackets.peek() )){
            openBrackets.pop() ;
            unlockedBrackets.pop() ;
        }

        if(!openBrackets.isEmpty()) return false ;
        return true ;

    }
}
