<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/student/createstudent" method="POST" modelAttribute="student">
	StudentID:<form:input path="sid"/><br>
	StudentName:<form:input path="sname"/><br>
	StudentCity:<form:input path="scity"/><br>
	StudentAge:<form:input path="sage"/><br>
	
	<input type="submit" value="click...">
	
</form:form>