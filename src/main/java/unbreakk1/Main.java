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

          //Update with @With
          Student updatedStudent1 = student1.withName("Johnny Doughnut").withGrade("A++");
          System.out.println("Original Student: " + student1);
          System.out.println("Updated Student: " + updatedStudent1);


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

          // update with @With
          Teacher updatedTeacher = teacher.withName("Dr. Mango").withSubject("Tropical Fruits");
          System.out.println("\nOriginal Teacher: " + teacher);
          System.out.println("Updated Teacher: " + updatedTeacher);


          List<Student> studentList = new ArrayList<>();
          studentList.add(student1);
          studentList.add(student2);
          studentList.add(student3);

          Course course = new Course(101, "Intro to Food Studies", teacher, studentList);

          //update with @With
          Course updatedCourse = course
                .withName("Advanced Food Studies")
                .withTeacher(updatedTeacher)
                .withStudents(List.of(student2, student3));

          System.out.println("\nOriginal Course: " + course);
          System.out.println("Updated Course: " + updatedCourse);


          System.out.println("Course Information:");
          System.out.println("Course ID: " + course.getId());
          System.out.println("Course Name: " + course.getName());
          System.out.println("Teacher: " + course.getTeacher().name());
          System.out.println("\nEnrolled Students:");
          for (Student student : course.getStudents())
          {
              System.out.println("- " + student.getName() + " (" + student.getGrade() + ")");
          }

          Student student4 = Student.builder().id(4).name("John Doe").address("123 Maple Street").grade("A").build();Student student5 = Student.builder()
            .id(5)
            .name("Jane Smith")
            .address("456 Oak Avenue")
            .grade("B+")
            .build();Student student6 = Student.builder()
            .id(6)
            .name("Alice Brown")
            .address("789 Pine Lane")
            .grade("A+")
            .build();

          Teacher teacher2 = Teacher.builder()
                .id(2)
                .name("Dr. Emily Carter")
                .subject("Computer Science")
                .build();

         List<Student> initialStudents = new ArrayList<>();
         initialStudents.add(student4);
         initialStudents.add(student5);
         Course course2 = Course.builder()
                .id(102)
                .name("Introduction to Programming")
                .teacher(teacher)
                .students(initialStudents)
                .build();

         System.out.println("Initial Course:");
         System.out.println(course2);

         List<Student> updatedStudents = new ArrayList<>(course.getStudents());
         updatedStudents.add(student6);

         Course updatedCourse2 = Course.builder()
                .id(course.getId())
                .name(course.getName())
                .teacher(course.getTeacher())
                .students(updatedStudents)
                .build();

         System.out.println("\nUpdated Course:");
         System.out.println(updatedCourse2);

    }
}