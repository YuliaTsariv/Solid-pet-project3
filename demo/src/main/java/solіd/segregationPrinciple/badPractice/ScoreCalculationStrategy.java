package solіd.segregationPrinciple.badPractice;

import java.util.List;

public interface ScoreCalculationStrategy {
    public void calculateBet(String currency, List<Long> payments);
    public void calculateWin(String currency, List<Long> payments);
}
