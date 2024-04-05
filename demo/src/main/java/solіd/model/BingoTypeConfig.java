package solіd.model;

import lombok.Data;

@Data
public class BingoTypeConfig {
    private Long id;

    private String type;

    private boolean isModifiable;

    private Integer maxNumberOfParts;
}

