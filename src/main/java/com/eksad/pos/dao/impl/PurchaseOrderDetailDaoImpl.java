package com.eksad.pos.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eksad.pos.dao.PurchaseOrderDetailDao;
import com.eksad.pos.model.PurchaseOrderDetailModel;

@Repository
public class PurchaseOrderDetailDaoImpl implements PurchaseOrderDetailDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<PurchaseOrderDetailModel> getList() {
		Session session = sessionFactory.getCurrentSession();
		// HQl => Hibernate Query language
		// Hibernate => ORM ( Object Relation Mapping )
		String hql = "select pod from PurchaseOrderDetailModel pod";
		Query query = session.createQuery(hql);
		List<PurchaseOrderDetailModel> result = query.getResultList();
		return result;
	}

	@Override
	public List<PurchaseOrderDetailModel> search(String key) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "select pod from PurchaseOrderDetailModel pod where pod.name like :keySearch"; 
		Query query = session.createQuery(hql);
		query.setParameter("keySearch", "%"+key+"%");
		return query.getResultList();
	}
	
	@Override
	public PurchaseOrderDetailModel getById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "select pod from PurchaseOrderDetailModel pod where pod.id=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		PurchaseOrderDetailModel result = (PurchaseOrderDetailModel) query.getSingleResult();
		return result;
	}

	@Override
	public void insert(PurchaseOrderDetailModel model) {
		Session session = sessionFactory.getCurrentSession();
		session.save(model);
		
	}

	@Override
	public void update(PurchaseOrderDetailModel model) {
		Session session = sessionFactory.getCurrentSession();
		session.update(model);
		
	}

	@Override
	public void delete(PurchaseOrderDetailModel model) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(model);
		
	}

}
