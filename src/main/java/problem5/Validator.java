package problem5;

public class Validator {
    private final int money;

    public Validator(int money) {
        this.money = money;
    }

    public void validate() {
        validateNaturalNumber();
    }

    private void validateNaturalNumber() {
        String money = String.valueOf(this.money);
        if(!money.matches("^[0-9]*$")) {
            throw new IllegalArgumentException("입력값은 자연수이어야 합니다.");
        }
    }
}
