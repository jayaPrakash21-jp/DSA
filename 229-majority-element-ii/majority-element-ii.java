class Solution {
    public List<Integer> majorityElement(int[] nums) {

        ArrayList<Integer> jp = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check frequency
        for (int num : map.keySet()) {
            if (map.get(num) > n / 3) {
                jp.add(num);
            }
        }

        return jp;
    }
}