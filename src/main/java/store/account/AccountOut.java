package store.account;

import java.io.Serializable;
import lombok.Builder;

@Builder
public record AccountOut(
    String id,
    String name,
    String email
) implements Serializable {
    private static final long serialVersionUID = 1L;
}
