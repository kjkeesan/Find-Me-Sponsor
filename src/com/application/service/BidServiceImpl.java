package com.application.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.application.dao.BidDao;
import com.application.model.Bid;

@Service
public class BidServiceImpl implements BidService {
	
	@Autowired
	private BidDao bidDao;

	@Override @Transactional
	public List<Bid> getAllBids() {
		return bidDao.getAllBids();
		
	}
	

}
