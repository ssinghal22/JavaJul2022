package javaTests.easyOnes;

import java.util.HashMap;
import java.util.Stack;
//valid when brackets are not first opening, then closing; only in pairs

public class Brackets {
    public static void main(String[] args) {
        System.out.println(isValidCode("<<)(>>"));
    }
    private static boolean isValidCode(String code) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> brackets = new HashMap<Character, Character>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('<', '>');
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');
        brackets.put('>', '<');

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            if (!stack.empty() && stack.peek().equals(ch)) {
                stack.pop();
            }
            else if (brackets.containsKey(ch)) {
                stack.push(brackets.get(ch));
            }
        }
        return stack.empty();
}
}
