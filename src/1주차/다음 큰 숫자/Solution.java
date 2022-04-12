public class Solution {
    public int solution(int n) {
        int answer = 0;

        String originBinary = Integer.toBinaryString(n);

        int tempNum = n; // 임시변수

        int num_1 = originBinary.length() - originBinary.replace("1","").length();
        int num_2 = 0;

        while(num_2 != num_1) {
            tempNum++;
            num_2 = Integer.toBinaryString(tempNum).length() - Integer.toBinaryString(tempNum).replace("1", "").length();
            answer = tempNum;
        }

        return answer;
    }
}
