<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Wellcome ${f:h(username)}
<table border=1>
		<tr>
			<th>MaKhachHang</th>
			<th>TenKhachHang</th>
			<th>DiaChi</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<c:forEach var = "e"   items = "${list}">
		<tr>
			<td><c:out value="${e.maKhachHang}"/></td>
			<td><c:out value="${e.tenkhachhang}"/></td>
			<td><c:out value="${e.diachi}"/></td>
			<td><c:out value="${e.email}"/></td>
			<td><c:out value="${e.password}"/></td>
		</tr>
	</c:forEach>
	
</table>

</body>
</html>