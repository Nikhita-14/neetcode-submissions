//1 Day Revision - Brute Force - Sorting T.C = O(m*nlongn) S.C=O(m*n)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String word : strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            if(!hm.containsKey(s)){
                hm.put(s, new ArrayList<>());
            }
            hm.get(s).add(word);
        }
        return new ArrayList<>(hm.values());
    }
}
