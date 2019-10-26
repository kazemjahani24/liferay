<%@ include file="../init.jsp" %>

<portlet:actionURL var="addStudentActionURL" name="addStudent"></portlet:actionURL>

<h1>Student Form</h1>

	<aui:form action="<%=addStudentActionURL%>" name="studentForm"  method="POST">
		
		<aui:input  type="text" name="firstName" label="First Name"/><br/>
		
		<aui:input type="text" name="lastName" label="Last Name" id="lastName" /><br/>
		
		<input type="text" name="<portlet:namespace/>myName" id="<portlet:namespace/>myName" /><br/>
		
		<aui:button type="submit" name="addStudent" value="Add Student" />
		
	</aui:form>