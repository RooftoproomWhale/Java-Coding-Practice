import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        List<String> check = new ArrayList<>();
        boolean chkFlag = true;

        for (int i = 0; i< words.length; i++) {
            if (check.contains(words[i])) {
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                chkFlag = false;
                break;
            }

            check.add(words[i]);

            if (i != 0 && words[i].charAt(0) != words[i-1].charAt(words[i-1].length() - 1)) {
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                return answer;
            }

        }

        if (chkFlag) {
            answer = new int[2];
        }

        return answer;
    }
}