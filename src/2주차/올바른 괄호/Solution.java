class Solution {
    public boolean solution(String s) {
        if (s.startsWith("(") && s.endsWith(")")) {
            return checkCount(s.split(""));
        }
        else {
            return false;
        }
    }

    private boolean checkCount(String[] sArr) {
        Stack<String> checkStack = new Stack<>();

        for (String s : sArr) {
            if (s.equals("(")) {
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
