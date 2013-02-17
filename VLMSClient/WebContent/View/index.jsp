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
		<div id="content">
			<c:choose>
				<c:when test="${Ads ne null }">
					<h2>Advertisements</h2>
					<h3>
						<c:if test="${message ne '' }">
							<c:out value="${message }"></c:out>
						</c:if>
					</h3>
					<table border="1" style="width: 100%; border-color: red;">
						<tr>
							<th>Title</th>
							<th>Description</th>
							<th>Quantity Available</th>
							<th>Price</th>
							<th>Seller</th>
							<th colspan="2">Select Quantity</th>
						</tr>

						<c:forEach items="${Ads}" var="ad">
							<c:if test='${ad.userId ne user.userid}'>
								<tr>
									<td><c:out value="${ad.adTitle }"></c:out></td>
									<td><c:out value="${ad.adDescription }"></c:out></td>
									<td align="center"><c:out value="${ad.adQty }"></c:out></td>
									<td align="center"><c:out value="${ad.price }"></c:out></td>
									<td><c:out value="${ad.sellerId }"></c:out></td>
									<td colspan="2">
										<form action="AddToCart" method="post">
											<select style="width: 50px;" name="qty">
												<c:forEach begin="1" end="${ad.adQty }" var="newQty">
													<option value="${newQty }">${newQty }</option>
												</c:forEach>
											</select> <input type="hidden" name="adID"
												value="<c:out value="${ad.adId }"></c:out>"> <input
												type="submit" name="addToCart" value="Add To Cart">
										</form>
									</td>
								</tr>
							</c:if>
						</c:forEach>

					</table>
				</c:when>
				<c:otherwise>
					<h2>There are no Active Ads.</h2>
				</c:otherwise>
			</c:choose>
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
