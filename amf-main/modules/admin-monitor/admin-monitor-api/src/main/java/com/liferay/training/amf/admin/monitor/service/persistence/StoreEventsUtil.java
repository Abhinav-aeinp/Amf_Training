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

package com.liferay.training.amf.admin.monitor.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.amf.admin.monitor.model.StoreEvents;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the store events service. This utility wraps <code>com.liferay.training.amf.admin.monitor.service.persistence.impl.StoreEventsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StoreEventsPersistence
 * @generated
 */
public class StoreEventsUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(StoreEvents storeEvents) {
		getPersistence().clearCache(storeEvents);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, StoreEvents> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<StoreEvents> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<StoreEvents> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<StoreEvents> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<StoreEvents> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static StoreEvents update(StoreEvents storeEvents) {
		return getPersistence().update(storeEvents);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static StoreEvents update(
		StoreEvents storeEvents, ServiceContext serviceContext) {

		return getPersistence().update(storeEvents, serviceContext);
	}

	/**
	 * Returns all the store eventses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching store eventses
	 */
	public static List<StoreEvents> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the store eventses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreEventsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of store eventses
	 * @param end the upper bound of the range of store eventses (not inclusive)
	 * @return the range of matching store eventses
	 */
	public static List<StoreEvents> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the store eventses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreEventsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of store eventses
	 * @param end the upper bound of the range of store eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching store eventses
	 */
	public static List<StoreEvents> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<StoreEvents> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the store eventses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreEventsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of store eventses
	 * @param end the upper bound of the range of store eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching store eventses
	 */
	public static List<StoreEvents> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<StoreEvents> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first store events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	public static StoreEvents findByUuid_First(
			String uuid, OrderByComparator<StoreEvents> orderByComparator)
		throws com.liferay.training.amf.admin.monitor.exception.
			NoSuchStoreEventsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first store events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events, or <code>null</code> if a matching store events could not be found
	 */
	public static StoreEvents fetchByUuid_First(
		String uuid, OrderByComparator<StoreEvents> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last store events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	public static StoreEvents findByUuid_Last(
			String uuid, OrderByComparator<StoreEvents> orderByComparator)
		throws com.liferay.training.amf.admin.monitor.exception.
			NoSuchStoreEventsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last store events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events, or <code>null</code> if a matching store events could not be found
	 */
	public static StoreEvents fetchByUuid_Last(
		String uuid, OrderByComparator<StoreEvents> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the store eventses before and after the current store events in the ordered set where uuid = &#63;.
	 *
	 * @param eventId the primary key of the current store events
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next store events
	 * @throws NoSuchStoreEventsException if a store events with the primary key could not be found
	 */
	public static StoreEvents[] findByUuid_PrevAndNext(
			long eventId, String uuid,
			OrderByComparator<StoreEvents> orderByComparator)
		throws com.liferay.training.amf.admin.monitor.exception.
			NoSuchStoreEventsException {

		return getPersistence().findByUuid_PrevAndNext(
			eventId, uuid, orderByComparator);
	}

	/**
	 * Removes all the store eventses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of store eventses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching store eventses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the store eventses where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @return the matching store eventses
	 */
	public static List<StoreEvents> findByEventType(String eventType) {
		return getPersistence().findByEventType(eventType);
	}

	/**
	 * Returns a range of all the store eventses where eventType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreEventsModelImpl</code>.
	 * </p>
	 *
	 * @param eventType the event type
	 * @param start the lower bound of the range of store eventses
	 * @param end the upper bound of the range of store eventses (not inclusive)
	 * @return the range of matching store eventses
	 */
	public static List<StoreEvents> findByEventType(
		String eventType, int start, int end) {

		return getPersistence().findByEventType(eventType, start, end);
	}

	/**
	 * Returns an ordered range of all the store eventses where eventType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreEventsModelImpl</code>.
	 * </p>
	 *
	 * @param eventType the event type
	 * @param start the lower bound of the range of store eventses
	 * @param end the upper bound of the range of store eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching store eventses
	 */
	public static List<StoreEvents> findByEventType(
		String eventType, int start, int end,
		OrderByComparator<StoreEvents> orderByComparator) {

		return getPersistence().findByEventType(
			eventType, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the store eventses where eventType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreEventsModelImpl</code>.
	 * </p>
	 *
	 * @param eventType the event type
	 * @param start the lower bound of the range of store eventses
	 * @param end the upper bound of the range of store eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching store eventses
	 */
	public static List<StoreEvents> findByEventType(
		String eventType, int start, int end,
		OrderByComparator<StoreEvents> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByEventType(
			eventType, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first store events in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	public static StoreEvents findByEventType_First(
			String eventType, OrderByComparator<StoreEvents> orderByComparator)
		throws com.liferay.training.amf.admin.monitor.exception.
			NoSuchStoreEventsException {

		return getPersistence().findByEventType_First(
			eventType, orderByComparator);
	}

	/**
	 * Returns the first store events in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events, or <code>null</code> if a matching store events could not be found
	 */
	public static StoreEvents fetchByEventType_First(
		String eventType, OrderByComparator<StoreEvents> orderByComparator) {

		return getPersistence().fetchByEventType_First(
			eventType, orderByComparator);
	}

	/**
	 * Returns the last store events in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	public static StoreEvents findByEventType_Last(
			String eventType, OrderByComparator<StoreEvents> orderByComparator)
		throws com.liferay.training.amf.admin.monitor.exception.
			NoSuchStoreEventsException {

		return getPersistence().findByEventType_Last(
			eventType, orderByComparator);
	}

	/**
	 * Returns the last store events in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events, or <code>null</code> if a matching store events could not be found
	 */
	public static StoreEvents fetchByEventType_Last(
		String eventType, OrderByComparator<StoreEvents> orderByComparator) {

		return getPersistence().fetchByEventType_Last(
			eventType, orderByComparator);
	}

	/**
	 * Returns the store eventses before and after the current store events in the ordered set where eventType = &#63;.
	 *
	 * @param eventId the primary key of the current store events
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next store events
	 * @throws NoSuchStoreEventsException if a store events with the primary key could not be found
	 */
	public static StoreEvents[] findByEventType_PrevAndNext(
			long eventId, String eventType,
			OrderByComparator<StoreEvents> orderByComparator)
		throws com.liferay.training.amf.admin.monitor.exception.
			NoSuchStoreEventsException {

		return getPersistence().findByEventType_PrevAndNext(
			eventId, eventType, orderByComparator);
	}

	/**
	 * Removes all the store eventses where eventType = &#63; from the database.
	 *
	 * @param eventType the event type
	 */
	public static void removeByEventType(String eventType) {
		getPersistence().removeByEventType(eventType);
	}

	/**
	 * Returns the number of store eventses where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @return the number of matching store eventses
	 */
	public static int countByEventType(String eventType) {
		return getPersistence().countByEventType(eventType);
	}

	/**
	 * Returns all the store eventses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching store eventses
	 */
	public static List<StoreEvents> findByUser(long userId) {
		return getPersistence().findByUser(userId);
	}

	/**
	 * Returns a range of all the store eventses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreEventsModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of store eventses
	 * @param end the upper bound of the range of store eventses (not inclusive)
	 * @return the range of matching store eventses
	 */
	public static List<StoreEvents> findByUser(
		long userId, int start, int end) {

		return getPersistence().findByUser(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the store eventses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreEventsModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of store eventses
	 * @param end the upper bound of the range of store eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching store eventses
	 */
	public static List<StoreEvents> findByUser(
		long userId, int start, int end,
		OrderByComparator<StoreEvents> orderByComparator) {

		return getPersistence().findByUser(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the store eventses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreEventsModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of store eventses
	 * @param end the upper bound of the range of store eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching store eventses
	 */
	public static List<StoreEvents> findByUser(
		long userId, int start, int end,
		OrderByComparator<StoreEvents> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUser(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first store events in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	public static StoreEvents findByUser_First(
			long userId, OrderByComparator<StoreEvents> orderByComparator)
		throws com.liferay.training.amf.admin.monitor.exception.
			NoSuchStoreEventsException {

		return getPersistence().findByUser_First(userId, orderByComparator);
	}

	/**
	 * Returns the first store events in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events, or <code>null</code> if a matching store events could not be found
	 */
	public static StoreEvents fetchByUser_First(
		long userId, OrderByComparator<StoreEvents> orderByComparator) {

		return getPersistence().fetchByUser_First(userId, orderByComparator);
	}

	/**
	 * Returns the last store events in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	public static StoreEvents findByUser_Last(
			long userId, OrderByComparator<StoreEvents> orderByComparator)
		throws com.liferay.training.amf.admin.monitor.exception.
			NoSuchStoreEventsException {

		return getPersistence().findByUser_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last store events in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events, or <code>null</code> if a matching store events could not be found
	 */
	public static StoreEvents fetchByUser_Last(
		long userId, OrderByComparator<StoreEvents> orderByComparator) {

		return getPersistence().fetchByUser_Last(userId, orderByComparator);
	}

	/**
	 * Returns the store eventses before and after the current store events in the ordered set where userId = &#63;.
	 *
	 * @param eventId the primary key of the current store events
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next store events
	 * @throws NoSuchStoreEventsException if a store events with the primary key could not be found
	 */
	public static StoreEvents[] findByUser_PrevAndNext(
			long eventId, long userId,
			OrderByComparator<StoreEvents> orderByComparator)
		throws com.liferay.training.amf.admin.monitor.exception.
			NoSuchStoreEventsException {

		return getPersistence().findByUser_PrevAndNext(
			eventId, userId, orderByComparator);
	}

	/**
	 * Removes all the store eventses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUser(long userId) {
		getPersistence().removeByUser(userId);
	}

	/**
	 * Returns the number of store eventses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching store eventses
	 */
	public static int countByUser(long userId) {
		return getPersistence().countByUser(userId);
	}

	/**
	 * Returns all the store eventses where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @return the matching store eventses
	 */
	public static List<StoreEvents> findByUserAndEventType(
		String eventType, long userId) {

		return getPersistence().findByUserAndEventType(eventType, userId);
	}

	/**
	 * Returns a range of all the store eventses where eventType = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreEventsModelImpl</code>.
	 * </p>
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @param start the lower bound of the range of store eventses
	 * @param end the upper bound of the range of store eventses (not inclusive)
	 * @return the range of matching store eventses
	 */
	public static List<StoreEvents> findByUserAndEventType(
		String eventType, long userId, int start, int end) {

		return getPersistence().findByUserAndEventType(
			eventType, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the store eventses where eventType = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreEventsModelImpl</code>.
	 * </p>
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @param start the lower bound of the range of store eventses
	 * @param end the upper bound of the range of store eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching store eventses
	 */
	public static List<StoreEvents> findByUserAndEventType(
		String eventType, long userId, int start, int end,
		OrderByComparator<StoreEvents> orderByComparator) {

		return getPersistence().findByUserAndEventType(
			eventType, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the store eventses where eventType = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreEventsModelImpl</code>.
	 * </p>
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @param start the lower bound of the range of store eventses
	 * @param end the upper bound of the range of store eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching store eventses
	 */
	public static List<StoreEvents> findByUserAndEventType(
		String eventType, long userId, int start, int end,
		OrderByComparator<StoreEvents> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUserAndEventType(
			eventType, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first store events in the ordered set where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	public static StoreEvents findByUserAndEventType_First(
			String eventType, long userId,
			OrderByComparator<StoreEvents> orderByComparator)
		throws com.liferay.training.amf.admin.monitor.exception.
			NoSuchStoreEventsException {

		return getPersistence().findByUserAndEventType_First(
			eventType, userId, orderByComparator);
	}

	/**
	 * Returns the first store events in the ordered set where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events, or <code>null</code> if a matching store events could not be found
	 */
	public static StoreEvents fetchByUserAndEventType_First(
		String eventType, long userId,
		OrderByComparator<StoreEvents> orderByComparator) {

		return getPersistence().fetchByUserAndEventType_First(
			eventType, userId, orderByComparator);
	}

	/**
	 * Returns the last store events in the ordered set where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	public static StoreEvents findByUserAndEventType_Last(
			String eventType, long userId,
			OrderByComparator<StoreEvents> orderByComparator)
		throws com.liferay.training.amf.admin.monitor.exception.
			NoSuchStoreEventsException {

		return getPersistence().findByUserAndEventType_Last(
			eventType, userId, orderByComparator);
	}

	/**
	 * Returns the last store events in the ordered set where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events, or <code>null</code> if a matching store events could not be found
	 */
	public static StoreEvents fetchByUserAndEventType_Last(
		String eventType, long userId,
		OrderByComparator<StoreEvents> orderByComparator) {

		return getPersistence().fetchByUserAndEventType_Last(
			eventType, userId, orderByComparator);
	}

	/**
	 * Returns the store eventses before and after the current store events in the ordered set where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventId the primary key of the current store events
	 * @param eventType the event type
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next store events
	 * @throws NoSuchStoreEventsException if a store events with the primary key could not be found
	 */
	public static StoreEvents[] findByUserAndEventType_PrevAndNext(
			long eventId, String eventType, long userId,
			OrderByComparator<StoreEvents> orderByComparator)
		throws com.liferay.training.amf.admin.monitor.exception.
			NoSuchStoreEventsException {

		return getPersistence().findByUserAndEventType_PrevAndNext(
			eventId, eventType, userId, orderByComparator);
	}

	/**
	 * Removes all the store eventses where eventType = &#63; and userId = &#63; from the database.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 */
	public static void removeByUserAndEventType(String eventType, long userId) {
		getPersistence().removeByUserAndEventType(eventType, userId);
	}

	/**
	 * Returns the number of store eventses where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @return the number of matching store eventses
	 */
	public static int countByUserAndEventType(String eventType, long userId) {
		return getPersistence().countByUserAndEventType(eventType, userId);
	}

	/**
	 * Caches the store events in the entity cache if it is enabled.
	 *
	 * @param storeEvents the store events
	 */
	public static void cacheResult(StoreEvents storeEvents) {
		getPersistence().cacheResult(storeEvents);
	}

	/**
	 * Caches the store eventses in the entity cache if it is enabled.
	 *
	 * @param storeEventses the store eventses
	 */
	public static void cacheResult(List<StoreEvents> storeEventses) {
		getPersistence().cacheResult(storeEventses);
	}

	/**
	 * Creates a new store events with the primary key. Does not add the store events to the database.
	 *
	 * @param eventId the primary key for the new store events
	 * @return the new store events
	 */
	public static StoreEvents create(long eventId) {
		return getPersistence().create(eventId);
	}

	/**
	 * Removes the store events with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param eventId the primary key of the store events
	 * @return the store events that was removed
	 * @throws NoSuchStoreEventsException if a store events with the primary key could not be found
	 */
	public static StoreEvents remove(long eventId)
		throws com.liferay.training.amf.admin.monitor.exception.
			NoSuchStoreEventsException {

		return getPersistence().remove(eventId);
	}

	public static StoreEvents updateImpl(StoreEvents storeEvents) {
		return getPersistence().updateImpl(storeEvents);
	}

	/**
	 * Returns the store events with the primary key or throws a <code>NoSuchStoreEventsException</code> if it could not be found.
	 *
	 * @param eventId the primary key of the store events
	 * @return the store events
	 * @throws NoSuchStoreEventsException if a store events with the primary key could not be found
	 */
	public static StoreEvents findByPrimaryKey(long eventId)
		throws com.liferay.training.amf.admin.monitor.exception.
			NoSuchStoreEventsException {

		return getPersistence().findByPrimaryKey(eventId);
	}

	/**
	 * Returns the store events with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param eventId the primary key of the store events
	 * @return the store events, or <code>null</code> if a store events with the primary key could not be found
	 */
	public static StoreEvents fetchByPrimaryKey(long eventId) {
		return getPersistence().fetchByPrimaryKey(eventId);
	}

	/**
	 * Returns all the store eventses.
	 *
	 * @return the store eventses
	 */
	public static List<StoreEvents> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the store eventses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreEventsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of store eventses
	 * @param end the upper bound of the range of store eventses (not inclusive)
	 * @return the range of store eventses
	 */
	public static List<StoreEvents> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the store eventses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreEventsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of store eventses
	 * @param end the upper bound of the range of store eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of store eventses
	 */
	public static List<StoreEvents> findAll(
		int start, int end, OrderByComparator<StoreEvents> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the store eventses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreEventsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of store eventses
	 * @param end the upper bound of the range of store eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of store eventses
	 */
	public static List<StoreEvents> findAll(
		int start, int end, OrderByComparator<StoreEvents> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the store eventses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of store eventses.
	 *
	 * @return the number of store eventses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static StoreEventsPersistence getPersistence() {
		return _persistence;
	}

	private static volatile StoreEventsPersistence _persistence;

}