class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 1. 리스트만 사용
         List<Integer> completion = new ArrayList<>();
         List<Integer> answer = new ArrayList<>();

         for (int i = 0; i<progresses.length; i++) {
         completion.add((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));
         }

         int nth = 0;
         while(nth != completion.size()) {
         int daycnt = completion.get(nth);
         int cnt = 1;
         nth++;

         while(nth != completion.size() && daycnt >= completion.get(nth)) {
         cnt++;
         nth++;
         }
         answer.add(cnt);
         }

         return answer.stream().mapToInt(Integer::intValue).toArray();


         /*
        // 2. Queue 사용
        List<Integer> answer = new ArrayList();
        Queue<Integer> complete = new LinkedList();

        for(int i = 0; i<progresses.length; i++) {
            complete.add( (int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));
        }

        while(!complete.isEmpty()) {
            int daycnt = complete.poll();
            int cnt = 1;

            while (!complete.isEmpty() && daycnt >= complete.peek()) {
                cnt++;
                complete.poll();
            }
            answer.add(cnt);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
          */
    }
}
