/**
 * 
 */
package com.vlms.sjsu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;

import com.vlms.sjsu.entity.User;
import com.vlms.sjsu.util.AppUtils;

/**
 * @author vaishaksuresh
 * 
 */
public class DatabaseConnection {
	Connection con = null;
	static ResultSet rs = null;
	Statement stmt = null;

	public DatabaseConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/vlms", "vlmsadmin",
					"vlmspassword");
			stmt = con.createStatement();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String createUser(User objUser) {
		String result = "";
		int rowcount;

		try {
			// Check if a user with the same email already exists.
			PreparedStatement stmt = con
					.prepareStatement("SELECT userid FROM user WHERE email=?");
			stmt.setString(1, objUser.getEmail());
			System.out.println(stmt.toString());
			rs = stmt.executeQuery();
			rs.last();
			rowcount = rs.getRow();
			if (rowcount > 0) {
				result = "The email ID is already registered. Please try another email ID";
			} else {
				// If the user does not exist, create a user.
				String query = "INSERT INTO `vlms`.`user`(`email`,`password`,"
						+ "`firstname`,`lastname`,`address`,`city`,`state`,`zipcode`,"
						+ "`membertype`,`subscriptionfee`,`balance`)"
						+ "VALUES('" + objUser.getEmail() + "', '"
						+ objUser.getPassword() + "', '"
						+ objUser.getFirstName() + "', '"
						+ objUser.getLastName() + "', '" + objUser.getAddress()
						+ "', '" + objUser.getCity() + "', '"
						+ objUser.getState() + "', '" + objUser.getZipCode()
						+ "', '" + objUser.getMemberType() + "', ";
				if ("SIMPLE".equalsIgnoreCase(objUser.getMemberType())) {
					query = query + "'0'," + "'150')";
				} else if ("PREMIUM".equalsIgnoreCase(objUser.getMemberType())) {
					query = query + "'100'," + "'0')";
				}
				rowcount = stmt.executeUpdate(query);

				if (rowcount > 0) {
					result = "true";
				} else {
					result = "false: The data could not be inserted into the database";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public String updateUser(User objUser) {
		String result = "";
		int rowcount;

		try {
			// Check if a user with the same email already exists.
			PreparedStatement stmt = con
					.prepareStatement("SELECT userid FROM user WHERE email=?");
			stmt.setString(1, objUser.getEmail());
			System.out.println(stmt.toString());
			rs = stmt.executeQuery();
			rs.last();
			rowcount = rs.getRow();
			if (rowcount < 0) {
				result = "There seems to be some problem and we cannot find your account";
			} else {
				StringBuffer strbQuery = new StringBuffer("UPDATE user set ");
				if (null != objUser.getFirstName()) {
					strbQuery.append("firstname = '" + objUser.getFirstName()
							+ "', ");
				}
				if (null != objUser.getLastName()) {
					strbQuery.append("lastname = '" + objUser.getLastName()
							+ "', ");
				}
				if (null != objUser.getPassword()) {
					strbQuery.append("password = '" + objUser.getPassword()
							+ "', ");
				}
				if (null != objUser.getAddress()) {
					strbQuery.append("address = '" + objUser.getAddress()
							+ "', ");
				}
				if (null != objUser.getCity()) {
					strbQuery.append("city = '" + objUser.getCity() + "', ");
				}
				if (null != objUser.getState()) {
					strbQuery.append("state = '" + objUser.getState() + "', ");
				}
				if (null != objUser.getZipCode()) {
					strbQuery.append("zipcode = '" + objUser.getZipCode()
							+ "', ");
				}
				if (null != objUser.getMemberType()) {
					strbQuery.append("membertype = '" + objUser.getMemberType()
							+ "', ");
				}
				strbQuery.append("subscriptionfee = '"
						+ String.valueOf(objUser.getSubscriptionFee()) + "', ");
				strbQuery.append("balance = '"
						+ String.valueOf(objUser.getBalance()) + "' ");
				strbQuery.append("WHERE email='" + objUser.getEmail() + "'");
				System.out.println(strbQuery.toString());
				rowcount = stmt.executeUpdate(strbQuery.toString());

				if (rowcount > 0) {
					result = "true";
				} else {
					result = "false: The data could not be inserted into the database";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public User signIn(String strUsername, String mdPassword) {
		ResultSet rs;
		User objLoggedInUser = new User();
		try {

			String query = "SELECT * FROM user WHERE email='" + strUsername
					+ "'";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				String strPass = rs.getString("password");

				if (strPass.equals(mdPassword)) {
					int id = rs.getInt("userid");
					objLoggedInUser.setUserId(id);
					objLoggedInUser.setFirstName(rs.getString("firstname"));
					objLoggedInUser.setLastName(rs.getString("lastname"));
					objLoggedInUser.setEmail(strUsername);
					objLoggedInUser.setPassword(mdPassword);
					objLoggedInUser.setAddress(rs.getString("address"));
					objLoggedInUser.setCity(rs.getString("city"));
					objLoggedInUser.setState(rs.getString("state"));
					objLoggedInUser.setZipCode(rs.getString("zipcode"));
					objLoggedInUser.setMemberType(rs.getString("membertype"));
					objLoggedInUser.setSubscriptionFee(Float.valueOf(rs
							.getString("subscriptionfee")));
					objLoggedInUser.setBalance(Float.valueOf(rs
							.getString("balance")));
					objLoggedInUser.setLastlogin(rs.getString("lastlogin"));
					System.out.println("Last Login:"
							+ objLoggedInUser.getLastlogin());
					PreparedStatement stmt = con
							.prepareStatement("UPDATE user set lastlogin=? where userid=?");
					stmt.setString(1,
							DateFormat.getDateTimeInstance().format(new Date()));
					stmt.setInt(2, id);
					stmt.executeUpdate();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return objLoggedInUser;

	}

}
