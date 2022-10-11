package dataAccess.jdbc;

import dataAccess.TeachersDao;
import entities.Teachers;

public class JdbcTeachersDao implements TeachersDao {

	@Override
	public void add(Teachers teachers) {
		System.out.println("Teachers added with JDBC " +  teachers.getTeachersFirstName());
		
	}

	@Override
	public void update(Teachers teachers) {
		System.out.println("Teachers update with JDBC " +  teachers.getTeachersFirstName());
		
	}

	@Override
	public void delete(Teachers teachers) {
		System.out.println("Teachers deleted with JDBC " +  teachers.getTeachersFirstName());
		
	}
	

}
