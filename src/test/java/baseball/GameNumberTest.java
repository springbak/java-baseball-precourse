package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GameNumberTest {
    @DisplayName("랜덤한 수의 자리수가 3자리인지, 각 자리수가 서로 다른 숫자인지 확인하는 테스트")
    @Test
    void getRandomNumberString() {
        int gameNumberLength = 3;
        GameNumber gameNumber = new GameNumber(gameNumberLength);
        String gameAnswer = gameNumber.getRandomNumberString();
        assertTrue(gameAnswer.length() == gameNumberLength && gameAnswer.charAt(0) != gameAnswer.charAt(1) && gameAnswer.charAt(0) != gameAnswer.charAt(2) && gameAnswer.charAt(1) != gameAnswer.charAt(2));
    }

}
