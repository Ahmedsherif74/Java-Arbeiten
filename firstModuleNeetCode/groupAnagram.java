package firstModuleNeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagram {
    public List <List<String>> groupAnagrams(String[] strs){
        HashMap<String , List<String>> res =new HashMap<>();
        for (int i = 0; i <strs.length ; i++) {
            String s = strs[i];
            int[] count = new int[26];
            for (int j = 0; j <s.length() ; j++) {
                count [s.charAt(j)- 'a']++;
            }
            String key = Arrays.toString(count);
            if (!res.containsKey(key)){
                res.put(key , new ArrayList<>());
            }
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }

    public static void main(String[] args) {
        
        groupAnagram checker = new groupAnagram();
        System.out.println(checker.groupAnagrams(new String[]{"act","pots","tops","cat","stop","hat"}));
    }

}
