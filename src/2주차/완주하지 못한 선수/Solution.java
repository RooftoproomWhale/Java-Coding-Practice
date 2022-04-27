public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> complete = new HashMap<>();

        for(String name : participant) {
            complete.put(name, complete.getOrDefault(name, 0) + 1);
        }
        for (String name : completion) {
            complete.put(name, complete.get(name) - 1);
        }

        for (String key : complete.keySet()) {
            if (complete.get(key) > 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}