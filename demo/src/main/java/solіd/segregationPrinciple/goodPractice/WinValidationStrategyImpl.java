package solіd.segregationPrinciple.goodPractice;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class WinValidationStrategyImpl implements WinCalculationStrategy {

    @Override
    public void calculateWin(String currency, List<Long> payments) {
        log.info("Process calculating bets:{}  with currency:{}", payments, currency);
    }
}

