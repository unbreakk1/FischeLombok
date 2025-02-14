package unbreakk1;


import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("John Dough");
        student1.setAddress("123 Bread Lane");
        student1.setGrade("A+");

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Jane Fries");
        student2.setAddress("456 Potato Street");
        student2.setGrade("B");

        Student student3 = new Student();
        student3.setId(3);
        student3.setName("Tom Ato");
        student3.setAddress("789 Fruit Avenue");
        student3.setGrade("A");

        Teacher teacher = new Teacher(1, "Professor Avocado", "Advanced Fruit Studies");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Course course = new Course(101, "Intro to Food Studies", teacher, studentList);

        System.out.println("Course Information:");
        System.out.println("Course ID: " + course.getId());
        System.out.println("Course Name: " + course.getName());
        System.out.println("Teacher: " + course.getTeacher().name());
        System.out.println("\nEnrolled Students:");
        for (Student student : course.getStudents())
        {
            System.out.println("- " + student.getName() + " (" + student.getGrade() + ")");
        }
    }
}