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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.training.amf.admin.monitor.service.http.StoreEventsServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class StoreEventsSoap implements Serializable {

	public static StoreEventsSoap toSoapModel(StoreEvents model) {
		StoreEventsSoap soapModel = new StoreEventsSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setEventId(model.getEventId());
		soapModel.setLogged(model.getLogged());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setRequestIp(model.getRequestIp());
		soapModel.setEventType(model.getEventType());

		return soapModel;
	}

	public static StoreEventsSoap[] toSoapModels(StoreEvents[] models) {
		StoreEventsSoap[] soapModels = new StoreEventsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StoreEventsSoap[][] toSoapModels(StoreEvents[][] models) {
		StoreEventsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StoreEventsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StoreEventsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StoreEventsSoap[] toSoapModels(List<StoreEvents> models) {
		List<StoreEventsSoap> soapModels = new ArrayList<StoreEventsSoap>(
			models.size());

		for (StoreEvents model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StoreEventsSoap[soapModels.size()]);
	}

	public StoreEventsSoap() {
	}

	public long getPrimaryKey() {
		return _eventId;
	}

	public void setPrimaryKey(long pk) {
		setEventId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getEventId() {
		return _eventId;
	}

	public void setEventId(long eventId) {
		_eventId = eventId;
	}

	public Date getLogged() {
		return _logged;
	}

	public void setLogged(Date logged) {
		_logged = logged;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getRequestIp() {
		return _requestIp;
	}

	public void setRequestIp(String requestIp) {
		_requestIp = requestIp;
	}

	public String getEventType() {
		return _eventType;
	}

	public void setEventType(String eventType) {
		_eventType = eventType;
	}

	private String _uuid;
	private long _eventId;
	private Date _logged;
	private long _userId;
	private String _userName;
	private String _requestIp;
	private String _eventType;

}