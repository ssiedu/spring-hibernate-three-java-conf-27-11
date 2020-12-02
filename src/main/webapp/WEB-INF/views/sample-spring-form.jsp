<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<html>
<body>
<h3>Sample-Spring-Form</h3>


<frm:form action="dosomething" modelAttribute="book">
	<pre>
		Code	<frm:input path="code"/>
		Title	<frm:input path="title"/>
		Subject	<frm:select path="subject" items="${subjects}"/>
		Author	<frm:input path="author"/>
		Price	<frm:input path="price"/>
			<input type="submit" value="Save"/>
	</pre>				

</frm:form>

</body>
</html>