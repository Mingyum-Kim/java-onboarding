package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {

        while(true){
            if(cryptogram.length() == 0 || cryptogram.length() == 1) break;
            boolean isCompleted = true;

            String temp = ""; // 중복 제거한 문자열
            if(cryptogram.charAt(0) != cryptogram.charAt(1)) {
                temp += cryptogram.charAt(0);
            } else {
                isCompleted = false;
            }

            for(int i = 1; i < cryptogram.length() - 1; i++){
                if(cryptogram.charAt(i) != cryptogram.charAt(i - 1) && cryptogram.charAt(i + 1) != cryptogram.charAt(i)){
                    temp += cryptogram.charAt(i);
                } else {
                    isCompleted = false;
                }
            }

            int last = cryptogram.length() - 1;
            if(cryptogram.charAt(last) != cryptogram.charAt(last - 1)){
                temp += cryptogram.charAt(last);
            } else {
                isCompleted = false;
            }

            if(isCompleted) break;
            cryptogram = temp;
        }
        String answer = cryptogram;
        return answer;
    }
}
