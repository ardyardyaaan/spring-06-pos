package com.eksad.pos.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eksad.pos.dao.CategoryDao;
import com.eksad.pos.model.CategoryModel;

@Repository
public class CategoryDaoImpl implements CategoryDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<CategoryModel> getList() {
		Session session = sessionFactory.getCurrentSession();
		// HQl => Hibernate Query language
		// Hibernate => ORM ( Object Relation Mapping )
		String hql = "select ct from CategoryModel ct";
		Query query = session.createQuery(hql);
		List<CategoryModel> result = query.getResultList();
		return result;
	}

	public List<CategoryModel> search(String key) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "select ct from CategoryModel ct where ct.name like :keySearch";
		Query query = session.createQuery(hql);
		query.setParameter("keySearch", "%"+key+"%");
		return query.getResultList();
	}
	
	@Override
	public CategoryModel getById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "select ct from CategoryModel ct where ct.id=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		CategoryModel result = (CategoryModel) query.getSingleResult();
		return result;
	}

	@Override
	public void insert(CategoryModel model) {
		Session session = sessionFactory.getCurrentSession();
		session.save(model);
		
	}

	@Override
	public void update(CategoryModel model) {
		Session session = sessionFactory.getCurrentSession();
		session.update(model);
		
	}

	@Override
	public void delete(CategoryModel model) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(model);
		
	}

	
}
