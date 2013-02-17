package com.vlms.sjsu.service;

import com.vlms.sjsu.dao.DatabaseConnection;
import com.vlms.sjsu.entity.Bill;
import com.vlms.sjsu.entity.Movie;
import com.vlms.sjsu.entity.User;

// TODO: Auto-generated Javadoc
/**
 * The Class Service.
 */
public class Service {
	DatabaseConnection db = new DatabaseConnection();

	/**
	 * Creates the update user.
	 * 
	 * @param objUser
	 *            the obj user
	 * @return the string
	 */
	public String createUpdateUser(User objUser) {
		String result = "";
		if (0 == objUser.getUserId()) {
			result = db.createUser(objUser);
		} else {
			result = db.updateUser(objUser);
		}
		return result;
	}

	/**
	 * Sign in.
	 * 
	 * @param strUsername
	 *            the str username
	 * @param mdPassword
	 *            the md password
	 * @return the user[]
	 */
	public User[] signIn(String strUsername, String mdPassword) {
		User[] arrUser = new User[1];
		arrUser[0] = db.signIn(strUsername, mdPassword);
		return arrUser;
	}

	/**
	 * List all users.
	 * 
	 * @param strUserType
	 *            the str user type
	 * @return the user[]
	 */
	public User[] listAllUsers(String strUserType) {
		return null;
	}

	/**
	 * Delete user.
	 * 
	 * @param strUserID
	 *            the str user id
	 * @return the string
	 */
	public String deleteUser(String strUserID) {
		String result = "Success";
		return result;
	}

	/**
	 * Creates the update movie.
	 * 
	 * @param objMovie
	 *            the obj movie
	 * @return the string
	 */
	public String createUpdateMovie(Movie objMovie) {
		String result = "Success";
		return result;
	}

	/**
	 * Delete movie.
	 * 
	 * @param strMovieId
	 *            the str movie id
	 * @return the string
	 */
	public String deleteMovie(String strMovieId) {
		String result = "Success";
		return result;
	}

	/**
	 * Issue movie.
	 * 
	 * @param strMovieId
	 *            the str movie id
	 * @param strUserId
	 *            the str user id
	 * @return the string
	 */
	public String issueMovie(String strMovieId, String strUserId) {
		String result = "Success";
		return result;
	}

	/**
	 * Return movie.
	 * 
	 * @param strMovieId
	 *            the str movie id
	 * @param strUserId
	 *            the str user id
	 * @return the string
	 */
	public String returnMovie(String strMovieId, String strUserId) {
		String result = "Success";
		return result;
	}

	/**
	 * List all movies.
	 * 
	 * @return the movie[]
	 */
	public Movie[] listAllMovies() {
		return null;
	}

	/**
	 * Find user.
	 * 
	 * @param objUser
	 *            the obj user
	 * @return the user[]
	 */
	public User[] findUser(User objUser) {
		return null;
	}

	/**
	 * Find movie.
	 * 
	 * @param objMovie
	 *            the obj movie
	 * @return the movie[]
	 */
	public Movie[] findMovie(Movie objMovie) {
		return null;
	}

	/**
	 * Gets the user details.
	 * 
	 * @param strUserId
	 *            the str user id
	 * @return the user details
	 */
	public User[] getUserDetails(String strUserId) {
		return null;
	}

	/**
	 * Gets the movie details.
	 * 
	 * @param strMovieId
	 *            the str movie id
	 * @return the movie details
	 */
	public Movie[] getMovieDetails(String strMovieId) {
		return null;
	}

	/**
	 * Generate bill.
	 * 
	 * @param strUserId
	 *            the str user id
	 * @return the bill[]
	 */
	public Bill[] generateBill(String strUserId) {
		return null;
	}
}
