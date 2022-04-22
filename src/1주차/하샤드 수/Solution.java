class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int total = 0; // 자리수 합치기용 변수
        int originNum = x;

        while (originNum > 0) {
            total += originNum % 10;
            originNum /= 10;
        }

        if (x % total != 0) {
            answer = false;
        }

        return answer;
    }
}