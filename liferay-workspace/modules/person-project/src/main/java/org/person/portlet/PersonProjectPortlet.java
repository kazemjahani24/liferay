package org.person.portlet;

import org.person.constants.PersonProjectPortletKeys;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import java.io.IOException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;

import org.liferayasif.person.model.Person;
import org.liferayasif.person.service.PersonLocalServiceUtil;
import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=PersonProject",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/jsps/list-person.jsp",
		"javax.portlet.name=" + PersonProjectPortletKeys.PERSONPROJECT,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	
	service = Portlet.class
)

public class PersonProjectPortlet extends MVCPortlet {
	
	
	public void updatePerson(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		 
		try{
			 Integer personId = ParamUtil.getInteger(actionRequest, "personId");
		     String name = ParamUtil.getString(actionRequest, "name");
		     Integer age = ParamUtil.getInteger(actionRequest, "age");
		     String gender = ParamUtil.getString(actionRequest, "gender");
		     String emailId = ParamUtil.getString(actionRequest, "emailId");
		     String nationality = ParamUtil.getString(actionRequest, "nationality");
		     String occupation = ParamUtil.getString(actionRequest, "occupation");
		     System.out.println("personId: "+personId);
		     System.out.println("name: "+name);
		     Person person = PersonLocalServiceUtil.fetchPerson(personId);
		     System.out.println("update person: "+person);
		     if(person!=null) {
		    	 person.setName(name);
		    	 person.setAge(age);
		    	 person.setGender(gender);
		    	 person.setEmailId(emailId);
		    	 person.setNationality(nationality);
		    	 person.setOccupation(occupation);
		    	 person = PersonLocalServiceUtil.updatePerson(person);
		    	 System.out.println(person);
		     }
		    
		}
		catch(Exception e){
           e.printStackTrace();           
	    }
		
		actionResponse.setRenderParameter("mvcPath",  "/jsps/list-person.jsp");
	}
	
	public void deletePerson(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		
		Integer personId = ParamUtil.getInteger(actionRequest, "personId");
		System.out.println("deletePerson: "+personId);
		
		Person person = null;
		
		try {
			person = PersonLocalServiceUtil.deletePerson(personId);
		} 
		catch (PortalException e) {
			e.printStackTrace();
		}
		
		actionRequest.setAttribute("person", person);
		
		actionResponse.setRenderParameter("mvcPath",  "/jsps/list-person.jsp");
	}
	
	
	public void getDetails(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		
		Integer personId = ParamUtil.getInteger(actionRequest, "personId");
		Person person = null;
		
		person = PersonLocalServiceUtil.fetchPerson(personId);
		
		boolean update = ParamUtil.getBoolean(actionRequest, "update", false);
		
		actionRequest.setAttribute("person", person);
		
		if(update) {
			actionResponse.setRenderParameter("mvcPath",  "/jsps/update-person.jsp");
		}
		else {
			actionResponse.setRenderParameter("mvcPath",  "/jsps/detail-person.jsp");
		}
		
	}
	
	@SuppressWarnings("deprecation")
	public void addPerson(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		 
		
		try{
		
		     String name = ParamUtil.getString(actionRequest, "name");
		     Integer age = ParamUtil.getInteger(actionRequest, "age");
		     String gender = ParamUtil.getString(actionRequest, "gender");
		     String emailId = ParamUtil.getString(actionRequest, "emailId");
		     String nationality = ParamUtil.getString(actionRequest, "nationality");
		     String occupation = ParamUtil.getString(actionRequest, "occupation");

		     Person person = PersonLocalServiceUtil.createPerson(CounterLocalServiceUtil.increment());
		     
		     if(person!=null) {
		    	 person.setName(name);
		    	 person.setAge(age);
		    	 person.setGender(gender);
		    	 person.setEmailId(emailId);
		    	 person.setNationality(nationality);
		    	 person.setOccupation(occupation);
		    	 person = PersonLocalServiceUtil.updatePerson(person);
		    	 System.out.println(person);
		     }
		}
		catch(Exception e){
           e.printStackTrace();           
	    }
		
		actionResponse.setRenderParameter("mvcPath",  "/jsps/list-person.jsp");
			
	}
	
}