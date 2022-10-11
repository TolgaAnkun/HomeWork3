package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	
	
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	List<Course> courses = new ArrayList<>();

	public void add(Course course) throws Exception {
		if (course.getUnitPrice() < 0) {
			throw new Exception("Kurs ücreti sıfır olamaz");
		}
		for (Course crs : courses) {
			if (crs.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Kurs ismi aynı olamaz");
			}

		}
		courseDao.add(course);
		courses.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getCourseName() + "  " + course.getUnitPrice());

		}

	}

	public void update(Course course) {
		this.courseDao.update(course);
		for (Logger logger : loggers) {
			logger.log(course.getCourseName() + " " + course.getUnitPrice());

		}
	}

	public void delete(Course course) {
		this.courseDao.delete(course);
		for (Logger logger : loggers) {
			logger.log(course.getCourseName() + " " + course.getUnitPrice());

		}
	}

		
	}
	
	
	


