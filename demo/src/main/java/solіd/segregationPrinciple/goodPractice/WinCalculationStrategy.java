package solіd.segregationPrinciple.goodPractice;

import java.util.List;

public interface WinCalculationStrategy {
    public void calculateWin(String currency, List<Long> payments);

}
