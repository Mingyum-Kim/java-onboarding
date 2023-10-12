package onboarding;

import java.util.Stack;

public class Problem2 {
    public static String solution(String cryptogram) {

        boolean isCompleted = false;
        Stack<Character> stack = new Stack<>();

        while(!isCompleted) {
            String temp = "";
            for(int i = 0; i < cryptogram.length() - 1; i++){
                if(!stack.empty() && stack.peek() == cryptogram.charAt(i)) {
                    stack.clear();
                } else if (cryptogram.charAt(i) != cryptogram.charAt(i + 1)){
                    temp += cryptogram.charAt(i);
                } else if (cryptogram.charAt(i) == cryptogram.charAt(i + 1)){
                    stack.push(cryptogram.charAt(i));
                }
            }

            // 마지막 문자 검사
            int last = cryptogram.length() - 1;
            if(stack.empty() || stack.peek() != cryptogram.charAt(last)){
                temp += cryptogram.charAt(last);
            }
        }

        String answer = "answer";
        return answer;
    }
}
