package solіd.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BingoTypeConfigPayload {
    Long id;
    String type;
    boolean isModifiable;
    Integer maxNumberOfParts;
}