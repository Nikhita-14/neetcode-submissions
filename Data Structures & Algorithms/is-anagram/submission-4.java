//Optimal Approach - Array Increment Decrement T.C = O(n+m) S.C = O(1)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int element : arr){
            if(element != 0) return false;
        }
        return true;
    }
}
