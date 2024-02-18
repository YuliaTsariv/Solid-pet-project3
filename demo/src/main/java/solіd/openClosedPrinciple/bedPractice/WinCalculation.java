package solіd.openClosedPrinciple.bedPractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WinCalculation implements ServiceCalculation {
    public void calculateRoundResult() {
      log.info("Process roundResult according to win");
    }
}
