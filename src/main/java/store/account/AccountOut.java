package store.account;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder @Accessors(fluent = true)
public record AccountOut implements Serializable(
    private static final long serialVersionUID = 1L;
    String id,
    String name,
    String email
) {
}
