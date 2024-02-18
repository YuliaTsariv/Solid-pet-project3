package solіd.singleResponsibility.goodPractice.mapper;

import solіd.model.BingoTypeConfig;
import solіd.model.BingoTypeConfigPayload;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RoundConfigConvertor {
    public BingoTypeConfigPayload mapToBingoTypeResult(BingoTypeConfig bingoTypeConfig) {
        log.info("Procces mapping bingoTypeConfig {} tp bingoTypeConfigPayload ", bingoTypeConfig);
        return new BingoTypeConfigPayload();
    }
}
