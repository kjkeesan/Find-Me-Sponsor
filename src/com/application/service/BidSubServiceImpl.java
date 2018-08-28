package com.application.service;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.dao.BidSubDao;
import com.application.model.BidSub;

@Service
public class BidSubServiceImpl implements BidSubService {

	@Autowired
	private BidSubDao bidSubDao;
	
	
	@Override @Transactional
	public void SaveSubBids(BidSub bid) {
		bidSubDao.SaveSubBids(bid);
		
	}

	@Override
	public List<BidSub> getAllSubBids() {
		return bidSubDao.getAllSubBids();
	}

	@Override
	public boolean validBid(BidSub bid) {
		
		return bidSubDao.validBid(bid);
	}

	
	
}
