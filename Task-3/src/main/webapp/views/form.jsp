<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/bank/createAccount" method="POST" modelAttribute="bank">
	UserID:<form:input path="uid"/><br>
	User Name:<form:input path="uname"/><br>
	User Amount:<form:input path="uamount"/><br>
	
	<input type="submit" value="submit">
	
</form:form>