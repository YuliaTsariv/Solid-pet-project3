package solіd.openClosedPrinciple.bedPractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ServiceCalculation {
    ActionType actionType;

    public void calculateResult(ActionType actionType) {
        if (actionType.equals(ActionType.BET)) {
            calculateBetResult();
        } else if (actionType.equals(ActionType.WIN)) {
            calculateWinResult();
        }
    }

    private void calculateWinResult() {
        log.info("Process roundResult according to bet");
    }

    private void calculateBetResult() {
        log.info("Process roundResult according to bet");
    }
}
