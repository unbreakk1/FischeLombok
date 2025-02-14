package de.neuefische.Bonus;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
public class BonusStudent
{
    private int id;
    private String name;
    private String address;
    private String grade;
}
