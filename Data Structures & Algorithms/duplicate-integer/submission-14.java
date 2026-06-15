class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int element : nums){
            if(hs.contains(element)) return true;
            hs.add(element);
        }
        return false;
    }
}