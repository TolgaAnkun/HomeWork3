package business;

import core.logging.Logger;
import dataAccess.TeachersDao;
import entities.Teachers;

public class TeachersManager {
	
	private TeachersDao teachersDao;
	
	private Logger[] logger;

	public TeachersManager(TeachersDao teachersDao, Logger[] logger) {
		
		this.teachersDao = teachersDao;
		this.logger = logger;
	}
	
	
	public void add (Teachers teachers) {
		this.teachersDao.add(teachers);
		for (Logger logger : logger) {
			logger.log(teachers.getTeachersFirstName()+" " + teachers.getTeachersLastName());
		}
	}
	
	
	public void delete (Teachers teachers) {
		this.teachersDao.delete(teachers);
		for (Logger logger : logger) {
			logger.log(teachers.getTeachersFirstName()+" " + teachers.getTeachersLastName());
		}
	}
	
	public void update (Teachers teachers) {
		this.teachersDao.update(teachers);
		for (Logger logger : logger) {
			logger.log(teachers.getTeachersFirstName()+" " + teachers.getTeachersLastName());
		}
	}
	
	

}
