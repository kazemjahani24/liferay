/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.liferayasif.person.service.impl;

import com.liferay.portal.aop.AopService;

import org.liferayasif.person.service.base.PersonLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the person local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>org.liferayasif.person.service.PersonLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersonLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=org.liferayasif.person.model.Person",
	service = AopService.class
)
public class PersonLocalServiceImpl extends PersonLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>org.liferayasif.person.service.PersonLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>org.liferayasif.person.service.PersonLocalServiceUtil</code>.
	 */
}