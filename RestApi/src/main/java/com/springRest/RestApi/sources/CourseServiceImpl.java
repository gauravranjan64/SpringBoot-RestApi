package com.springRest.RestApi.sources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRest.RestApi.dao.CourseDao;
import com.springRest.RestApi.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	//List<Course> list;
	
	@Autowired
	private CourseDao booksDao;
	
	public CourseServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Course(145,"Java POint","knoweledge gate"));
//		list.add(new Course(146,"Sql Basics","Sql implementations"));
//		list.add(new Course(147,"Html","Html basics"));
		
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return booksDao.findAll();
	}

	@Override
	public Course getCourses(long courseId) {
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		return booksDao.getOne(courseId);
		//return entity;
	}

	@Override
	public Course addCourse(Course course) {
		//list.add(course);
		booksDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		//list.add(course);
		booksDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				
//				list.remove(course);
//				break;
//			}
//		}
		Course entity=booksDao.getOne(courseId);
		booksDao.delete(entity);
		//return "removed!!";
		
	}

	

	

}
