<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>

<title>Customer Confirmation</title>
</head>
<body>

Customer is confirmed:${customer.firstName} ${customer.lastName}
<br>
Free pass: ${customer.freePasses}<br>
Postal code is:${customer.postalCode}<br>
Course code is:${customer.courseCode}<br>
</body>
</html>