package solіd.singleResponsibility.badPractice;


import solіd.model.BingoTypeConfig;
import solіd.model.BingoTypeConfigPayload;
import solіd.model.RoundConfig;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

import static java.util.Arrays.asList;

@Service
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class RoundConfigService {

    private static final List<String> VALID_SORT_FIELDS = asList("id", "name", "ticketPrice", "bingoType");
    public static final String MOCKED_LANG = "English";


    public void saveRoundConfig(RoundConfig roundConfig) {
        validateRoundConfig(roundConfig);
        log.info("Save round config to repository");
    }

    public List<BingoTypeConfigPayload> getBingoTypeDetails() {

        var bingoTypeConfigs = List.of(new BingoTypeConfig());

        return bingoTypeConfigs.stream().map(entry -> mapToBingoTypeResult(entry)).toList();
    }


    private void validateRoundConfig(RoundConfig roundConfig) {
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
        calculateContributions(roundConfig);
        log.info("Validate pattern prizes of roundConfig: {}",roundConfig);
    }

    private void validateQuickByOptions(RoundConfig roundConfig) {
        log.info("Validate quick by options of roundConfig: {}",roundConfig);
    }

    private BigDecimal calculateContributions(RoundConfig roundConfig) {
        log.info("Process calculating contribution in round :{}", roundConfig);
        return BigDecimal.ZERO;
    }

    private BingoTypeConfigPayload mapToBingoTypeResult(BingoTypeConfig bingoTypeConfig) {
       log.info("Process mapping bingoTypeConfig {} tp bingoTypeConfigPayload ", bingoTypeConfig);
        return new BingoTypeConfigPayload();
    }
}

