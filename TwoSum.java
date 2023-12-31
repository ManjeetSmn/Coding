class Solution {
    public int[] twoSum(int[] nums, int target) {

      //LeetCode Link : https://leetcode.com/problems/two-sum/

        Map<Integer, Integer> hm = new HashMap<>(); // hashmap will have array element as key and it's 'index as value
        int[] result = new int[2]; // to store result

        for (int i = 0; i < nums.length; i++) {

            if (hm.containsKey(target - nums[i])) { // checking if compliment already exist as a key in the hashmap or
                                                    // not
                result[0] = hm.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            hm.put(nums[i], i);

        }
        return result;

    }
}
