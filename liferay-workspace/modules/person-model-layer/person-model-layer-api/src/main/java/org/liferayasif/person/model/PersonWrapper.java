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

package org.liferayasif.person.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link Person}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Person
 * @generated
 */
@ProviderType
public class PersonWrapper
	extends BaseModelWrapper<Person> implements Person, ModelWrapper<Person> {

	public PersonWrapper(Person person) {
		super(person);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("personId", getPersonId());
		attributes.put("name", getName());
		attributes.put("age", getAge());
		attributes.put("gender", getGender());
		attributes.put("emailId", getEmailId());
		attributes.put("nationality", getNationality());
		attributes.put("occupation", getOccupation());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long personId = (Long)attributes.get("personId");

		if (personId != null) {
			setPersonId(personId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer age = (Integer)attributes.get("age");

		if (age != null) {
			setAge(age);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String emailId = (String)attributes.get("emailId");

		if (emailId != null) {
			setEmailId(emailId);
		}

		String nationality = (String)attributes.get("nationality");

		if (nationality != null) {
			setNationality(nationality);
		}

		String occupation = (String)attributes.get("occupation");

		if (occupation != null) {
			setOccupation(occupation);
		}
	}

	/**
	 * Returns the age of this person.
	 *
	 * @return the age of this person
	 */
	@Override
	public int getAge() {
		return model.getAge();
	}

	/**
	 * Returns the email ID of this person.
	 *
	 * @return the email ID of this person
	 */
	@Override
	public String getEmailId() {
		return model.getEmailId();
	}

	/**
	 * Returns the gender of this person.
	 *
	 * @return the gender of this person
	 */
	@Override
	public String getGender() {
		return model.getGender();
	}

	/**
	 * Returns the name of this person.
	 *
	 * @return the name of this person
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the nationality of this person.
	 *
	 * @return the nationality of this person
	 */
	@Override
	public String getNationality() {
		return model.getNationality();
	}

	/**
	 * Returns the occupation of this person.
	 *
	 * @return the occupation of this person
	 */
	@Override
	public String getOccupation() {
		return model.getOccupation();
	}

	/**
	 * Returns the person ID of this person.
	 *
	 * @return the person ID of this person
	 */
	@Override
	public long getPersonId() {
		return model.getPersonId();
	}

	/**
	 * Returns the primary key of this person.
	 *
	 * @return the primary key of this person
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this person.
	 *
	 * @return the uuid of this person
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the age of this person.
	 *
	 * @param age the age of this person
	 */
	@Override
	public void setAge(int age) {
		model.setAge(age);
	}

	/**
	 * Sets the email ID of this person.
	 *
	 * @param emailId the email ID of this person
	 */
	@Override
	public void setEmailId(String emailId) {
		model.setEmailId(emailId);
	}

	/**
	 * Sets the gender of this person.
	 *
	 * @param gender the gender of this person
	 */
	@Override
	public void setGender(String gender) {
		model.setGender(gender);
	}

	/**
	 * Sets the name of this person.
	 *
	 * @param name the name of this person
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the nationality of this person.
	 *
	 * @param nationality the nationality of this person
	 */
	@Override
	public void setNationality(String nationality) {
		model.setNationality(nationality);
	}

	/**
	 * Sets the occupation of this person.
	 *
	 * @param occupation the occupation of this person
	 */
	@Override
	public void setOccupation(String occupation) {
		model.setOccupation(occupation);
	}

	/**
	 * Sets the person ID of this person.
	 *
	 * @param personId the person ID of this person
	 */
	@Override
	public void setPersonId(long personId) {
		model.setPersonId(personId);
	}

	/**
	 * Sets the primary key of this person.
	 *
	 * @param primaryKey the primary key of this person
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this person.
	 *
	 * @param uuid the uuid of this person
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected PersonWrapper wrap(Person person) {
		return new PersonWrapper(person);
	}

}