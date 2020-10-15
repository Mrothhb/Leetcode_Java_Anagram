class Solution {
    public boolean isAnagram(String s, String t) {
      char s_array[] = s.toCharArray();
      char t_array[] = t.toCharArray();
      Arrays.sort(t_array);
      Arrays.sort(s_array);
      
        if(Arrays.equals(t_array,s_array)){
            return true;
        }
        return false;
    }
}
