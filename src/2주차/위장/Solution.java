public class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> combination = new HashMap<>();

        /* 종류 가짓수 구하기
        for(int i = 0; i<clothes.length; i++) {
            String kinds = clothes[i][1];
            combination.put(kinds, combination.getOrDefault(kinds,0)+1);
        }
         */

        for (String[] s : clothes) {
            combination.put(s[1], combination.getOrDefault(s[1],0)+1);
        }

        // 가짓수에 따른 경우의 수 모두 뽑기
        for (String key : combination.keySet()) {
            if (combination.get(key) > 0) {
                answer *= (combination.get(key)+1);
            }
        }

        // 모두 안 입는 경우의 수 1가지 제외
        return answer-1;
    }
}