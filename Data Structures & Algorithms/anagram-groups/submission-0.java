class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String word : strs){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String sortedWord = new String(ch);
            if(!hm.containsKey(sortedWord)){
                hm.put(sortedWord, new ArrayList<>());
            }
            hm.get(sortedWord).add(word);
        }
        return new ArrayList<>(hm.values());
    }
}
