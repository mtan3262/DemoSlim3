
<table border= 1>
	<tr>
		<th>Stt</th>
		<th>TenSach</th>
		<th>GiaSach</th>
		<th>Soluongmua</th>
		<th>Tongtien</th>
		
		</tr>
	<tbody>
		 <c:forEach var="e" varStatus="s" items="${listbook}">
		 
      <tr >
		 <td class="number"><c:out value="${e.stt}" /></td>
        <td class="text"><c:out value="${e.tensach}" /></td>
        <td class="number"><c:out value="${e.giasach}" /></td>
        <td class="number"><c:out value="${e.soluongmua}" /></td>
        <td class="number"><c:out value="${e.tongtienmua}" /></td>
        <td>
	        <form action="removeBook">
		        <input name="removeBook" value="${e.stt}" style="visibility: hidden; width: 5px;height: 0px;">
		         <input name="booktotal" value="${e.soluongmua}" style="visibility: hidden; width: 5px;height: 0px;">
		          <input name="moneytotal" value="${e.tongtienmua}" style="visibility: hidden; width: 5px;height: 0px;">
		        <input type="submit" value="Huy">
	        </form>
         </td>
        </tr>
		</c:forEach> 
	</tbody>
</table>
<a href="update"><button>Thanh toan</button></a>
<a href="goHome"><button>Tro veÅ</button><a>

