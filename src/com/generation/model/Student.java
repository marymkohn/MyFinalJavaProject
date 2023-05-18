package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course )
    {
        //TODO implement this method
<<<<<<< HEAD
=======
        if(!courses.contains(course)){
            courses.add(course);
        }
        System.out.println("Student is already enrolled in: " + course.getCode());
>>>>>>> marykohn
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }

<<<<<<< HEAD

    public boolean isAttendingCourse( String courseCode )
    {
        //TODO implement this method
=======
    public boolean isAttendingCourse( String courseCode )
    {
        //TODO implement this method
        for(Course course : courses) {
            if (course.getCode().equals(courseCode)) {
                return true;
            }
        }
>>>>>>> marykohn
        return false;
    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}
