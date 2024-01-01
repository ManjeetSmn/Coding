class Solution {
  //LeetCode Link : https://leetcode.com/problems/group-anagrams/
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sortedStrs = new String[strs.length];

        // create a duplicate array with sorted String
        for (int i = 0; i < strs.length; i++) {
            sortedStrs[i] = sortString(strs[i]);
        }

        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        // sorted words as key and value as the array list of the words corresponding to
        // that sorted key

        for (int i = 0; i < strs.length; i++) {
            if (!hm.containsKey(sortedStrs[i])) { // if sorted word is not present as the key then put in the map with
                                                  // sorted word as key and an new arrayList object as the value
                hm.put(sortedStrs[i], new ArrayList<>());
            }
            // adding to the arraylist corresponding to the key (sorted word), so that
            // sorted word is the key and corresponding actual word is one of the value of the arrayList
            hm.get(sortedStrs[i]).add(strs[i]); // very imp: to add to the array list at sortedStrs[i] key
        }

        List<List<String>> resultList = new ArrayList<>();

        // iterating through Map to create final result
        for (Map.Entry<String, ArrayList<String>> mapElement : hm.entrySet()) {
            resultList.add(mapElement.getValue());
        }

        return resultList;

    }

    public String sortString(String s) {
        char[] charArray = new char[s.length()];
        charArray = s.toCharArray();
        Arrays.sort(charArray);
        return Arrays.toString(charArray);
    }
}
