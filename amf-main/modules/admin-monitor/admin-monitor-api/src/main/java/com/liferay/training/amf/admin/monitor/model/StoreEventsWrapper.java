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

package com.liferay.training.amf.admin.monitor.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link StoreEvents}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StoreEvents
 * @generated
 */
public class StoreEventsWrapper
	extends BaseModelWrapper<StoreEvents>
	implements ModelWrapper<StoreEvents>, StoreEvents {

	public StoreEventsWrapper(StoreEvents storeEvents) {
		super(storeEvents);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("eventId", getEventId());
		attributes.put("logged", getLogged());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("requestIp", getRequestIp());
		attributes.put("eventType", getEventType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long eventId = (Long)attributes.get("eventId");

		if (eventId != null) {
			setEventId(eventId);
		}

		Date logged = (Date)attributes.get("logged");

		if (logged != null) {
			setLogged(logged);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String requestIp = (String)attributes.get("requestIp");

		if (requestIp != null) {
			setRequestIp(requestIp);
		}

		String eventType = (String)attributes.get("eventType");

		if (eventType != null) {
			setEventType(eventType);
		}
	}

	/**
	 * Returns the event ID of this store events.
	 *
	 * @return the event ID of this store events
	 */
	@Override
	public long getEventId() {
		return model.getEventId();
	}

	/**
	 * Returns the event type of this store events.
	 *
	 * @return the event type of this store events
	 */
	@Override
	public String getEventType() {
		return model.getEventType();
	}

	/**
	 * Returns the logged of this store events.
	 *
	 * @return the logged of this store events
	 */
	@Override
	public Date getLogged() {
		return model.getLogged();
	}

	/**
	 * Returns the primary key of this store events.
	 *
	 * @return the primary key of this store events
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the request ip of this store events.
	 *
	 * @return the request ip of this store events
	 */
	@Override
	public String getRequestIp() {
		return model.getRequestIp();
	}

	/**
	 * Returns the user ID of this store events.
	 *
	 * @return the user ID of this store events
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this store events.
	 *
	 * @return the user name of this store events
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this store events.
	 *
	 * @return the user uuid of this store events
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this store events.
	 *
	 * @return the uuid of this store events
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
	 * Sets the event ID of this store events.
	 *
	 * @param eventId the event ID of this store events
	 */
	@Override
	public void setEventId(long eventId) {
		model.setEventId(eventId);
	}

	/**
	 * Sets the event type of this store events.
	 *
	 * @param eventType the event type of this store events
	 */
	@Override
	public void setEventType(String eventType) {
		model.setEventType(eventType);
	}

	/**
	 * Sets the logged of this store events.
	 *
	 * @param logged the logged of this store events
	 */
	@Override
	public void setLogged(Date logged) {
		model.setLogged(logged);
	}

	/**
	 * Sets the primary key of this store events.
	 *
	 * @param primaryKey the primary key of this store events
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the request ip of this store events.
	 *
	 * @param requestIp the request ip of this store events
	 */
	@Override
	public void setRequestIp(String requestIp) {
		model.setRequestIp(requestIp);
	}

	/**
	 * Sets the user ID of this store events.
	 *
	 * @param userId the user ID of this store events
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this store events.
	 *
	 * @param userName the user name of this store events
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this store events.
	 *
	 * @param userUuid the user uuid of this store events
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this store events.
	 *
	 * @param uuid the uuid of this store events
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected StoreEventsWrapper wrap(StoreEvents storeEvents) {
		return new StoreEventsWrapper(storeEvents);
	}

}