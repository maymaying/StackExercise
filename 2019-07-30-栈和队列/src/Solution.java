import java.util.ArrayList;

//括号匹配问题
public class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.add(c);
                    break;
                case ')':
                case ']':
                case '}': {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char left = stack.remove(stack.size() - 1);
                    if (!((left == '(' && c == ')')
                        || (left == '[' && c == ']')
                        || (left == '{' && c == '}'))) {

                        return false;
                    }
                    break;
                }
                default:
                    break;
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
