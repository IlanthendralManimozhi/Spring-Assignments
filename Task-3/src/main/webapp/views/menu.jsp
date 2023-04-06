<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/bank/createAccount" method="GET" modelAttribute="menu">
    <input type="submit" value="Create Account" >		
</form:form>
<form:form action="/bank/accountBalance" method="GET" modelAttribute="menu">
    <input type="submit" value="Check Balance" >		
</form:form>
<form:form action="/bank/doTransfer" method="GET" modelAttribute="menu">
    <input type="submit" value="Money Transfer" >		
</form:form>