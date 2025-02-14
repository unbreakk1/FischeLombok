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

      //  // Create Students using Builder
      //  Student student1 = Student.builder()
      //          .id(1)
      //          .name("John Dough")
      //          .address("123 Bread Lane")
      //          .grade("A+")
      //          .build();
//
      //  Student student2 = Student.builder()
      //          .id(2)
      //          .name("Jane Fries")
      //          .address("456 Potato Street")
      //          .grade("B")
      //          .build();
//
      //  Student student3 = Student.builder()
      //          .id(3)
      //          .name("Tom Ato")
      //          .address("789 Fruit Avenue")
      //          .grade("A")
      //          .build();
//
      //  // Test Lombok-generated Builder.toString() for Student
      //  System.out.println("Testing Student Builder:");
      //  System.out.println(student1);
      //  System.out.println(student2);
      //  System.out.println(student3);
//
      //  // Create Teacher using Builder
      //  Teacher teacher = Teacher.builder()
      //          .id(1)
      //          .name("Professor Avocado")
      //          .subject("Advanced Fruit Studies")
      //          .build();
//
      //  // Add Students to a List
      //  List<Student> studentList = new ArrayList<>();
      //  studentList.add(student1);
      //  studentList.add(student2);
      //  studentList.add(student3);
//
      //  // Create Course using Builder
      //  Course course = Course.builder()
      //          .id(101)
      //          .name("Intro to Food Studies")
      //          .teacher(teacher)
      //          .students(studentList)
      //          .build();
//
      //  // Test Lombok's generated Course Builder
      //  System.out.println("\nTesting Course Builder:");
      //  System.out.println(course);
//
      //  // Create a second Teacher and Course with Builder
      //  Teacher teacher2 = Teacher.builder()
      //          .id(2)
      //          .name("Captain Corn")
      //          .subject("Popcorn Studies")
      //          .build();
//
      //  Course course2 = Course.builder()
      //          .id(102)
      //          .name("Popcorn Appreciation 101")
      //          .teacher(teacher2)
      //          .students(List.of(student2, student3)) // Adding only a subset of students
      //          .build();
//
      //  System.out.println("\nTesting another Course Builder:");
      //  System.out.println(course2);

    }
}