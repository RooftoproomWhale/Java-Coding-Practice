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
        int count = 0;
        for (String s : sArr) {
            if (s.equals("(")) {
                count++;
            }
            else if(count == 0) {
                return false;
            }
            else {
                count--;
            }
        }

        if (count == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
