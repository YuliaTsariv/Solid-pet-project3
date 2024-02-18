package solіd.segregationPrinciple.badPractice;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class BetCalculationStrategy implements ScoreCalculationStrategy {

    @Override
    public void calculateBet(String currency, List<Long> payments) {
        log.info("Process calculating bets:{}  with currency:{}", payments, currency);
    }

    @Override
    public void calculateWin(String currency, List<Long> payments) {
    }
}
