package onboarding;

public class Problem3 {


    public static int solution(int number) {
        int[] dp = new int[10001];

        for(int i = 1; i <= number; i++){
            dp[i] = dp[i - 1] + count369OfNumber(i);
        }
        int answer = dp[number];
        return answer;
    }

    private static int count369OfNumber(int number) {

    }
}
