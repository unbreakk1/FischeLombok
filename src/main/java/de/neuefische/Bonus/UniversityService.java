package de.neuefische.Bonus;

import java.util.ArrayList;
import java.util.List;

public class UniversityService
{

    public double calculateAverageGrade(BonusCourse course)
    {
        List<BonusStudent> students = course.getStudents();
        if (students.isEmpty())
            return 0.0;


        double totalGrades = 0.0;
        for (BonusStudent student : students)
        {
            totalGrades += convertGradeToNumeric(student.getGrade());
        }

        return totalGrades / students.size();
    }

    public double calculateUniversityAverage(University university)
    {
        List<BonusCourse> courses = university.courses();
        double totalGrades = 0.0;
        int totalStudents = 0;

        for (BonusCourse course : courses)
        {
            for (BonusStudent student : course.getStudents())
            {
                totalGrades += convertGradeToNumeric(student.getGrade());
                totalStudents++;
            }
        }

        if (totalStudents == 0)
            return 0.0;

        return totalGrades / totalStudents;
    }

    public List<BonusStudent> getStudentsWithMinGrade(University university) {
        List<BonusStudent> qualifiedStudents = new ArrayList<>();

        for (BonusCourse course : university.courses()) {
            for (BonusStudent student : course.getStudents()) {
                if (convertGradeToNumeric(student.getGrade()) >= 2.0) {
                    qualifiedStudents.add(student);
                }
            }
        }

        return qualifiedStudents;
    }

    private double convertGradeToNumeric(String grade)
    {
        return switch (grade)
        {
            case "D" -> 4.0;
            case "C" -> 3.5;
            case "C+" -> 3.0;
            case "B" -> 2.5;
            case "B+", "Good" -> 2.0;
            case "A" -> 1.0;
            default -> 0.0; // Fail or unrecognized grade
        };
    }
}
