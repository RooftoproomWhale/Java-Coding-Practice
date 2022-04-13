public class Solution {
    public int solution(int n) {
        int answer = 0;

        /**
        여기서 질문, String 메소드와 직접 구하는 방식이랑 무슨 차이가 있을까?

         음... 나름대로 생각해 본 요소
         1. 연산 속도 면에서 직접 구하는 방식이 더 월등할 것이다.
         Why? -> 형변환 과정이 필요하다. 즉, 직접 구하는 방식에서는 필요 없던 별도의 연산 과정이 추가되기 때문이다.( Integer.parseInt() )
        */

        int origin_count = 0; // 원래 수의 이진법 1 카운트 변수
        int plus_count = 0; // 늘리는 수의 이진법 1 카운트 변수

        // * 이진법 수 변환 중 1만 카운팅하는 로직.
        origin_count = checkNum(n);

        while (origin_count != plus_count) {
            n++;
            plus_count = checkNum(n);
            answer = n;
        }

        return answer;
    }

    private int checkNum(int n) {
        int count = 0;
        while (n > 0) {
            if(n % 2 == 1) {
                count++;
                n /= 2;
            }
            else {
                n /= 2;
            }
        }

        return count;
    }
}
