import business.CategoryManager;
import business.CourseManager;
import business.TeachersManager;
import core.logging.DatabaseLogger;
import core.logging.EmailLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.hibernate.HibernateCategoryDao;
import dataAccess.hibernate.HibernateCourseDao;
import dataAccess.hibernate.HibernateTeachersDao;
import dataAccess.jdbc.JdbcCategoryDao;
import dataAccess.jdbc.JdbcCourseDao;
import dataAccess.jdbc.JdbcTeachersDao;
import entities.Category;
import entities.Course;
import entities.Teachers;

public class main {

	
		public static void main(String[] args) throws Exception {

	//     	Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new EmailLogger() };

	//		Teachers teachers = new Teachers("Engin", "Demiroğ");
	//		TeachersManager teachersManager = new TeachersManager(new HibernateTeachersDao(), loggers);
	//		teachersManager.add(teachers);
	//		teachers.setTeachersFirstName("Engin");
	//		teachersManager.update(teachers);
	//		System.out.println();

	//		Category category1 = new Category("Programlamalar");
	//		Category category2 = new Category("Senior"); 
	//		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
	//		categoryManager.add(category1);
	//		categoryManager.add(category2);
	//		categoryManager.update(category1);
	//		categoryManager.delete(category2);
	//		System.out.println();
//
	//		Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı-JAVA", 1000);
	//		Course course2 = new Course("Senior Yazılım Geliştirici Yetiştirme Kapmpı (.NET)", 2000);
	//		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
	//		System.out.println();
			
			
			Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new EmailLogger() };

					Teachers teachers = new Teachers("Engin", "Demiroğ");
				    TeachersManager teachersManager = new TeachersManager(new JdbcTeachersDao(), loggers);
					teachersManager.add(teachers);
					teachers.setTeachersFirstName("Engin");
					teachersManager.update(teachers);
					System.out.println();

					Category category1 = new Category("Programlamalar");
					Category category2 = new Category("Senior"); 
					CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
					categoryManager.add(category1);
					categoryManager.add(category2);
					categoryManager.update(category1);
					categoryManager.delete(category2);
					System.out.println();
		
					Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı-JAVA", 1000);
					Course course2 = new Course("Senior Yazılım Geliştirici Yetiştirme Kapmpı (.NET)", 2000);
					CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
					System.out.println();
			
			

			courseManager.add(course1);
			courseManager.add(course2);
			courseManager.update(course1);
			courseManager.delete(course2);

		}
	}


