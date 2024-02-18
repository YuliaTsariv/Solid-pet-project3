package solіd.liskov.goodPractice;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class BetCalculationStrategy implements ScoreCalculationStrategy {

    @Override
    public void calculateScore(String currency, List<Long> payments) {
        log.info("Process calculating score");
        log.info("Do some specific things that are only done during the calculation of the winnings ...");
        validatePayments(payments);
    }

    private static void validatePayments(List<Long> payments) {
        log.info("Validate list of payments:{}", payments);
    }
}
