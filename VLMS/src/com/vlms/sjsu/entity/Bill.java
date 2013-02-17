package com.vlms.sjsu.entity;

// TODO: Auto-generated Javadoc
/**
 * The Class Bill.
 */
public class Bill {
	
	/** The user id. */
	private int userId;
	
	/** The movie id. */
	private int movieId;
	
	/** The issued date. */
	private String issuedDate;
	
	/** The returned date. */
	private String returnedDate;
	
	/** The bill amount. */
	private Float billAmount;

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * Gets the movie id.
	 *
	 * @return the movie id
	 */
	public int getMovieId() {
		return movieId;
	}

	/**
	 * Sets the movie id.
	 *
	 * @param movieId the new movie id
	 */
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	/**
	 * Gets the issued date.
	 *
	 * @return the issued date
	 */
	public String getIssuedDate() {
		return issuedDate;
	}

	/**
	 * Sets the issued date.
	 *
	 * @param issuedDate the new issued date
	 */
	public void setIssuedDate(String issuedDate) {
		this.issuedDate = issuedDate;
	}

	/**
	 * Gets the returned date.
	 *
	 * @return the returned date
	 */
	public String getReturnedDate() {
		return returnedDate;
	}

	/**
	 * Sets the returned date.
	 *
	 * @param returnedDate the new returned date
	 */
	public void setReturnedDate(String returnedDate) {
		this.returnedDate = returnedDate;
	}

	/**
	 * Gets the bill amount.
	 *
	 * @return the bill amount
	 */
	public Float getBillAmount() {
		return billAmount;
	}

	/**
	 * Sets the bill amount.
	 *
	 * @param billAmount the new bill amount
	 */
	public void setBillAmount(Float billAmount) {
		this.billAmount = billAmount;
	}

}
