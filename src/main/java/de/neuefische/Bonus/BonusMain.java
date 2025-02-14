package de.neuefische.Bonus;

import java.util.List;

public class BonusMain
{
    public static void main(String[] args)
    {
        BonusStudent student1 = BonusStudent.builder().id(1).name("John Doe").address("123 Maple St").grade("A").build();
        BonusStudent student2 = BonusStudent.builder().id(2).name("Jane Smith").address("456 Oak Ave").grade("B+").build();
        BonusStudent student3 = BonusStudent.builder().id(3).name("Alice Brown").address("789 Pine Lane").grade("Good").build();
        BonusStudent student4 = BonusStudent.builder().id(4).name("Bob Green").address("654 Elm St").grade("C").build();

        BonusTeacher teacher = BonusTeacher.builder().id(1).name("Dr. Emily Carter").subject("Computer Science").build();

        List<BonusStudent> course1Students = List.of(student1, student2);
        BonusCourse course1 = BonusCourse.builder().id(101).name("Programming 101").teacher(teacher).students(course1Students).build();

        List<BonusStudent> course2Students = List.of(student3, student4);
        BonusCourse course2 = BonusCourse.builder().id(102).name("Data Structures").teacher(teacher).students(course2Students).build();

        University university = new University(1, "Tech University", List.of(course1, course2));

        UniversityService service = new UniversityService();

        double courseAverage = service.calculateAverageGrade(course1);
        System.out.println("Average grade for Course 1: " + courseAverage);

        double universityAverage = service.calculateUniversityAverage(university);
        System.out.println("University average grade: " + universityAverage);

        List<BonusStudent> qualifiedStudents = service.getStudentsWithMinGrade(university);
        System.out.println("Students with grade ≥ 2 ('Good'):");
        qualifiedStudents.forEach(System.out::println);
    }
}
