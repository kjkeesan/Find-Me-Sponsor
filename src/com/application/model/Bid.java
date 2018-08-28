package com.application.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Date;


import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;


@Table(name="Bid")
@Entity
public class Bid {
	
	@Id
	@GeneratedValue(generator = "system-increment")
	@GenericGenerator(name= "system-increment", strategy="increment")
	@Column(name="BidId")
	private Integer bidId;
	
	@Column(name="BidOwner")
	private String bidOwner;
	
	@Column(name="BidFile")
	private String bidFile;
	
	@Column(name="BidDesc")
	private String bidDesc;
	
	@Column(name="Time_Int")
	private String timeInt;
	
	
	/**
	 * @return the timeInt
	 */
	public String getTimeInt() {
		return timeInt;
	}

	/**
	 * @param timeInt the timeInt to set
	 */
	public void setTimeInt(String timeInt) {
		this.timeInt = timeInt;
	}
	
	/**
	 * @param bidId the bidId to set
	 */
	public void setBidId(Integer bidId) {
		bidId = bidId;
	}

	/**
	 * @return the bidId
	 */
	public Integer getBidId() {
		return bidId;
	}

	

	/**
	 * @return the bidOwner
	 */
	public String getBidOwner() {
		return bidOwner;
	}

	/**
	 * @param bidOwner the bidOwner to set
	 */
	public void setBidOwner(String bidOwner) {
		bidOwner = bidOwner;
	}

	/**
	 * @return the bidFile
	 */
	public String getBidFile() {
		return bidFile;
	}

	/**
	 * @param bidFile the bidFile to set
	 */
	public void setBidFile(String bidFile) {
		bidFile = bidFile;
	}

	/**
	 * @return the bidDesc
	 */
	public String getBidDesc() {
		return bidDesc;
	}

	/**
	 * @param bidDesc the bidDesc to set
	 */
	public void setBidDesc(String bidDesc) {
		bidDesc = bidDesc;
	}

	
	
	/**
	 * @return the cName
	 */
	
	

}