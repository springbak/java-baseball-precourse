package baseball;

/**
 * packageName    : baseball
 * fileName       : View
 * author         : BOM
 * date           : 2022-09-30
 * description    : 사용자 interface 기능을 하는 class
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-09-30        BOM       최초 생성
 */
public class View {

    public void printGameInterface(){
        System.out.print("숫자를입력해주세요:");
    }

    /*사용자 추측값에 대한 힌트를 출력하는 기능*/
    public void printResultOfGuess(int ballCount, int strikeCount) {
        String resultSentence = "";
        if (strikeCount == 0 && ballCount == 0) {
            System.out.println("낫싱");
            return;
        }

        if (ballCount > 0)
            resultSentence += ballCount + "볼 ";
        if (strikeCount > 0)
            resultSentence += strikeCount + "스트라이크";

        System.out.println(resultSentence);
    }
}
