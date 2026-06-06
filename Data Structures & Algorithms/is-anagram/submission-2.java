//Brute Force Sorting - O(nlogn + mlogm) and space is O(n+m)
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sarr=s.toCharArray();
        char[] tarr=t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        return Arrays.equals(sarr, tarr);
    }
}
