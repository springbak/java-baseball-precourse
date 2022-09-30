package baseball;

public class InputValidation {
    private int gameNumberLength;

    public InputValidation(int length) {
        this.gameNumberLength = length;
    }

    public void validateInputNumberFromUser(String input) {

        if (input.equals(""))
            throw new IllegalArgumentException("입력값이 없습니다. " + gameNumberLength + "자리 수를 입력해주세요!!!!");
        try {
            Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("입력값에 숫자가 아닌 값이 포함되어 있습니다. " + gameNumberLength + "자리 숫자를 입력해주세요!!!!");
        }
        if (input.length() != gameNumberLength)
            throw new IllegalArgumentException("입력값의 자리수가 너무 적거나 많습니다. " + gameNumberLength + "자리 수를 입력해주세요!!!!");

    }
}
