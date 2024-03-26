package NeetCodeQuestions.ValidAnagram;

import java.util.ArrayList;
import java.util.Arrays;

public class ValidAnagramSolution {
    public boolean isAnagram(String s, String t) {
        char[] charsS = s.toCharArray();
        Arrays.sort(charsS);

        char[] charsT = t.toCharArray();
        Arrays.sort(charsT);

        String sortedS = new String(charsS);
        String sortedT = new String(charsT);

        return sortedS.equals(sortedT);
    }
}
