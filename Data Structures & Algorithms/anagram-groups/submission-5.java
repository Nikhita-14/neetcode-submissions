//Optimal Approach - Frequency HashMap T.C = O(m*n) and S.C = O(m*n)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String word : strs){
            char[] arr = word.toCharArray();
            int[] count = new int[26];
            for(char c : arr){
                count[c-'a']++;
            }
            StringBuilder s = new StringBuilder();
            for(int val : count){
                s.append(val);
                s.append('#');
            }
            String key = s.toString();
            if(!hm.containsKey(key)){
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(word);
        }
        return new ArrayList<>(hm.values());
    }
}
