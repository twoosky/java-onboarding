package problem1;

import java.util.List;

public class Game {
    private final List<Integer> pobi;
    private final List<Integer> crong;
    private final int ERROR = -1;

    public Game(List<Integer> pobi, List<Integer> crong) {
        this.pobi = pobi;
        this.crong = crong;
    }

    public int run() {
        if (!inputValidate()) {
            throw new IllegalArgumentException("올바르지 않은 입력값입니다.");
        }
        int pobiScore = getScore(pobi);
        int crongSocre = getScore(crong);
        Winner winner = Winner.of(pobiScore, crongSocre);
        return winner.getResult();
    }

    private boolean inputValidate() {
        return validate(pobi) && validate(crong);
    }

    private boolean validate(List<Integer> pages) {
        Validation inputValidation = new Validation(pages);
        return inputValidation.validate();
    }

    private int getScore(List<Integer> pages) {
        Score score = new Score(pages);
        return score.getMaxScore();
    }
}
