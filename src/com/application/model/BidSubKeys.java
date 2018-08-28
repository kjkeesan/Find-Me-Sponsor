package com.application.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BidSubKeys implements Serializable {
	
	private Integer bidId;
	private String bidder;
	/**
	 * @return the bidId
	 */
	public Integer getBidId() {
		return bidId;
	}
	public BidSubKeys(Integer bidId, String bidder) {
		
		this.bidId = bidId;
		this.bidder = bidder;
	}
	/**
	 * @param bidId the bidId to set
	 */
	public void setBidId(int bidId) {
		this.bidId = bidId;
	}
	/**
	 * @return the bidder
	 */
	public String getBidder() {
		return bidder;
	}
	/**
	 * @param bidder the bidder to set
	 */
	public void setBidder(String bidder) {
		this.bidder = bidder;
	}
}
