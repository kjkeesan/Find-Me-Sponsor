package com.application.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Table(name="bidSub")
@Entity
public class BidSub {	
	
	
	
	
	@Column(name="BidId")
	private Integer bidId;
	@Id
	@Column(name="Bidder")
	private String bidder;
	
	/*@Column(name="subDate")
	private  Date BidSubDate;*/
	
	@Column(name="bidAmt")
	private String bidAmt;
	
	/**
	 * @return the bidSub
	 */
	

	@Column(name="type")
	private String bidType;
	
	/**
	 * @return the bidSubDate
	 */
	/*public Date getBidSubDate() {
		return BidSubDate;
	}*/

	/**
	 * @param bidSubDate the bidSubDate to set
	 */
	/*public void setBidSubDate(Date bidSubDate) {
		BidSubDate = bidSubDate;
	}*/

	

	
	/**
	 * @return the bidType
	 */
	public String getBidType() {
		return bidType;
	}

	/**
	 * @param bidType the bidType to set
	 */
	public void setBidType(String bidType) {
		this.bidType = bidType;
	}

	/**
	 * @return the bidSubDate
	 */
	

	
	/**
	 * @return the bidId
	 */
	public Integer getBidId() {
		return bidId;
	}

	

	/**
	 * @param bidId the bidId to set
	 */
	
	public void setBidId(Integer bidId) {
		this.bidId = bidId;
	}

	
	
	public String getBidder() {
		return bidder;
	}
	
	/**
	 * @param bidder the bidder to set
	 */
	
	public void setBidder(String bidder) {
		this.bidder = bidder;
	}
	
	/**
	 * @return the bidFile
	 */
	

	/**
	 * @return the bidAmt
	 */
	public String getBidAmt() {
		return bidAmt;
	}

	/**
	 * @param bidAmt the bidAmt to set
	 */
	public void setBidAmt(String bidAmt) {
		this.bidAmt = bidAmt;
	}
	
	
	
}
