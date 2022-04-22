public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int temp = 0; // 합용 임시 변수

        // 1. 모든 경우의 수 따지기
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j< nums.length; j++) {
                for (int k = j+1; k<nums.length; k++) {
                    temp = nums[i] + nums[j] + nums[k];
                    if (checkPrime(temp)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private boolean checkPrime(int chkNum) {
        boolean prime = true;

        for(int i = 2; i <= Math.sqrt(chkNum); i++) {
            if (chkNum % i == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }
}