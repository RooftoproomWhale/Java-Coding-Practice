class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
         List<Integer> answer = new ArrayList();
         Queue<Integer> complete = new LinkedList();

         for(int i = 0; i<progresses.length; i++) {
              for (int j = 1; ; j++) {
                   if ( (speeds[i] * j) >= (100 - progresses[i]) ) {
                        complete.add(j);
                        break;
                   }
              }
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
    }
}
