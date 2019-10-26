<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@ include file="../init.jsp" %>

<%@page import="org.liferayasif.person.model.Person"%>

<portlet:actionURL var="updatePersonActionURL" name="updatePerson"></portlet:actionURL>


<%
	Object object = request.getAttribute("person");
	System.out.println(object);
	
	Person person = null;
	
	if(object!=null){
		person = (Person)object;
		
	}
	
	if(person!=null){
		
		%>
			<h1>Update Person</h1>
			<aui:form action="<%=updatePersonActionURL%>" name="personForm"  method="POST">
				
				<table>
					<tr>
						<td><aui:input type="text" label="PersonId" name="personId" value="<%= person.getPersonId() %>" /></td>
					</tr>
					<tr>
						<td><aui:input type="text" label="Name" name="name" value="<%= person.getName() %>" /></td>
					</tr>	
					<tr>
						<td><aui:input type="text" label="Age" name="age" value="<%= person.getAge() %>" /></td>
					</tr>
					<tr>
						<td><aui:input type="text" label="Gender" name="gender" value="<%= person.getGender() %>" /></td>
					</tr>
					
					<tr>
						<td><aui:input type="text" label="Email" name="emailId" value="<%= person.getEmailId() %>" /></td>
					</tr>
					<tr>
						<td><aui:input type="text" label="Nationality" name="nationality" value="<%= person.getNationality() %>" /></td>
					</tr>
					<tr>
						<td><aui:input type="text" label="Occupation" name="occupation" value="<%= person.getOccupation() %>" /></td>
					</tr>
								
				</table>
				<aui:button type="submit" value="Update Details" />
				
				
			</aui:form>
		<%
	}
	%>

