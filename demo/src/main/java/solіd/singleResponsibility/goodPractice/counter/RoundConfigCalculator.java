package solіd.singleResponsibility.goodPractice.counter;

import solіd.model.RoundConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
public class RoundConfigCalculator {
    public BigDecimal calculateContributions(RoundConfig roundConfig) {
        log.info("Process calculating contribution in round :{}", roundConfig);
        return BigDecimal.ZERO;
    }
}
