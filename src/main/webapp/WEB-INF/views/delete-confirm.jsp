<%@page isELIgnored="false" %>
<html>
<body>
	<h3>Following Book Is Deleted Successfully : </h3>
	<hr>
		<pre>
			Code	${book.code}
			Title	${book.title}
			Subject	${book.subject}
			Author	${book.author}
			Price	${book.price}
		</pre>
	<hr>
	<a href="showall">Book-List</a><br>
	<a href="index.jsp">Home</a><br>
</body>
</html>