class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] freq= new char[26];
        for(char ch : s.toCharArray()) 
        freq[ch-'a']++;
        for(char ch : t.toCharArray())
        freq[ch-'a']--;
        for(int count : freq){
            if(count!=0) return false;
        }
        return true;
    }
}
