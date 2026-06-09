// 1 Day Revision - Optimal - Frequency Array
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String word : strs){
            int[] count = new int[26];
            char[] arr = word.toCharArray();
            for(char c : arr){
                count[c-'a']++;
            }
            StringBuilder str = new StringBuilder();
            for(int val : count){
                str.append(val);
                str.append('#');
            }
            String key = str.toString();
            if(!hm.containsKey(key)){
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(word);
        }
        return new ArrayList<>(hm.values());
    }
}
