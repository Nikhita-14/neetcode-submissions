// 1 Day Revision - Java Streams Distinct() Count() Method
class Solution {
    public boolean hasDuplicate(int[] nums) {
      return Arrays.stream(nums).distinct().count()<nums.length;
    }
}