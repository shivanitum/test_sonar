<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title> Student Registration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
First Name:<form:input path="firstName"/>
<br></br>
Last Name:<form:input path="lastName"/><br></br>
Country:
<form:select path="country">
<form:option value="Brazil" label="Brazil"/>
<form:option value="Germany " label="Germany"/>
<form:option value="India" label="India"/>
<form:option value="France " label="France"/>
</form:select>
<br></br>
C++<form:radiobutton path="favouriteLanguage" value="C++"/>
Java <form:radiobutton path="favouriteLanguage" value="Java"/>
Python <form:radiobutton path="favouriteLanguage" value="Python"/>
Perl <form:radiobutton path="favouriteLanguage" value="Perl"/>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>