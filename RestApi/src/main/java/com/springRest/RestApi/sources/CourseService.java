package com.springRest.RestApi.sources;

import java.util.List;

import com.springRest.RestApi.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourses(long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(long courseId);

	
}
