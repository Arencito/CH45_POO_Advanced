
package com.generation.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StudentService
{
   private HashMap<String, Course> courseList = new HashMap<>();

   private HashMap<String, Student> students = new HashMap<>();

   private HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();


    public StudentService()
    {
        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
    }

    public HashMap<String, Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(HashMap<String, Course> courseList) {
		this.courseList = courseList;
	}

	public HashMap<String, Student> getStudents() {
		return students;
	}

	public void setStudents(HashMap<String, Student> students) {
		this.students = students;
	}

	public HashMap<String, List<Course>> getCoursesEnrolledByStudents() {
		return coursesEnrolledByStudents;
	}

	public void setCoursesEnrolledByStudents(HashMap<String, List<Course>> coursesEnrolledByStudents) {
		this.coursesEnrolledByStudents = coursesEnrolledByStudents;
	}

	public void enrollStudents( String courseName, String studentID )
    {
        Course course = courseList.get( courseName );

        if ( !coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
        }
        coursesEnrolledByStudents.get( studentID ).add( course );
    }

    public void unEnrollStudents( String courseName, String studentID )
    {
        Course course = courseList.get( courseName );

        if ( coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.get( studentID ).remove( course );
        }
    }

    public void showEnrolledStudents(String courseId){
        //TODO implement using collections loops
    	
    
			
		}
    	
		
    

    public void showAllCourses(){
        //TODO implement using collections loops
    	
    
			for (String key: courseList.keySet()) {
				
				
			System.out.println(courseList.get(key));	
			}
				
    	
    }

	public void addStudents(Student student) {
		// TODO Auto-generated method stub
		students.put(student.getId(), student);
	}

	
}