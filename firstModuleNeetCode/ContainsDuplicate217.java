package firstModuleNeetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate217 sol = new ContainsDuplicate217();
        int[] testArray = {1, 2, 3, 4};
        System.out.println(sol.containsDuplicate(testArray));  // Should print: true
    }
}

