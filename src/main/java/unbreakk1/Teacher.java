package unbreakk1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.With;

@Builder
@With
public record Teacher(int id, String name, String subject)
{
}
