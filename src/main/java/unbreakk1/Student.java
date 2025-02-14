package unbreakk1;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
public class Student
{
    private int id;
    private String name;
    private String address;
    private String grade;

}
