package com.application.service;

import java.util.List;

import com.application.model.BidSub;

public interface BidSubService {
	public void SaveSubBids(BidSub bid);

	public List<BidSub> getAllSubBids();

	public boolean validBid(BidSub bid);

	
}
