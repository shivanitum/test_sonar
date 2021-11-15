<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style>.error {color:red}</style>
<title>Customer Registration</title>
</head>
<body>
Fill out the form
<form:form action="processForm" modelAttribute="customer">
First Name:<form:input path="firstName"/>
Last Name:<form:input path="lastName"/>
Last Name(*)<form:errors path="lastName" cssClass="error"/>
<br>
<form:input path="freePasses" />
Free passes: <form:errors path="freePasses" cssClass="error"/>
<br>
<form:input path="postalCode" />
Postal Code: <form:errors path="postalCode" cssClass="error"/>
<br>
<form:input path="courseCode" />
Course Code: <form:errors path="courseCode" cssClass="error"/>
<br>

<input type="submit" value="Submit"/>
</form:form>
<br></br>

</body>
</html>