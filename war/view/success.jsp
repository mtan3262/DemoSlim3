
<table border=1>
		<tr>
			<th>TenSach</th>
			<th>GiaSach</th>

		</tr>
		<c:forEach var = "e"   items = "${list}">
		<tr>
			<td><c:out value="${e.tensach}"/></td>
			<td><c:out value="${e.giasach}"/></td>
			<td>
        	<form action="viewDetail">
        		<input name="masach" value="${e.masach}" style="visibility: hidden; width: 5px;height: 0px;">
        		<input name="maloai" value="${e.maloai}" style="visibility: hidden; width: 5px;height: 0px;">
          		<input type="submit" value="Xem">
          	</form>
        </td>
		</tr>
	</c:forEach>
	
</table>
