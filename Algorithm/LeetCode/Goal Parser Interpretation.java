// 1678. Goal Parser Interpretation (https://leetcode.com/problems/goal-parser-interpretation)

class Solution {

    // O(n) 0ms
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') sb.append('G');
            else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                sb.append('o');
                i++;
            } else {
                sb.append("al");
                i += 3;
            }
        }

        return sb.toString();
    }

    // 1ms
    public String interpret2(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}