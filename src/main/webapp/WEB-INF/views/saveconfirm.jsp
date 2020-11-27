<%@page isELIgnored="false" %>
<html>
<body>
	<h3>Following Details Stored Succssfully : </h3>
	<hr>
		<pre>
			Code	${bookinfo.code}
			Title	${bookinfo.title}
			Subject	${bookinfo.subject}
			Author	${bookinfo.author}
			Price	${bookinfo.price}
		</pre>
	<hr>
	<a href="newbook">Add-More</a><br>
	<a href="index.jsp">Home</a><br>
</body>
</html>