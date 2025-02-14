package de.neuefische.Bonus;


import lombok.*;


import java.util.List;

@Value
@Data
@AllArgsConstructor
@Builder
@With
public class BonusCourse
{
    int id;
    String name;
    BonusTeacher teacher; // Using the Teacher record created earlier
    List<BonusStudent> students; // List to store students enrolled in the course
}
