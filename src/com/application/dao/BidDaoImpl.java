package com.application.dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.application.model.Bid;

@Repository
public class BidDaoImpl implements BidDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Bid> getAllBids() {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		 LocalDateTime now = LocalDateTime.now();  
		 String curr=dtf.format(now);  
		//return sessionFactory.getCurrentSession().createQuery("from Bid").list();
		Query query=sessionFactory.getCurrentSession().createQuery("from Bid where timeInt > :cutime");
		query.setParameter("cutime", curr);
		List<Bid> lis=query.getResultList();
		return lis;
		
	}
}
