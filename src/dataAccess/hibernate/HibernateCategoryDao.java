package dataAccess.hibernate;

import dataAccess.CategoryDao;
import entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Category added with Hibernate " + category.getCategoryName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Category updated with Hibernate " + category.getCategoryName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Category deleted with Hibernate " + category.getCategoryName());
		
	}

}
