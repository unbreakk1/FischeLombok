package unbreakk1;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public record Teacher(int id, String name, String subject)
{
}
