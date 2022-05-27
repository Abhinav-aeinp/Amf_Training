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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Registration}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Registration
 * @generated
 */
public class RegistrationWrapper
	extends BaseModelWrapper<Registration>
	implements ModelWrapper<Registration>, Registration {

	public RegistrationWrapper(Registration registration) {
		super(registration);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("userID", getUserID());
		attributes.put("groupId", getGroupId());
		attributes.put("firstname", getFirstname());
		attributes.put("lastname", getLastname());
		attributes.put("email", getEmail());
		attributes.put("username", getUsername());
		attributes.put("password", getPassword());
		attributes.put("gender", getGender());
		attributes.put("dob", getDob());
		attributes.put("homephone", getHomephone());
		attributes.put("mobilephone", getMobilephone());
		attributes.put("address1", getAddress1());
		attributes.put("address2", getAddress2());
		attributes.put("city", getCity());
		attributes.put("state", getState());
		attributes.put("zipcode", getZipcode());
		attributes.put("securityquestion", getSecurityquestion());
		attributes.put("answer", getAnswer());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long userID = (Long)attributes.get("userID");

		if (userID != null) {
			setUserID(userID);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String firstname = (String)attributes.get("firstname");

		if (firstname != null) {
			setFirstname(firstname);
		}

		String lastname = (String)attributes.get("lastname");

		if (lastname != null) {
			setLastname(lastname);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String username = (String)attributes.get("username");

		if (username != null) {
			setUsername(username);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		Date dob = (Date)attributes.get("dob");

		if (dob != null) {
			setDob(dob);
		}

		String homephone = (String)attributes.get("homephone");

		if (homephone != null) {
			setHomephone(homephone);
		}

		String mobilephone = (String)attributes.get("mobilephone");

		if (mobilephone != null) {
			setMobilephone(mobilephone);
		}

		String address1 = (String)attributes.get("address1");

		if (address1 != null) {
			setAddress1(address1);
		}

		String address2 = (String)attributes.get("address2");

		if (address2 != null) {
			setAddress2(address2);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String zipcode = (String)attributes.get("zipcode");

		if (zipcode != null) {
			setZipcode(zipcode);
		}

		String securityquestion = (String)attributes.get("securityquestion");

		if (securityquestion != null) {
			setSecurityquestion(securityquestion);
		}

		String answer = (String)attributes.get("answer");

		if (answer != null) {
			setAnswer(answer);
		}
	}

	/**
	 * Returns the address1 of this registration.
	 *
	 * @return the address1 of this registration
	 */
	@Override
	public String getAddress1() {
		return model.getAddress1();
	}

	/**
	 * Returns the address2 of this registration.
	 *
	 * @return the address2 of this registration
	 */
	@Override
	public String getAddress2() {
		return model.getAddress2();
	}

	/**
	 * Returns the answer of this registration.
	 *
	 * @return the answer of this registration
	 */
	@Override
	public String getAnswer() {
		return model.getAnswer();
	}

	/**
	 * Returns the city of this registration.
	 *
	 * @return the city of this registration
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the dob of this registration.
	 *
	 * @return the dob of this registration
	 */
	@Override
	public Date getDob() {
		return model.getDob();
	}

	/**
	 * Returns the email of this registration.
	 *
	 * @return the email of this registration
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the firstname of this registration.
	 *
	 * @return the firstname of this registration
	 */
	@Override
	public String getFirstname() {
		return model.getFirstname();
	}

	/**
	 * Returns the gender of this registration.
	 *
	 * @return the gender of this registration
	 */
	@Override
	public String getGender() {
		return model.getGender();
	}

	/**
	 * Returns the group ID of this registration.
	 *
	 * @return the group ID of this registration
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the homephone of this registration.
	 *
	 * @return the homephone of this registration
	 */
	@Override
	public String getHomephone() {
		return model.getHomephone();
	}

	/**
	 * Returns the lastname of this registration.
	 *
	 * @return the lastname of this registration
	 */
	@Override
	public String getLastname() {
		return model.getLastname();
	}

	/**
	 * Returns the mobilephone of this registration.
	 *
	 * @return the mobilephone of this registration
	 */
	@Override
	public String getMobilephone() {
		return model.getMobilephone();
	}

	/**
	 * Returns the password of this registration.
	 *
	 * @return the password of this registration
	 */
	@Override
	public String getPassword() {
		return model.getPassword();
	}

	/**
	 * Returns the primary key of this registration.
	 *
	 * @return the primary key of this registration
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the securityquestion of this registration.
	 *
	 * @return the securityquestion of this registration
	 */
	@Override
	public String getSecurityquestion() {
		return model.getSecurityquestion();
	}

	/**
	 * Returns the state of this registration.
	 *
	 * @return the state of this registration
	 */
	@Override
	public String getState() {
		return model.getState();
	}

	/**
	 * Returns the user ID of this registration.
	 *
	 * @return the user ID of this registration
	 */
	@Override
	public long getUserID() {
		return model.getUserID();
	}

	/**
	 * Returns the username of this registration.
	 *
	 * @return the username of this registration
	 */
	@Override
	public String getUsername() {
		return model.getUsername();
	}

	/**
	 * Returns the uuid of this registration.
	 *
	 * @return the uuid of this registration
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the zipcode of this registration.
	 *
	 * @return the zipcode of this registration
	 */
	@Override
	public String getZipcode() {
		return model.getZipcode();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the address1 of this registration.
	 *
	 * @param address1 the address1 of this registration
	 */
	@Override
	public void setAddress1(String address1) {
		model.setAddress1(address1);
	}

	/**
	 * Sets the address2 of this registration.
	 *
	 * @param address2 the address2 of this registration
	 */
	@Override
	public void setAddress2(String address2) {
		model.setAddress2(address2);
	}

	/**
	 * Sets the answer of this registration.
	 *
	 * @param answer the answer of this registration
	 */
	@Override
	public void setAnswer(String answer) {
		model.setAnswer(answer);
	}

	/**
	 * Sets the city of this registration.
	 *
	 * @param city the city of this registration
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the dob of this registration.
	 *
	 * @param dob the dob of this registration
	 */
	@Override
	public void setDob(Date dob) {
		model.setDob(dob);
	}

	/**
	 * Sets the email of this registration.
	 *
	 * @param email the email of this registration
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the firstname of this registration.
	 *
	 * @param firstname the firstname of this registration
	 */
	@Override
	public void setFirstname(String firstname) {
		model.setFirstname(firstname);
	}

	/**
	 * Sets the gender of this registration.
	 *
	 * @param gender the gender of this registration
	 */
	@Override
	public void setGender(String gender) {
		model.setGender(gender);
	}

	/**
	 * Sets the group ID of this registration.
	 *
	 * @param groupId the group ID of this registration
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the homephone of this registration.
	 *
	 * @param homephone the homephone of this registration
	 */
	@Override
	public void setHomephone(String homephone) {
		model.setHomephone(homephone);
	}

	/**
	 * Sets the lastname of this registration.
	 *
	 * @param lastname the lastname of this registration
	 */
	@Override
	public void setLastname(String lastname) {
		model.setLastname(lastname);
	}

	/**
	 * Sets the mobilephone of this registration.
	 *
	 * @param mobilephone the mobilephone of this registration
	 */
	@Override
	public void setMobilephone(String mobilephone) {
		model.setMobilephone(mobilephone);
	}

	/**
	 * Sets the password of this registration.
	 *
	 * @param password the password of this registration
	 */
	@Override
	public void setPassword(String password) {
		model.setPassword(password);
	}

	/**
	 * Sets the primary key of this registration.
	 *
	 * @param primaryKey the primary key of this registration
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the securityquestion of this registration.
	 *
	 * @param securityquestion the securityquestion of this registration
	 */
	@Override
	public void setSecurityquestion(String securityquestion) {
		model.setSecurityquestion(securityquestion);
	}

	/**
	 * Sets the state of this registration.
	 *
	 * @param state the state of this registration
	 */
	@Override
	public void setState(String state) {
		model.setState(state);
	}

	/**
	 * Sets the user ID of this registration.
	 *
	 * @param userID the user ID of this registration
	 */
	@Override
	public void setUserID(long userID) {
		model.setUserID(userID);
	}

	/**
	 * Sets the username of this registration.
	 *
	 * @param username the username of this registration
	 */
	@Override
	public void setUsername(String username) {
		model.setUsername(username);
	}

	/**
	 * Sets the uuid of this registration.
	 *
	 * @param uuid the uuid of this registration
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the zipcode of this registration.
	 *
	 * @param zipcode the zipcode of this registration
	 */
	@Override
	public void setZipcode(String zipcode) {
		model.setZipcode(zipcode);
	}

	@Override
	protected RegistrationWrapper wrap(Registration registration) {
		return new RegistrationWrapper(registration);
	}

}