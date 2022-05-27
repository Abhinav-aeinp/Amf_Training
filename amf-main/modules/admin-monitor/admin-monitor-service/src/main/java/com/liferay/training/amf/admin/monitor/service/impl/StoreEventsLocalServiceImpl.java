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

package com.liferay.training.amf.admin.monitor.service.impl;

import com.liferay.portal.kernel.model.User;
import com.liferay.training.amf.admin.monitor.model.StoreEvents;
import com.liferay.training.amf.admin.monitor.service.base.StoreEventsLocalServiceBaseImpl;
import com.liferay.training.amf.admin.monitor.service.persistence.StoreEventsUtil;

import java.util.List;

/**
 * The implementation of the store events local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.training.admin.monitor.service.StoreEventsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StoreEventsLocalServiceBaseImpl
 * @see com.liferay.training.admin.monitor.service.StoreEventsLocalServiceUtil
 */
public class StoreEventsLocalServiceImpl extends StoreEventsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.training.admin.monitor.service.StoreEventsLocalServiceUtil} to access the store events local service.
	 */
	
	public static final String ALL = "All";
	
	public List<StoreEvents> getEvents(String eventType, int start, int end){
		if (eventType.equals(ALL)) {
			return StoreEventsUtil.findAll(start, end); 
		}else {
			return StoreEventsUtil.findByEventType(eventType, start, end);
		}
	}
	
	public List<StoreEvents> getEventsByUser(String eventType, long userId, int start, int end){
		if (eventType.equals(ALL)) {
			return StoreEventsUtil.findByUser(userId, start, end); 
		}else {
			return StoreEventsUtil.findByUserAndEventType(eventType, userId, start, end);
		}
	}
	
	public int getEventCount(String eventType){
		if (eventType.equals(ALL)) {
			return StoreEventsUtil.countAll();
		}else {
			return StoreEventsUtil.countByEventType(eventType);
		}
	}
	
	public int getUserEventCount(String eventType, long userId) {
		if (eventType.equals(ALL)) {
			return StoreEventsUtil.countByUser(userId);
		}else {
			return StoreEventsUtil.countByUserAndEventType(eventType, userId);
		}
	}
	
	public void setEventFields(User user, StoreEvents storeEvent, String eventType) {
		storeEvent.setUserName(user.getScreenName());
		storeEvent.setUserId(user.getUserId());
		if (eventType.equals("Registration")) {
			storeEvent.setRequestIp("0.0.0.0");
			storeEvent.setLogged(user.getCreateDate());
		}else {
			storeEvent.setRequestIp(user.getLoginIP());
			storeEvent.setLogged(user.getLoginDate());
		}
		storeEvent.setEventType(eventType);
		
		addStoreEvents(storeEvent);
	}
}




