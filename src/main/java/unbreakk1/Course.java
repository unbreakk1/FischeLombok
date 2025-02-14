package unbreakk1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course
{
    private int id;
    private String name;
    private Teacher teacher; // Using the Teacher record created earlier
    private List<Student> students; // List to store students enrolled in the course
}