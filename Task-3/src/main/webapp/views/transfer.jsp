<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/bank/doTransfer" method="POST" modelAttribute="trans">
	creditID:<form:input path="uid1"/><br>
	DebitID:<form:input path="uid2"/><br>
	Amount:<form:input path="uamount"/><br>
	
	<input type="submit" value="Menu">
	
</form:form>