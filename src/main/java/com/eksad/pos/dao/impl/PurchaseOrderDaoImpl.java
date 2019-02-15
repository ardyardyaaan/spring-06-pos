package com.eksad.pos.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eksad.pos.dao.PurchaseOrderDao;
import com.eksad.pos.model.PurchaseOrderModel;

@Repository
public class PurchaseOrderDaoImpl implements PurchaseOrderDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<PurchaseOrderModel> getList() {
		Session session = sessionFactory.getCurrentSession();
		// HQl => Hibernate Query language
		// Hibernate => ORM ( Object Relation Mapping )
		String hql = "select po from PurchaseOrderModel po";
		Query query = session.createQuery(hql);
		List<PurchaseOrderModel> result = query.getResultList();
		return result;
	}

	@Override
	public List<PurchaseOrderModel> search(String key) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "select po from PurchaseOrderModel po where po.name like :keySearch"; 
		Query query = session.createQuery(hql);
		query.setParameter("keySearch", "%"+key+"%");
		return query.getResultList();
	}
	
	@Override
	public PurchaseOrderModel getById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "select po from PurchaseOrderModel po where po.id=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		PurchaseOrderModel result = (PurchaseOrderModel) query.getSingleResult();
		return result;
	}

	@Override
	public void insert(PurchaseOrderModel model) {
		Session session = sessionFactory.getCurrentSession();
		session.save(model);
		
	}

	@Override
	public void update(PurchaseOrderModel model) {
		Session session = sessionFactory.getCurrentSession();
		session.update(model);
		
	}

	@Override
	public void delete(PurchaseOrderModel model) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(model);
		
	}

}
