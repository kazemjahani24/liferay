<%@ include file="../init.jsp" %>


<portlet:renderURL var="addEntryURL">
    <portlet:param name="mvcPath" value="/jsps/edit_entry.jsp"></portlet:param>
</portlet:renderURL>

<h2>Success</h2>

<aui:button-row>
    <aui:button onClick="<%=addEntryURL.toString()%>" value="Add Entry"></aui:button>
</aui:button-row>