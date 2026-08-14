class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        // Frequency (value) batti ascending order
        list.sort((a,b)->b.getValue()-a.getValue());

        int[] answer = new int[k];
        // Highest frequency kosam back nunchi iterate
       for (int i = 0; i < k; i++) {
    answer[i] = list.get(i).getKey();
}
    return answer;
    }
}
