<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Login</title>
</head>
<body>
<p>Hello Login !!!</p>

<form method="post" action="login">
Username: <input type="text" name="username" ><br>
Password: <input type="password" name="password"  ><br>
<input type="submit" value="Login"> 
</form>

</body>
</html>
