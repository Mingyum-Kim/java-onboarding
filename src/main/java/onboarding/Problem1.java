package onboarding;

import java.util.List;

class Problem1 {

    private static final Integer EXCEPTION_NUMBER = -1;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if(isNotIntegerList(pobi) || isNotIntegerList(crong)){
            return EXCEPTION_NUMBER;
        }

        if(isOutOfRange(pobi) || isOutOfRange(crong)){
            return EXCEPTION_NUMBER;
        }

        if(isNotTwoElements(pobi) || isNotTwoElements(crong)){
            return EXCEPTION_NUMBER;
        }

        int answer = 0;
        return answer;
    }

    private static boolean isNotIntegerList(List<Integer> pages){
        return pages.get(0).getClass() != Integer.class && pages.get(1).getClass() != Integer.class;
    }

    private static boolean isOutOfRange(List<Integer> pages){
        return (pages.get(0) < 1 || pages.get(0) > 400) || (pages.get(1) < 1 || pages.get(1) > 400);
    }

    private static boolean isNotTwoElements(List<Integer> pages){
        return pages.size() != 2;
    }
}