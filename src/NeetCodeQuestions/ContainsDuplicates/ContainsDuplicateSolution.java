package NeetCodeQuestions.ContainsDuplicates;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (final int num : nums)
            if (!seen.add(num))
                return true;

        return false;
    }
}
