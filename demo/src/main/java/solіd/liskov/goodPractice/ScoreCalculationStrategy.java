package solіd.liskov.goodPractice;

import java.util.List;

public interface ScoreCalculationStrategy {
    public void calculateScore(String currency, List<Long> payments);
}
