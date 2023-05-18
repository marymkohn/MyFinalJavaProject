package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        // check for existing ID and email
        for (Student existingStudent : students.values()) {
            if (existingStudent.getEmail().equals(student.getEmail())) {
                System.out.println("This email is already registered to a student.");
                return;
            } else if (existingStudent.getId().equals(student.getId())) {
                System.out.println("This ID is already registered to a student.");
                return;
            }
        }
        students.put( student.getId(), student );
        System.out.println("Student Successfully Registered! ");
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public void showSummary()
    {
        //TODO implement
        System.out.println( "All Students:" );
        for ( String key : students.keySet() )
        {
            Student student = students.get( key );
            System.out.println( student );
        }

    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }
}