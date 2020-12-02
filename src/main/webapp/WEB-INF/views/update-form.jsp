<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page isELIgnored="false" %>
<html>
<body>
	<h3>Book-Update-Form</h3>
	<hr>
	<form:form action="savechanges" modelAttribute="book">
	<pre>
		Code	<form:input path="code"/>
		Title	<form:input path="title"/>
		Subject	<form:input path="subject"/>
		Author	<form:input path="author"/>
		Price	<form:input path="price"/>
			<input type="submit" value="SaveChanges"/>
	</pre>				
	</form:form>
	<hr>
	<a href="index.jsp">Home</a>
</body>
</html>