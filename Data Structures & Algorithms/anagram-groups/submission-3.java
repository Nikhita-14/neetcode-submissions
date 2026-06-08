class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String word : strs){
            int[] count = new int[26];
            char[] ch = word.toCharArray();
            for(char c : ch)
            count[c-'a']++;
        StringBuilder freqString = new StringBuilder();
        for(int val : count){
            freqString.append(val);
            freqString.append('#');
        }
        String key = freqString.toString();
        if(!hm.containsKey(key)){
            hm.put(key, new ArrayList<>());
        }
        hm.get(key).add(word);
        }
        return new ArrayList<>(hm.values());
    }
}
