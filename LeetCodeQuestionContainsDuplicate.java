class Solution {
    public boolean containsDuplicate(int[] nums) {
      //Link to question https://leetcode.com/problems/contains-duplicate/
        Set<Integer> integerSet = new HashSet<Integer>(); //an unordered collection or list, where duplicate values are not allowed
        for (int i = 0; i < nums.length; i++) {
            if (integerSet.contains(nums[i])) // checking if the set already contains the integer
            {
                return true;
            }
            else {
                integerSet.add(nums[i]);
            }
        }
         return false;
    }
   
}
