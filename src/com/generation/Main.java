package com.generation;

import com.generation.model.Course;
import com.generation.model.Student;
import com.generation.service.CourseService;
import com.generation.service.StudentService;
import com.generation.utils.PrinterHelper;

<<<<<<< HEAD
import java.text.ParseException;
=======
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
>>>>>>> marykohn
import java.util.Scanner;

public class Main
{

<<<<<<< HEAD
    public static void main( String[] args )
=======
    public static void main(String[] args )
>>>>>>> marykohn
        throws ParseException
    {
        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        Scanner scanner = new Scanner( System.in );
<<<<<<< HEAD
=======

        // Part 3: Create new students, enroll the students, show summary
        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Student student = new Student("0626", "Mary Kohn", "marymkohn@gmail.com", formatter.parse("06/26/1993"));
        studentService.subscribeStudent(student);

>>>>>>> marykohn
        int option = 0;
        do
        {
            PrinterHelper.showMainMenu();
            option = scanner.nextInt();
            switch ( option )
            {
                case 1:
                    registerStudent( studentService, scanner );
                    break;
                case 2:
                    findStudent( studentService, scanner );
                    break;
                case 3:
                    enrollStudentToCourse( studentService, courseService, scanner );
                    break;
                case 4:
                    showStudentsSummary( studentService, scanner );
                    break;
                case 5:
                    showCoursesSummary( courseService, scanner );
                    break;
            }
        }
        while ( option != 6 );
    }

    private static void enrollStudentToCourse( StudentService studentService, CourseService courseService,
                                               Scanner scanner )
    {
        System.out.println( "Insert student ID" );
        String studentId = scanner.next();
        Student student = studentService.findStudent( studentId );
        if ( student == null )
        {
            System.out.println( "Invalid Student ID" );
            return;
        }
        System.out.println( student );
        System.out.println( "Insert course ID" );
        String courseId = scanner.next();
        Course course = courseService.getCourse( courseId );
        if ( course == null )
        {
            System.out.println( "Invalid Course ID" );
            return;
        }
        System.out.println( course );
        courseService.enrollStudent( courseId, student );
        studentService.enrollToCourse( studentId, course );
        System.out.println( "Student with ID: " + studentId + " enrolled successfully to " + courseId );

    }

    private static void showCoursesSummary( CourseService courseService, Scanner scanner )
    {
        courseService.showSummary();
    }

    private static void showStudentsSummary( StudentService studentService, Scanner scanner )
    {
        studentService.showSummary();
    }

    private static void findStudent( StudentService studentService, Scanner scanner )
    {
        System.out.println( "Enter student ID: " );
        String studentId = scanner.next();
        Student student = studentService.findStudent( studentId );
        if ( student != null )
        {
            System.out.println( "Student Found: " );
            System.out.println( student );
        }
        else
        {
            System.out.println( "Student with Id = " + studentId + " not found" );
        }
    }

    private static void registerStudent( StudentService studentService, Scanner scanner )
        throws ParseException
    {
        Student student = PrinterHelper.createStudentMenu( scanner );
        studentService.subscribeStudent( student );
    }
<<<<<<< HEAD
=======

>>>>>>> marykohn
}
