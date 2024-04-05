package solіd.liskov.badPractice;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class BetCalculationStrategy extends ScoreCalculationStrategy {

    //method change behavior of the parent class
    @Override
    public void calculateScore(String currency, List<Long> payments) {
        log.info("Process calculating score");
        validatePayments(payments);
    }

    private static void validatePayments(List<Long> payments) {
        log.info("Validate list of payments:{}", payments);
    }
}
