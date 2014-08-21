
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" session="true"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<div id="header">
				<div id="logo">
					<a href="goHome""><img src="images/logo.png" alt="LOGO"></a>
				</div>
				<div id="navigation">
					<ul id="primary">
						
						
					</ul>
					<ul id="secondary">
						<li><a>Hi ${f:h(user)},tổng sách: ${tongsach}, tổng tiền: ${tongtien}</a></li>
						<li>
							 <a href="viewInvoice" >Xem giỏ hàng</a>
						</li>
						<li>
							<a href="index">Đăng xuất</a> |<a href="viewHistory">Lịch sử mua sắm</a>
						</li>
						
					</ul>
					
				</div>
			</div>
</body>
</html>

