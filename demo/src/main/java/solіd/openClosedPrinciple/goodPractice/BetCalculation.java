package solіd.openClosedPrinciple.goodPractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BetCalculation implements ServiceCalculation {
    @Override
    public void calculateRoundResult() {
        log.info("Process roundResult according to bet");
    }
}
