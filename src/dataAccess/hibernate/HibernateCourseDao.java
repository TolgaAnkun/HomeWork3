package dataAccess.hibernate;

import dataAccess.CourseDao;
import entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Course added with Hibernate " + course.getCourseName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Course update with Hibernate "  + course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Course delete with Hibernate " + course.getCourseName());
		
	}

}
