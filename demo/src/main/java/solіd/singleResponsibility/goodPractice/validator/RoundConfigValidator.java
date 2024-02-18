package solіd.singleResponsibility.goodPractice.validator;

import solіd.model.RoundConfig;
import solіd.singleResponsibility.goodPractice.counter.RoundConfigCalculator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RoundConfigValidator {
    RoundConfigCalculator roundConfigCalculator;
    public void validateRoundConfig(RoundConfig roundConfig) {
        validateTicketData(roundConfig);
        validateDuration(roundConfig);
        validatePatternPrizes(roundConfig);
        validateQuickByOptions(roundConfig);
    }

    private void validateTicketData(RoundConfig roundConfig) {
        log.info("Validate tickets data of roundConfig: {}", roundConfig);
    }

    private void validateDuration(RoundConfig roundConfig) {
        log.info("Validate duration of roundConfig: {}",roundConfig);
    }

    private void validatePatternPrizes(RoundConfig roundConfig) {
        log.info("Calculate contributors and according to result check or roundConfig is valid");
        roundConfigCalculator.calculateContributions(roundConfig);
        log.info("Validate pattern prizes of roundConfig: {}",roundConfig);
    }

    private void validateQuickByOptions(RoundConfig roundConfig) {
        log.info("Validate quick by options of roundConfig: {}",roundConfig);
    }
}
