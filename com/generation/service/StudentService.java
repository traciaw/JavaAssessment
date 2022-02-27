package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;


public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {return this.students.get(studentId);}

    public boolean showSummary()
    {
        //TODO- to reflect student details and all enrollToCourse details
        for (String key:students.keySet()) {
            Student student = students.get(key);
            System.out.println(student.toString());
            System.out.println("Enrolled Courses:");
            for(Course course : student.getEnrolledCourses()){
                System.out.println(course.toString());
            }
        }

        return !students.isEmpty();
    }

    public void enrollToCourse( String studentId, Course course )
    {
        //TODO -show that student is enrolled after inputing id and course id. to print messages
        // as shown on result file. can enroll more than 1 course. to show all course enrolled in
        // option 5-Show student summary
        Student student=this.students.get(studentId);
        //Course course = this.course.get(course);
        student.enrollToCourse(course);

    }
}
