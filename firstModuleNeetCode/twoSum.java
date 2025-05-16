package firstModuleNeetCode;
import java.util.Arrays;
import java.util.HashMap;
public class twoSum {
    public int[] twoSum (int [] nums , int target){
        HashMap<Integer , Integer> values=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            values.put(nums[i], i);
        }
        int []  bew ;
        for (int i = 0; i < nums.length; i++) {
           int difference=target-nums[i];
           if (values.containsKey(difference) && values.get(difference)!=i ){
               return new int[]{i , values.get(difference)};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        twoSum checker = new twoSum();
        int[] result = checker.twoSum(new int[]{1, 2, 5}, 7);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
