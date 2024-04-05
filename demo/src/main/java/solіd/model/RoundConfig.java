package solіd.model;


import lombok.*;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoundConfig {

    private Long id;

    private String name;

    private Map<String, String> gameNames = new HashMap<>();

    private String bingoType;

    private Integer lastChanceToBuyDuration;

    private Integer purchaseDuration;

    private Integer callRate;

    private BigDecimal rake;

    private String defaultCurrency;

    private Integer maxTicketsPerPlayer;

    private Integer minTicketsPerRound;

    private Integer maxTicketsPerRound;


    private List<Integer> quickBuyOptions;

    private boolean deleted;

    private String language;

    private Map<String, BigDecimal> prices;
}

