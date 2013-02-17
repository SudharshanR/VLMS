<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/reset.css">
<link rel="stylesheet" type="text/css" href="css/structure.css">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<title>Video Library Management System : Sign Up</title>

</head>
<body>

	<form class="box login" style="height: auto; top:20%;" action="SignUpAction"
		id="form1" method="post">
		<h3>
			<c:if test="${message ne '' }">
				<c:out value="${message }"></c:out>
			</c:if>
		</h3>
		<fieldset>
			<div>
				<span>First Name *</span><input type="text" name="firstname" required />
			</div>
			<div>
				<span class="label">Last Name *</span><input type="text"
					name="lastname" required />
			</div>
			<div>
				<span class="label">Email*</span><input type="text" name="email" required />
			</div>
			<div>
				<span class="label">Password *</span><input type="password"
					name="pass" required />
			</div>
			<div>
				<span class="label">Address *</span><input type="text"
					name="address" required />
			</div>
			
			<div>
				<span class="label">City *</span><input type="text"
					name="city" required />
			</div>
			<div>
				<span class="label">State *</span><input type="text"
					name="state" required />
			</div>
			<div>
				<span class="label">Zip Code *</span><input type="text"
					name="zip" required />
			</div>
			<div>
				<span class="label">Member Type *</span>
				<select class="cjComboBox" name="membertype">
				<option value="Simple">Simple</option>
				<option value="Premium" >Premium</option>
				</select>
			</div>
			<div>
				<input type="submit" class="btnLogin" value="SignUp" />
			</div>
		</fieldset>
	</form>
</body>
</html>