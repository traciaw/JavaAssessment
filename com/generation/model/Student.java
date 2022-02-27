package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student
    extends Person
    implements Evaluation
{

    //float PASS_MIN_GRADE = 3.0f;//min1, max6
    List<Course> courses = new ArrayList();

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );

    }

    public void enrollToCourse( Course course )
    {
        //TODO
        this.courses.add(course);
    }

    @Override
    public List<Course> findPassedCourses() {

       // List<Course> PASS_MIN_GRADE = new ArrayList<>();
        for (Course course : courses) {
            if (course.getGrade() >= 3.0f) ;
        }
        return courses;
    }

        /*for(Course course: courses){
            if (course.getGrade()>=3.0f){
                return courses;
            }
        }
        return null;*/

        //TODO- Show only courses with grade >=3
/*
        if(Course course : student.getEnrolledCourses()){
            return getEnrolledCourses();
        }
        else{*/





    public Course findCourseById( String courseId )
    {
        //TODO
       return null;
    }

    @Override
    public List<Course> getEnrolledCourses()
    {
        //TODO
        return courses;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

}
