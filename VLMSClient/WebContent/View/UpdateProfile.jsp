<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Simple Market Place</title>
<meta charset="UTF-8" />
<link rel="stylesheet" type="text/css" href="css/reset.css">
<link rel="stylesheet" type="text/css" href="css/structure.css">
</head>
<body>
	<c:if test='${sessionScope.user.firstName == null}'>
		<c:redirect url="accessControl.jsp" />
	</c:if>
	<div id="navbar">
		<jsp:include page="navbar.jsp"></jsp:include>
	</div>
	<div id="container">
		<div id="content" style="height: 110%;">
			<form class="box login" style="height: auto; top: 33%;"
				action="UpdateProfileAction" id="form1" method="post">
				<c:if test="${message ne '' }">
					<h3>
						<c:out value="${message }"></c:out>
					</h3>
				</c:if>
				<fieldset>
					<div>
						<span>First Name *</span><input type="text" name="firstname"
							required value='${sessionScope.user.firstName}' />
					</div>
					<div>
						<span class="label">Last Name *</span><input type="text"
							name="lastname" required value='${sessionScope.user.lastName}' />
					</div>
					<div>
						<span class="label">Old Password *</span><input type="password"
							name="pass" required />
					</div>
					<div>
						<span class="label">New Password </span><input type="password"
							name="newpass" />
					</div>
					<div>
						<span class="label">Address *</span><input type="text"
							name="address" required value='${sessionScope.user.address}' />
					</div>

					<div>
						<span class="label">City *</span><input type="text" name="city"
							required value='${sessionScope.user.city}' />
					</div>
					<div>
						<span class="label">State *</span><input type="text" name="state"
							required value='${sessionScope.user.state}' />
					</div>
					<div>
						<span class="label">Zip Code *</span><input type="text" name="zip"
							required value='${sessionScope.user.zipCode}' />
					</div>
					<div>
						<span class="label">Member Type *</span> <select
							class="cjComboBox" name="membertype">
							<option value="Premium"
								${sessionScope.user.memberType == 'Premium' ? 'selected' : ''}>Premium</option>
							<option value="Simple"
								${sessionScope.user.memberType == 'Simple' ? 'selected' : ''}>Simple</option>
						</select>
					</div>
					<div>
						<input type="submit" class="btnLogin" value="Update"
							name="updateBtn" />
					</div>
				</fieldset>
			</form>
		</div>
		<div id="footer">
			<p>
				<strong><c:out
						value="You logged in last on ${user.lastlogin }"></c:out></strong>
			</p>
		</div>
	</div>


</body>
</html>
