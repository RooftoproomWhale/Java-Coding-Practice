class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int total = 0; // 자리수 합치기용 변수

        // 1. 자리수 구하기 및 합치기
        String[] temp = String.valueOf(x).split("");
        for (String s : temp) {
            total += Integer.parseInt(s);
        }

        if (x % total != 0) {
            answer = false;
        }

        return answer;
    }
}