package firstModuleNeetCode;

public class isAnagram {

    public boolean isAnagram (String s , String r){

        if (s.length()!=r.length()){
            return false ;
        }
            int [] count =  new int[26];
            for (int i = 0; i < s.length(); i++) {

                count[s.charAt(i)-'a']++;
                count[r.charAt(i)-'a']--;
            }
        for (int val = 0; val <count.length ; val++) {
            if (count[val] !=0){
                return false;
            }

        }
            return true;

        }
    }
