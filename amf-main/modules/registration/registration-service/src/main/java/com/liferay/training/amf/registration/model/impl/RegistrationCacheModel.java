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

package com.liferay.training.amf.registration.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.training.amf.registration.model.Registration;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Registration in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RegistrationCacheModel
	implements CacheModel<Registration>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RegistrationCacheModel)) {
			return false;
		}

		RegistrationCacheModel registrationCacheModel =
			(RegistrationCacheModel)object;

		if (userID == registrationCacheModel.userID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", userID=");
		sb.append(userID);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", firstname=");
		sb.append(firstname);
		sb.append(", lastname=");
		sb.append(lastname);
		sb.append(", email=");
		sb.append(email);
		sb.append(", username=");
		sb.append(username);
		sb.append(", password=");
		sb.append(password);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", dob=");
		sb.append(dob);
		sb.append(", homephone=");
		sb.append(homephone);
		sb.append(", mobilephone=");
		sb.append(mobilephone);
		sb.append(", address1=");
		sb.append(address1);
		sb.append(", address2=");
		sb.append(address2);
		sb.append(", city=");
		sb.append(city);
		sb.append(", state=");
		sb.append(state);
		sb.append(", zipcode=");
		sb.append(zipcode);
		sb.append(", securityquestion=");
		sb.append(securityquestion);
		sb.append(", answer=");
		sb.append(answer);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Registration toEntityModel() {
		RegistrationImpl registrationImpl = new RegistrationImpl();

		if (uuid == null) {
			registrationImpl.setUuid("");
		}
		else {
			registrationImpl.setUuid(uuid);
		}

		registrationImpl.setUserID(userID);
		registrationImpl.setGroupId(groupId);

		if (firstname == null) {
			registrationImpl.setFirstname("");
		}
		else {
			registrationImpl.setFirstname(firstname);
		}

		if (lastname == null) {
			registrationImpl.setLastname("");
		}
		else {
			registrationImpl.setLastname(lastname);
		}

		if (email == null) {
			registrationImpl.setEmail("");
		}
		else {
			registrationImpl.setEmail(email);
		}

		if (username == null) {
			registrationImpl.setUsername("");
		}
		else {
			registrationImpl.setUsername(username);
		}

		if (password == null) {
			registrationImpl.setPassword("");
		}
		else {
			registrationImpl.setPassword(password);
		}

		if (gender == null) {
			registrationImpl.setGender("");
		}
		else {
			registrationImpl.setGender(gender);
		}

		if (dob == Long.MIN_VALUE) {
			registrationImpl.setDob(null);
		}
		else {
			registrationImpl.setDob(new Date(dob));
		}

		if (homephone == null) {
			registrationImpl.setHomephone("");
		}
		else {
			registrationImpl.setHomephone(homephone);
		}

		if (mobilephone == null) {
			registrationImpl.setMobilephone("");
		}
		else {
			registrationImpl.setMobilephone(mobilephone);
		}

		if (address1 == null) {
			registrationImpl.setAddress1("");
		}
		else {
			registrationImpl.setAddress1(address1);
		}

		if (address2 == null) {
			registrationImpl.setAddress2("");
		}
		else {
			registrationImpl.setAddress2(address2);
		}

		if (city == null) {
			registrationImpl.setCity("");
		}
		else {
			registrationImpl.setCity(city);
		}

		if (state == null) {
			registrationImpl.setState("");
		}
		else {
			registrationImpl.setState(state);
		}

		if (zipcode == null) {
			registrationImpl.setZipcode("");
		}
		else {
			registrationImpl.setZipcode(zipcode);
		}

		if (securityquestion == null) {
			registrationImpl.setSecurityquestion("");
		}
		else {
			registrationImpl.setSecurityquestion(securityquestion);
		}

		if (answer == null) {
			registrationImpl.setAnswer("");
		}
		else {
			registrationImpl.setAnswer(answer);
		}

		registrationImpl.resetOriginalValues();

		return registrationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		userID = objectInput.readLong();

		groupId = objectInput.readLong();
		firstname = objectInput.readUTF();
		lastname = objectInput.readUTF();
		email = objectInput.readUTF();
		username = objectInput.readUTF();
		password = objectInput.readUTF();
		gender = objectInput.readUTF();
		dob = objectInput.readLong();
		homephone = objectInput.readUTF();
		mobilephone = objectInput.readUTF();
		address1 = objectInput.readUTF();
		address2 = objectInput.readUTF();
		city = objectInput.readUTF();
		state = objectInput.readUTF();
		zipcode = objectInput.readUTF();
		securityquestion = objectInput.readUTF();
		answer = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(userID);

		objectOutput.writeLong(groupId);

		if (firstname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstname);
		}

		if (lastname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastname);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (username == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(username);
		}

		if (password == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(password);
		}

		if (gender == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gender);
		}

		objectOutput.writeLong(dob);

		if (homephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(homephone);
		}

		if (mobilephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobilephone);
		}

		if (address1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address1);
		}

		if (address2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address2);
		}

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (state == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (zipcode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zipcode);
		}

		if (securityquestion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityquestion);
		}

		if (answer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(answer);
		}
	}

	public String uuid;
	public long userID;
	public long groupId;
	public String firstname;
	public String lastname;
	public String email;
	public String username;
	public String password;
	public String gender;
	public long dob;
	public String homephone;
	public String mobilephone;
	public String address1;
	public String address2;
	public String city;
	public String state;
	public String zipcode;
	public String securityquestion;
	public String answer;

}