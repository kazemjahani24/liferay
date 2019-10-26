<%@ include file="../init.jsp" %>

<portlet:actionURL var="addPersonActionURL" name="addPerson"></portlet:actionURL>

<h1>Person Form</h1>

	<aui:form action="<%=addPersonActionURL%>" name="personForm"  method="POST">
		
		<aui:input  type="text" name="name" label="Name" /><br/>
		
		<aui:input  type="text" name="age" label="Age" /><br/>
		
		<aui:input  type="text" name="gender" label="Gender" /><br/>
		
		<aui:input  type="text" name="emailId" label="Email" /><br/>
		
		<aui:input  type="text" name="nationality" label="Nationality" /><br/>
		
		<aui:input  type="text" name="occupation" label="Occupation" /><br/>
		
		<aui:button type="submit" name="addPerson" value="Add Person" />
		
	</aui:form>