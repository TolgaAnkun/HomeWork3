package dataAccess.jdbc;

import dataAccess.CourseDao;
import entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Course added with JDBC " + course.getCourseName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Course added with JDBC "  + course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Course added with JDBC " + course.getCourseName());
		
	}

}
