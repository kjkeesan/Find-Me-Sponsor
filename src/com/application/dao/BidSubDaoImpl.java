package com.application.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.application.model.BidSub;


@Repository
@Transactional 
public class BidSubDaoImpl implements BidSubDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<BidSub> getAllSubBids() {
		return sessionFactory.getCurrentSession().createQuery("from BidSub").list();
	}

	
	

	@Override
	public void SaveSubBids(BidSub bid) {
		sessionFactory.getCurrentSession().save(bid);
		
	}




	@Override
	public boolean validBid(BidSub bid) {
		// TODO Auto-generated method stub
		return false;
	}

}
