package solіd.segregationPrinciple.badPractice;

import java.util.List;

public interface ScoreCalculationStrategy {
     void calculateBet(String currency, List<Long> payments);
     void calculateWin(String currency, List<Long> payments);
}
