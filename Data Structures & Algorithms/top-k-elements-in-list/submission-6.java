class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->hm.get(a)-hm.get(b));
        for(int val : hm.keySet()){
            minHeap.add(val);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[] res = new int[k];
        for(int i=k-1;i>=0;i--){
            res[i]=minHeap.poll();
        }
        return res;
    }
}
