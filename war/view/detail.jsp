
<table class="tablebg" border=1>
	    <tr class="label">
	      <th>TenSach</th>
	      <th>GiaSach</th>
	      <th>MaSach</th>
	      <th>MaLoai</th>
	      <th>SoLuong</th>
	      <th>TacGia</th>
	      <th>SoLuongMua</th>
	    </tr>
	      <tr>
	        <td ><c:out value="${book.tensach}" /></td>
	        <td ><c:out value="${book.giasach}" /></td>
	        <td ><c:out value="${book.masach}" /></td>
	        <td ><c:out value="${book.tenloai}" /></td>
	        <td ><c:out value="${book.soluong}" /></td>
	        <td ><c:out value="${book.tacgia}" /></td>
	        <form action="buy">
	        <td><input type="text" name="soluongmua" value="1"></td> 
	        <td>
        		<input name="masach" value="${book.masach}" style="visibility: hidden; width: 5px;height: 0px;">
        		<input name="giasach" value="${book.giasach}" style="visibility: hidden; width: 5px;height: 0px;">
        		<input name="maloai" value="${book.maloai}" style="visibility: hidden; width: 5px;height: 0px;">
        		<input name="book" value="${book}" style="visibility: hidden; width: 5px;height: 0px;">
        		<input type="text" name="soluongcon" value="${book.soluong}" style="visibility: hidden; width: 5px;height: 0px;">
          		<input type="submit" value="Mua" >
		     </td>
		     </form>
	      </tr> 
    </table>
    <%= request.getAttribute("error") %>
   
  <br><button><a href="goHome" >Tro ve</a></button>  

