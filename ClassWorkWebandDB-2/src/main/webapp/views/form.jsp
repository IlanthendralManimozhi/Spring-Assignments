<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/student/createstudent" method="POST" modelAttribute="student">
	StudentID:<form:input path="studentId"/><br>
	StudentName:<form:input path="studentName"/><br>
	StudentCity:<form:input path="studentCity"/><br>
	StudentAge:<form:input path="studentAge"/><br>
	
	<input type="submit" value="submit">
	
</form:form>