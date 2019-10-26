package org.third.portlet;

import org.third.constants.ThirdPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;


@Component(
	immediate = true,
	property = {
			
			
		"com.liferay.portlet.display-category=category.aditya",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Third",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ThirdPortletKeys.THIRD,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	
	
	},
	service = Portlet.class
)
public class ThirdPortlet extends MVCPortlet {
}