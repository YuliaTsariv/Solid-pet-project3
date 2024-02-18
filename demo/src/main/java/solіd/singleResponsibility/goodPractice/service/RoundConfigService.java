package solіd.singleResponsibility.goodPractice.service;


import solіd.model.BingoTypeConfig;
import solіd.singleResponsibility.goodPractice.mapper.RoundConfigConvertor;
import solіd.singleResponsibility.goodPractice.validator.RoundConfigValidator;
import solіd.model.BingoTypeConfigPayload;
import solіd.model.RoundConfig;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.asList;

@Service
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class RoundConfigService {

    private static final List<String> VALID_SORT_FIELDS = asList("id", "name", "ticketPrice", "bingoType");
    public static final String MOCKED_LANG = "English";
    RoundConfigValidator roundConfigValidator;
    RoundConfigConvertor roundConfigConvertor;

    public void saveRoundConfig(RoundConfig roundConfig) {
        roundConfigValidator.validateRoundConfig(roundConfig);
        log.info("Save round config to repository");
    }

    public List<BingoTypeConfigPayload> getBingoTypeDetails() {

        var bingoTypeConfigs = List.of(new BingoTypeConfig());

        return bingoTypeConfigs.stream().map(roundConfigConvertor::mapToBingoTypeResult).toList();
    }
}

