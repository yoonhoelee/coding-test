import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sArray = s.split(" ");
        Map<Character, String> map = new HashMap();
        ArrayList<String> checker = new ArrayList<>();
        boolean answer = true;
        char[] cArray = pattern.toCharArray();
        if(cArray.length != sArray.length){
            return false;
        }
        for(int i=0; i<cArray.length; i++){
            char c = cArray[i];
            String a = sArray[i];
            if(!map.containsKey(c)){
                if(checker.contains(a)){
                    answer = false;
                }
                else{
                    map.put(c, a);
                    checker.add(a);
                }
            }
            if(map.containsKey(c) && !map.get(c).equals(a)){
                answer = false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        Solution solution = new Solution();
        boolean result = solution.wordPattern(pattern, s);
        System.out.println("result: " + result);
    }
}
