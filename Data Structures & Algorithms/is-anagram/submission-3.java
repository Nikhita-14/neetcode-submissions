//Optimal Approach - HashMap T.C= O(n+m) and S.C = O(1) because at most 26 characters
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hms=new HashMap<>();
        HashMap<Character, Integer> hmt=new HashMap<>();
        for(int i=0;i<s.length();i++)
        hms.put(s.charAt(i),hms.getOrDefault(s.charAt(i),0)+1);
        for(int i=0;i<t.length();i++)
        hmt.put(t.charAt(i),hmt.getOrDefault(t.charAt(i),0)+1);
        return hms.equals(hmt);
    }
}
