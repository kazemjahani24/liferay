<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@ include file="../init.jsp" %>

<%@page import="org.liferayasif.person.model.Person"%>

<%
	Object object = request.getAttribute("person");
	System.out.println(object);
	
	Person person = null;
	
	if(object!=null){
		person = (Person)object;
		
	}
	
	if(person!=null){
		
		%>
			<h1>Person Details</h1>
				
			<table>
				<tr>
					<td>Id</td>
					<td><%=person.getPersonId() %></td>
				
				</tr>
					<tr>
					<td>Name</td>
					<td><%=person.getName() %></td>
				
				</tr>
					<tr>
					<td>Gender</td>
					<td><%=person.getGender() %></td>
				
				</tr>
					<tr>
					<td>Email</td>
					<td><%=person.getEmailId() %></td>
					
				
				</tr>
					<tr>
					<td>Nationality</td>
					<td><%=person.getNationality() %></td>
				</tr>
					<tr>
					<td>Occupation</td>
					<td><%=person.getOccupation() %></td>
				
				</tr>
			</table>
				
		<%
	}
	%>

