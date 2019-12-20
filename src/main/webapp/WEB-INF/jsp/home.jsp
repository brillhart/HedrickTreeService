<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="Home"/>
<%@include file="common/header.jsp" %>
<c:url value="/" var="home"/>

<h2>Hedrick Tree Service</h2>

<form:form action="${requestInfo}" method="POST" modelAttribute="requestinfo">

	<div class="infoInput">
		<div>
			<label for="name">Name</label>
			<form:input path="name"/>
			<form:errors path="name" cssClass="error"/> 
		</div>
		<div>
			<label for="email">Email</label>
			<form:input path="email"/>
			<form:errors path="email" cssClass="error"/>
		</div>
		<div>
			<label for="phone">Phone</label>
			<form:input path="phone"/>
			<form:errors path="phone" cssClass="error"/>
		</div>
		<div>
			<label for="address">Address</label>
			<form:input path="address"/>
			<form:errors path="address" cssClass="error"/>
		</div>
		<div>
			<label for="comment">Comments</label>
			<form:input path="comment"/>
			<form:errors path="comment" cssClass="error"/>
		</div>
		<div>
			<input type="submit" value="Request Info"/>
		</div>
	</div>
</form:form>


<%@include file="common/footer.jsp" %>