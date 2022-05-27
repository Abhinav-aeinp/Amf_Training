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

package com.liferay.training.amf.registration.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.training.amf.registration.service.http.RegistrationServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RegistrationSoap implements Serializable {

	public static RegistrationSoap toSoapModel(Registration model) {
		RegistrationSoap soapModel = new RegistrationSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setUserID(model.getUserID());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setFirstname(model.getFirstname());
		soapModel.setLastname(model.getLastname());
		soapModel.setEmail(model.getEmail());
		soapModel.setUsername(model.getUsername());
		soapModel.setPassword(model.getPassword());
		soapModel.setGender(model.getGender());
		soapModel.setDob(model.getDob());
		soapModel.setHomephone(model.getHomephone());
		soapModel.setMobilephone(model.getMobilephone());
		soapModel.setAddress1(model.getAddress1());
		soapModel.setAddress2(model.getAddress2());
		soapModel.setCity(model.getCity());
		soapModel.setState(model.getState());
		soapModel.setZipcode(model.getZipcode());
		soapModel.setSecurityquestion(model.getSecurityquestion());
		soapModel.setAnswer(model.getAnswer());

		return soapModel;
	}

	public static RegistrationSoap[] toSoapModels(Registration[] models) {
		RegistrationSoap[] soapModels = new RegistrationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RegistrationSoap[][] toSoapModels(Registration[][] models) {
		RegistrationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RegistrationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RegistrationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RegistrationSoap[] toSoapModels(List<Registration> models) {
		List<RegistrationSoap> soapModels = new ArrayList<RegistrationSoap>(
			models.size());

		for (Registration model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RegistrationSoap[soapModels.size()]);
	}

	public RegistrationSoap() {
	}

	public long getPrimaryKey() {
		return _userID;
	}

	public void setPrimaryKey(long pk) {
		setUserID(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getUserID() {
		return _userID;
	}

	public void setUserID(long userID) {
		_userID = userID;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public String getFirstname() {
		return _firstname;
	}

	public void setFirstname(String firstname) {
		_firstname = firstname;
	}

	public String getLastname() {
		return _lastname;
	}

	public void setLastname(String lastname) {
		_lastname = lastname;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getUsername() {
		return _username;
	}

	public void setUsername(String username) {
		_username = username;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	public Date getDob() {
		return _dob;
	}

	public void setDob(Date dob) {
		_dob = dob;
	}

	public String getHomephone() {
		return _homephone;
	}

	public void setHomephone(String homephone) {
		_homephone = homephone;
	}

	public String getMobilephone() {
		return _mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		_mobilephone = mobilephone;
	}

	public String getAddress1() {
		return _address1;
	}

	public void setAddress1(String address1) {
		_address1 = address1;
	}

	public String getAddress2() {
		return _address2;
	}

	public void setAddress2(String address2) {
		_address2 = address2;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	public String getZipcode() {
		return _zipcode;
	}

	public void setZipcode(String zipcode) {
		_zipcode = zipcode;
	}

	public String getSecurityquestion() {
		return _securityquestion;
	}

	public void setSecurityquestion(String securityquestion) {
		_securityquestion = securityquestion;
	}

	public String getAnswer() {
		return _answer;
	}

	public void setAnswer(String answer) {
		_answer = answer;
	}

	private String _uuid;
	private long _userID;
	private long _groupId;
	private String _firstname;
	private String _lastname;
	private String _email;
	private String _username;
	private String _password;
	private String _gender;
	private Date _dob;
	private String _homephone;
	private String _mobilephone;
	private String _address1;
	private String _address2;
	private String _city;
	private String _state;
	private String _zipcode;
	private String _securityquestion;
	private String _answer;

}