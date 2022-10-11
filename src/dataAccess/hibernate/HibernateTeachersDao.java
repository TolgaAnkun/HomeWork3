package dataAccess.hibernate;

import dataAccess.TeachersDao;
import entities.Teachers;

public class HibernateTeachersDao implements TeachersDao{

	@Override
	public void add(Teachers teachers) {
		System.out.println("Teachers added with Hibernate " +  teachers.getTeachersFirstName() + " " + teachers.getTeachersLastName());
		
	}

	@Override
	public void update(Teachers teachers) {
		System.out.println("Teachers update with Hibernate  " +   teachers.getTeachersFirstName() + " " + teachers.getTeachersLastName());
		
	}

	@Override
	public void delete(Teachers teachers) {
		System.out.println("Teachers deleted with Hibernate " +    teachers.getTeachersFirstName() + " " + teachers.getTeachersLastName());
		
	}

}
