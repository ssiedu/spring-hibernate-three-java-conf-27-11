<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<html>
<body>
<h3>Sample-Spring-Form</h3>


<frm:form action="savebook" modelAttribute="book" method="post" enctype="multipart/form-data" >
	<pre>
		Code	<frm:input path="code"/>	<i><frm:errors path="code"/></i>
		Title	<frm:input path="title"/>	<i><frm:errors path="title"/></i>
		Subject	<frm:select path="subject" items="${subjects}"/>
		Author	<frm:input path="author"/>	<i><frm:errors path="author"/></i>
		Price	<frm:input path="price"/>	<i><frm:errors path="price"/></i>
		Pict	<input type="file" name="f1"/>
			<input type="submit" value="Save"/>
	</pre>				

	

</frm:form>

</body>
</html>