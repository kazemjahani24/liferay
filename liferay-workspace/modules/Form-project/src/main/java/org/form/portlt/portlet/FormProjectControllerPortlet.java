package org.form.portlt.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.util.Date;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import org.form.portlt.constants.FormProjectControllerPortletKeys;
import org.liferayasif.model.Student;
import org.liferayasif.service.StudentLocalServiceUtil;
import org.osgi.service.component.annotations.Component;
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=FormProjectController",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/jsps/view.jsp",
		"javax.portlet.name=" + FormProjectControllerPortletKeys.FORMPROJECTCONTROLLER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FormProjectControllerPortlet extends MVCPortlet {
	
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		System.out.println("render list ");
		super.render(renderRequest, renderResponse);
	}
	public void addStudent(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
	 
		try{
	    
			
	    	 String firstName = ParamUtil.getString(actionRequest, "firstName");
		     String lastName = ParamUtil.getString(actionRequest, "lastName");
		    
		     System.out.println("firstName: "+firstName);
		     System.out.println("lastName: "+lastName);
		  
		     
		     Student student = StudentLocalServiceUtil.createStudent(CounterLocalServiceUtil.increment());
		     student.setEmail("asif@mail.com");
		     student.setFatherName("aftab");
		     student.setAddressId(3);
		     student.setDob(new Date());
		     student.setMale(true);
		     
		     StudentLocalServiceUtil.updateStudent(student);
		     StudentLocalServiceUtil.getStudents(-1, -1);
		     
			/*
			 * ThemeDisplay themeDisplay =
			 * (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			 * 
			 * User user = themeDisplay.getUser();
			 * 
			 * System.out.println("companyId: "+user.getCompanyId());
			 * System.out.println("groupid: "+user.getGroupId());
			 * System.out.println("screenname : "+user.getScreenName());
			 * System.out.println("userid : "+user.getUserId());
			 * System.out.println("status : "+user.getStatus());
			 * 
			 * System.out.println("\n\n\n");
			 * 
			 * List<User> userList = UserLocalServiceUtil.getUsers(-1, -1);
			 * 
			 * for(User user1 : userList) {
			 * System.out.println("screen name1: "+user1.getScreenName());
			 * System.out.println("status1 : "+user1.getStatus()); }
			 */
	     }
	     catch(Exception e){
	           e.printStackTrace();           
	     }
	     actionResponse.setRenderParameter("mvcPath",  "/jsps/success.jsp");
	}
	
}