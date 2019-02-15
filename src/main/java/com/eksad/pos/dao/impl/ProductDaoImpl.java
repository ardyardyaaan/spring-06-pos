package com.eksad.pos.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eksad.pos.dao.ProductDao;
import com.eksad.pos.model.ProductModel;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<ProductModel> getList() {
		Session session = sessionFactory.getCurrentSession();
		// HQl => Hibernate Query language
		// Hibernate => ORM ( Object Relation Mapping )
		String hql = "select pd from ProductModel pd";
		Query query = session.createQuery(hql);
		List<ProductModel> result = query.getResultList();
		return result;
	}

	@Override
	public List<ProductModel> search(String key) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "select pd from ProductModel pd where pd.name like :keySearch"; 
		Query query = session.createQuery(hql);
		query.setParameter("keySearch", "%"+key+"%");
		return query.getResultList();
	}
	
	@Override
	public ProductModel getById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "select pd from ProductModel pd where pd.id=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		ProductModel result = (ProductModel) query.getSingleResult();
		return result;
	}

	@Override
	public void insert(ProductModel model) {
		Session session = sessionFactory.getCurrentSession();
		session.save(model);
		
	}

	@Override
	public void update(ProductModel model) {
		Session session = sessionFactory.getCurrentSession();
		session.update(model);
		
	}

	@Override
	public void delete(ProductModel model) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(model);
		
	}

}
