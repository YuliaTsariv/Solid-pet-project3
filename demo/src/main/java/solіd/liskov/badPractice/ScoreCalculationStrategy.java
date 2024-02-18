package solіd.liskov.badPractice;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ScoreCalculationStrategy {
    public void calculateScore(String currency, List<Long> payments) {
        log.info("Procces calculating score ");
    }
}
