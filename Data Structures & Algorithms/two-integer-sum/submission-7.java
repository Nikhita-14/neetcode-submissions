//Better Approach - Sorting and Searching. T.C = O(nlogn) S.C = O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] original = nums.clone();
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]==target){
                int l=linearSearchforward(original, nums[left]);
                int j=linearSearchbackward(original, nums[right]);
                return new int[]{Math.min(l,j), Math.max(l,j)};
            }else if((nums[left]+nums[right])>target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{};
    }
    int linearSearchforward(int[] arr, int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n) return i;
        }
        return -1;
    }
    int linearSearchbackward(int[] arr, int n){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==n) return i;
        }
        return -1;
    }
}
