<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Add New Product</h1>
	
	<form:form  modelAttribute="empObj">
		<form:errors path="" element="div"/>
		
			<div>
				
				<form:label path = "name">Employee Name</form:label>
				<form:input path = "name"/><br/>
				<form:label path = "eMailId">Employee Email</form:label>
				<form:input path = "eMailId"/><br/>
				<form:label path = "contact">Employee Email</form:label>
				<form:input path = "contact"/><br/>
				<form:label path = "dep.depName">Employee Department</form:label>
				<form:input path = "dep.depName"/><br/>
				
				<form:errors path="name"/>
				<form:errors path="eMailId"/>
				<form:errors path="contact"/>
				<form:errors path="dep.depNamesss"/>
				
			</div>
		
			<div>
				<input type = "submit" value = "Add Product"/>
			</div>
	</form:form>
	
</body>
</html>