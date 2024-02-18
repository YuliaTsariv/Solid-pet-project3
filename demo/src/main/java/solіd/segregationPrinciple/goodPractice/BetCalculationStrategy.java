package solіd.segregationPrinciple.goodPractice;

import java.util.List;

public interface BetCalculationStrategy {
    public void calculateBet(String currency, List<Long> payments);
}
