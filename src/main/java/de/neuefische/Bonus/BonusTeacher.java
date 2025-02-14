package de.neuefische.Bonus;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record BonusTeacher(int id, String name, String subject)
{
}
