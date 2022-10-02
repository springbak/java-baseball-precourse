package baseball;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class GameNumber {
    private int gameNumberLength;

    public GameNumber(int length) {
        this.gameNumberLength = length;
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

    public void getHintFromUserInput(String input, String gameAnswerNumber, Hint hint) {
        for (int i = 0; i < input.length(); i++) {
            checkInputByChar(input,gameAnswerNumber,i,hint);
        }
    }

    private void checkInputByChar(String input, String gameAnswerNumber, int i,Hint hint){
        if(gameAnswerNumber.contains(input.substring(i,i+1))){
            checkIfCharIsStrike(input,gameAnswerNumber,i,hint);
        }
    }
    private void checkIfCharIsStrike(String input, String gameAnswerNumber, int i,Hint hint){
        if(gameAnswerNumber.charAt(i)==input.charAt(i)) {
            hint.setStrike(hint.getStrike() + 1);
            return;
        }
        hint.setBall(hint.getBall() + 1);
    }
}
