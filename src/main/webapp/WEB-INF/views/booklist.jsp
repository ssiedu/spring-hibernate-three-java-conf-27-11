<%@ page import="java.util.List, com.ssi.entities.Book" %>
<%
	List<Book> books=(List<Book>)request.getAttribute("books");
%>
<html>
<body>
	<h3>All-Books</h3>
	<hr>
		<table border="1">
			<tr>
				<th>Code</th><th>Title</th><th>Subject</th><th>Author</th><th>Price</th>
			<tr>
		
		<%
			for(Book book : books){
		%>
			<tr>
				<td><%=book.getCode()%></td>
				<td><%=book.getTitle() %></td>
				<td><%=book.getSubject() %></td>
				<td><%=book.getAuthor() %></td>
				<td><%=book.getPrice() %></td>
			<tr>
		<%
			}
		%>
		
		</table>	
	<hr>
	<a href="index.jsp">Home</a>
</body>
</html>