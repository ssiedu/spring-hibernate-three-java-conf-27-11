<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>

<html>
<body>
	<h3>All-Books-Using-JSTL</h3>
	<hr>
		<table border="1">
			<tr>
				<th>Code</th><th>Title</th><th>Subject</th><th>Author</th><th>Price</th>
			<tr>
		
			<jstl:forEach items="${books}" var="book" >
	
			
			<tr>
				<td>${book.code}</td>
				<td>${book.title}</td>
				<td>${book.subject}</td>
				<td>${book.author}</td>
				<td>${book.price}</td>
				<td><a href="deletebook?bookcode=${book.code}">[x]</a></td>
				<td><a href="change?bookcode=${book.code}">change</a>
			<tr>
	
		</jstl:forEach>
		
		</table>	
	<hr>
	<a href="index.jsp">Home</a>
</body>
</html>