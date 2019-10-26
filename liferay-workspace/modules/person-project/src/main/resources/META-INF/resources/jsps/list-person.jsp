<%@ include file="../init.jsp" %>

<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletMode"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>

<%@page import="org.liferayasif.person.model.Person"%>
<%@page import="java.util.List"%>
<%@page import="org.liferayasif.person.service.PersonLocalServiceUtil"%>

<portlet:renderURL var="addEntryURL">
    <portlet:param name="mvcPath" value="/jsps/create-person.jsp"></portlet:param>
</portlet:renderURL>

<aui:button-row>
    <aui:button onClick="<%=addEntryURL.toString()%>" value="Create Person" style="color: #FFF; background-color: #0B5FFF; border-color: #0B5FFF;"></aui:button>
</aui:button-row>


<table>
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Age</th>
      <th scope="col" colspan="3">Action</th>
    </tr>
  </thead>
  
  <tbody>
  	<%
  		List<Person> personList = PersonLocalServiceUtil.getPersons(-1, -1);
  		
  		if(personList!=null && !personList.isEmpty()){
  			
		  	for(Person person : personList){
		  		
			  	%>
				    <tr>
				      <td><%= person.getName() %></td>
				      <td><%= person.getAge() %></td>
				      <td><button onClick="getDetail(this);" id='<%= person.getPersonId()+"" %>'>Detail</button></td>
				      <td><button onClick="getDelete(this);" id='<%= person.getPersonId()+"" %>'>Delete</button></td>
				      <td><button onClick="updatePerson(this);" id='<%= person.getPersonId()+"" %>'>Update</button></td>
				    </tr>
	  			<%
			}
  		}
  		else{

		  	%>
			    <tr>
			      <td colspan="4" style="background-color: #e6fff0;"><center>Person List is empty</center></td>
			    </tr>
  			<%
  		}
  	%>
  </tbody>
</table>

<aui:script>
 
 	function getDetail(obj){
 		
 		var actionURL = Liferay.PortletURL.createActionURL();
		actionURL.setWindowState("<%=LiferayWindowState.NORMAL.toString() %>");
		actionURL.setPortletMode("<%=LiferayPortletMode.VIEW %>");
		actionURL.setParameter("personId", obj.id);
		actionURL.setParameter("javax.portlet.action","getDetails");
		actionURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
		
		window.location = actionURL;
		
 	}
 	
 	function getDelete(object){
 	
 		var actionURL = Liferay.PortletURL.createActionURL();
		actionURL.setWindowState("<%=LiferayWindowState.NORMAL.toString() %>");
		actionURL.setPortletMode("<%=LiferayPortletMode.VIEW %>");
		actionURL.setParameter("personId", object.id);
		actionURL.setParameter("javax.portlet.action","deletePerson");
		actionURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
		
		window.location = actionURL;
 	}
 	
 	function updatePerson(object){
 	
 		var actionURL = Liferay.PortletURL.createActionURL();
		actionURL.setWindowState("<%=LiferayWindowState.NORMAL.toString() %>");
		actionURL.setPortletMode("<%=LiferayPortletMode.VIEW %>");
		actionURL.setParameter("personId", object.id);
		actionURL.setParameter("update", true);
		actionURL.setParameter("javax.portlet.action","getDetails");
		actionURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
		
		window.location = actionURL;
 	}
 	
</aui:script>

<style>
	table {
	  font-family: arial, sans-serif;
	  border-collapse: collapse;
	  width: 80%;
	}
	
	td, th {
	  border: 1px solid #00fff0;
	  text-align: left;
	  padding: 8px;
	}
	
	tr:nth-child(even) {
	  background-color: #efffff;
	}
</style>