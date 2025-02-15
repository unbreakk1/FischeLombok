package unbreakk1;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
public class Course
{
    private int id;
    private String name;
    private Teacher teacher; // Using the Teacher record created earlier
    private List<Student> students; // List to store students enrolled in the course
}