class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashSet<String> phNum = new HashSet<>(Arrays.asList(phone_book));

        for (String ph_number : phone_book) {
            for (String num : phNum) {
                if (ph_number.equals(num)== false && num.startsWith(ph_number)) {
                    return false;
                }
            }
        }

        return answer;
    }
}
