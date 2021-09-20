<%@ include file="common/head.jspf" %>
<%@ include file="common/navigation.jspf" %>
		<h1>Welcome to our crampon sale website</h1><br><br>
		
		
		<table class="table table-striped">
			<thead>
				<tr>
					
					<th scope="col">Image</th>
      				<th scope="col">Make</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${cramps }" var="cramp">
					<tr>
						<td><a href="/image-crampon?id=${cramp.id}"><img src="${cramp.image}" width="350" height="200"></a></td>
						<td>${cramp.make}</td>
						<td><a href="/update-crampon?id=${cramp.id}"><button type="button" class="btn btn-success">Update</button></a></td>
						<td><a href="/delete-crampon?id=${cramp.id}"><button type="button" class="btn btn-danger">Delete</button></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/add-crampon"><button type="button" class="btn btn-primary">Add crampon</button></a>
       <%@ include file="common/footer.jspf" %>
