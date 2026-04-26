class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums)
            map.put(n, map.getOrDefault(n, 0) + 1);

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (buckets[frequency] == null)
                buckets[frequency] = new ArrayList<>();
            buckets[frequency].add(key);
        }

        List<Integer> result = new ArrayList<>();
        for (int i=buckets.length-1; i>=0 && result.size()<k; i--){
            List<Integer> list = buckets[i];
            if(list != null)
                for (int j=0; j<list.size() && result.size()<k; j++)
                    result.add(list.get(j));
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
