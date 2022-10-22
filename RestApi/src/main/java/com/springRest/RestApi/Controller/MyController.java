package com.springRest.RestApi.Controller;

import java.util.List;
import com.springRest.RestApi.sources.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.RestApi.entities.Course;
import com.springRest.RestApi.sources.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		
		return "controller class";
	}
	
	//extracting records using Get method
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	//extracting single record using Get method
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourses(Long.parseLong(courseId));
	}
	
	//Adding record using Post method
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		
		return this.courseService.addCourse(course);
	}
	
	//updating record using Put method
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}
	
	//deleting record using Delete method
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
		try{
			this.courseService.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
