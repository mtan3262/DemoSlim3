
 	 <table class="tablebg" border=1>
    <tr class="label">
      <th>So Hoa Don</th>
      <th>Ma Khach Hang</th>
      <th>Ngay Xuat</th>
      <th>Tong tien</th>
    </tr>
    <c:forEach var="e" varStatus="s" items="${history}">
      <tr>
        <td ><c:out value="${e.sohoadon}" /></td>
        <td ><c:out value="${e.makhachhang}" /></td>
        <td ><c:out value="${e.ngayxuat}" /></td>
        <td ><c:out value="${e.tongtien}" /></td>
      </tr>
    </c:forEach> 
     </table>
     <a href="goHome"><button>Tro veÅ</button></a>