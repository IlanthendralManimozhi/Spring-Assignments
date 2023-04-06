<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/bank/menu" method="GET" modelAttribute="balanceDisplay">
	<h3>User ID:</h3>${balanceDisplay.uid}<br>
    <h3>User Name:</h3>${balanceDisplay.uname}<br>
    <h3>User Amount:</h3>${balanceDisplay.uamount}<br>
	<input type="submit" value="Menu">	
</form:form>