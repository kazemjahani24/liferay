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

package org.liferayasif.person.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.liferayasif.person.model.Person;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing Person in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class PersonCacheModel implements CacheModel<Person>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PersonCacheModel)) {
			return false;
		}

		PersonCacheModel personCacheModel = (PersonCacheModel)obj;

		if (personId == personCacheModel.personId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, personId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", personId=");
		sb.append(personId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", age=");
		sb.append(age);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", emailId=");
		sb.append(emailId);
		sb.append(", nationality=");
		sb.append(nationality);
		sb.append(", occupation=");
		sb.append(occupation);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Person toEntityModel() {
		PersonImpl personImpl = new PersonImpl();

		if (uuid == null) {
			personImpl.setUuid("");
		}
		else {
			personImpl.setUuid(uuid);
		}

		personImpl.setPersonId(personId);

		if (name == null) {
			personImpl.setName("");
		}
		else {
			personImpl.setName(name);
		}

		personImpl.setAge(age);

		if (gender == null) {
			personImpl.setGender("");
		}
		else {
			personImpl.setGender(gender);
		}

		if (emailId == null) {
			personImpl.setEmailId("");
		}
		else {
			personImpl.setEmailId(emailId);
		}

		if (nationality == null) {
			personImpl.setNationality("");
		}
		else {
			personImpl.setNationality(nationality);
		}

		if (occupation == null) {
			personImpl.setOccupation("");
		}
		else {
			personImpl.setOccupation(occupation);
		}

		personImpl.resetOriginalValues();

		return personImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		personId = objectInput.readLong();
		name = objectInput.readUTF();

		age = objectInput.readInt();
		gender = objectInput.readUTF();
		emailId = objectInput.readUTF();
		nationality = objectInput.readUTF();
		occupation = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(personId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeInt(age);

		if (gender == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gender);
		}

		if (emailId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailId);
		}

		if (nationality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nationality);
		}

		if (occupation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occupation);
		}
	}

	public String uuid;
	public long personId;
	public String name;
	public int age;
	public String gender;
	public String emailId;
	public String nationality;
	public String occupation;

}