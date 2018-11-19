<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register | Workout</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="header.jsp" %>
<h1>Register</h1>

<form method="post">
    <label for="userName">User Name: </label>
    <input type="text" name="userName" id="userName" required />
    <label for="password">Password: </label>
    <input type="password" name="password" id="password" required />
    <label for="confirmPassword">Confirm Password</label>
    <input type="password" name="confirmPassword" id="confirmPassword" required />
    <input type="submit" name="submit" id="submit" />
</form>
<%@include file="footer.jsp" %>
</body>
</html>