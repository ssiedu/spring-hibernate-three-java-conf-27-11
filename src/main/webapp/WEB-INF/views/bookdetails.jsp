<%@page isELIgnored="false" %>
<html>
<body>
	<h3>Book Details : </h3>
	<hr>
		<pre>
			Code	${book.code}
			Title	${book.title}
			Subject	${book.subject}
			Author	${book.author}
			Price	${book.price}
		</pre>
		<img src="loadpicture?code=${book.code}" width="50" height="50"/>
	<hr>
	<a href="searchbook">Search-More</a><br>
	<a href="index.jsp">Home</a><br>
</body>
</html>