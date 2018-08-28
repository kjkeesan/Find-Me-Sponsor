package com.application.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.application.model.Bid;

@Repository
public class BidDaoImpl implements BidDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Bid> getAllBids() {
		
		return sessionFactory.getCurrentSession().createQuery("from Bid").list();
	}
}
