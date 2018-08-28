package com.application.dao;

import java.util.List;

import com.application.model.BidSub;


public interface BidSubDao {
	public void SaveSubBids(BidSub bid);

	public List<BidSub> getAllSubBids();

	public boolean validBid(BidSub bid);
}
