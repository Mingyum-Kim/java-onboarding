package onboarding;

import java.util.List;

class Problem1 {

    private static final Integer EXCEPTION_NUMBER = -1;

    private static final Integer POBY_WIN = 1;

    private static final Integer CRONG_WIN = 2;

    private static final Integer TIE = 0;

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
        if(isNotSidePage(pobi) || isNotSidePage(crong)) {
            return EXCEPTION_NUMBER;
        }

        Integer pobiScore = getLargerScoreFromList(pobi);
        Integer crongScore = getLargerScoreFromList(crong);

        int answer = getAnswerByComparing(pobiScore, crongScore);
        return answer;
    }


    private static int getAnswerByComparing(Integer pobiScore, Integer crongScore) {
        if(pobiScore > crongScore){
            return POBY_WIN;
        } else if (pobiScore < crongScore){
            return CRONG_WIN;
        } else {
            return TIE;
        }
    }

    private static Integer getLargerScoreFromList(List<Integer> pages){
        Integer sumDigitOfLeft = computeSumOfDigit(pages.get(0));
        Integer sumDigitOfRight = computeSumOfDigit(pages.get(1));

        Integer multiDigitOfLeft = computeMultiOfDigit(pages.get(0));
        Integer multiDigitOfRight = computeMultiOfDigit(pages.get(1));

        return Math.max(
                Math.max(sumDigitOfLeft, sumDigitOfRight),
                Math.max(multiDigitOfLeft, multiDigitOfRight)
        );
    }

    private static Integer computeSumOfDigit(Integer page){
        String pageString = page.toString();
        Integer result = 0;
        for(int i = 0; i < pageString.length(); i++){
            result += Character.getNumericValue(pageString.charAt(i));
        }
        return result;
    }

    private static Integer computeMultiOfDigit(Integer page){
        String pageString = page.toString();
        Integer result = 1;
        for(int i = 0; i < pageString.length(); i++){
            result *= Character.getNumericValue(pageString.charAt(i));
        }
        return result;
    }

    private static boolean isNotIntegerList(List<Integer> pages){
        return pages.get(0).getClass() != Integer.class || pages.get(1).getClass() != Integer.class;
    }

    private static boolean isOutOfRange(List<Integer> pages){
        return (pages.get(0) < 1 || pages.get(0) > 400) || (pages.get(1) < 1 || pages.get(1) > 400);
    }

    private static boolean isNotTwoElements(List<Integer> pages){
        return pages.size() != 2;
    }

    private static boolean isNotSidePage(List<Integer> page) {
        return page.get(0) + 1  != page.get(1);
    }
}