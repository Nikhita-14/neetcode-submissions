class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String word : strs){
            int[] count = new int[26];
            for(char c : word.toCharArray()){
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
