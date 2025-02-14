package de.neuefische.Bonus;

import java.util.List;

public record University(int id, String name, List<BonusCourse> courses)
{
}
