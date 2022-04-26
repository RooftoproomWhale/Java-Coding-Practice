class Solution {
    public boolean solution(String s) {
        Stack<String> checkStack = new Stack<>();

        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                checkStack.push(s);
            }
            else if (checkStack.empty()) {
                return false;
            }
            else {
                checkStack.pop();
            }
        }

        if (checkStack.empty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
