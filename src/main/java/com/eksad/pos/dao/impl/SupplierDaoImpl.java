package com.eksad.pos.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eksad.pos.dao.SupplierDao;
import com.eksad.pos.model.PackageModel;
import com.eksad.pos.model.SupplierModel;

@Repository
public class SupplierDaoImpl implements SupplierDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<SupplierModel> getList() {
		Session session = sessionFactory.getCurrentSession();
		// HQl => Hibernate Query language
		// Hibernate => ORM ( Object Relation Mapping )
		String hql = "select sp from SupplierModel sp";
		Query query = session.createQuery(hql);
		List<SupplierModel> result = query.getResultList();
		return result;
	}
	
	@Override
	public List<SupplierModel> search(String key) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "select sp from SupplierModel sp where sp.name like :keySearch"; 
		Query query = session.createQuery(hql);
		query.setParameter("keySearch", "%"+key+"%");
		return query.getResultList();
	}
	@Override
	public SupplierModel getById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "select sp from SupplierModel sp where sp.id=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		SupplierModel result = (SupplierModel) query.getSingleResult();
		return result;
	}

	@Override
	public void insert(SupplierModel model) {
		Session session = sessionFactory.getCurrentSession();
		session.save(model);
		
	}

	@Override
	public void update(SupplierModel model) {
		Session session = sessionFactory.getCurrentSession();
		session.update(model);
		
	}

	@Override
	public void delete(SupplierModel model) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(model);
		
	}

}
