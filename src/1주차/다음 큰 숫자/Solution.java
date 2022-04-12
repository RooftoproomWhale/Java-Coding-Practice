public class Solution {
    public int solution(int n) {
        int answer = n;

        int num_1 = Integer.bitCount(n);
        int num_2 = 0;

        while (num_1 != num_2) {
            answer++;
            num_2 = Integer.bitCount(answer);
        }

        return answer;
    }
}
