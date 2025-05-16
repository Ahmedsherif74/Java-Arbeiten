package firstModuleNeetCode;


import java.util.HashMap;
import java.util.Hashtable;

public class isAnagram2 {
    public boolean isAnagram2(String s , String t){
        HashMap<Character, Integer> tableS = new HashMap<>();

        HashMap<Character, Integer> tableT = new HashMap<>();

        if (s.length()!=t.length()){
            return false ;
        }
        for (int i=0 ; i< s.length(); i++){
            tableT.put(t.charAt(i) ,tableT.getOrDefault(t.charAt(i),0)+1);
            tableS.put(s.charAt(i) ,tableS.getOrDefault(s.charAt(i),0)+1);
        }
        return tableT.equals(tableS);
    }

    public static void main(String[] args) {
        isAnagram2 checker = new isAnagram2();

        System.out.println(checker.isAnagram2("abbb" , "abbb"));



    }
}
