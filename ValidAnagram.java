class Solution {
  // Leet code Link : https://leetcode.com/problems/valid-anagram/
    public boolean isAnagram(String s, String t) {
  
    int arr[] = new int [26]; // creating an array of 26 length , one for each alphabet .
        int i;
        
        if(s.length() != t.length())
            return false;
        
        for ( i =0 ; i<s.length(); i++)
        {
           arr[(int)s.charAt(i)-97] += 1; //incrementing array with one at aplphabets positons 
           arr[(int)t.charAt(i)-97] -= 1;//decrementing array with one at aplphabets positon when same alphabet is encountered
            
        }
        
        for(i=0; i< 26; i++)
        {
            if(arr[i]!=0)
                return false;
        }
        
        return true;
}
}
