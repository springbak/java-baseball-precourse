package baseball;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class GameNumber {
    int gameNumberLength;

    public GameNumber(int length) {
        gameNumberLength = length;
    }

    public String getRandomNumberString() {
        String gameAnswer = "";
        while (gameAnswer.length() < gameNumberLength) {
            gameAnswer = pickRandomNumber(gameAnswer);
        }
        return gameAnswer;
    }

    public String pickRandomNumber(String gameAnswer) {
        String pickedNumber = String.valueOf(pickNumberInRange(1, 9));
        if (!gameAnswer.contains(pickedNumber)) {
            gameAnswer += pickedNumber;
        }
        return gameAnswer;
    }
}
