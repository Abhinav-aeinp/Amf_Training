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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.training.amf.admin.monitor.exception.NoSuchStoreEventsException;
import com.liferay.training.amf.admin.monitor.model.StoreEvents;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the store events service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StoreEventsUtil
 * @generated
 */
@ProviderType
public interface StoreEventsPersistence extends BasePersistence<StoreEvents> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StoreEventsUtil} to access the store events persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the store eventses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching store eventses
	 */
	public java.util.List<StoreEvents> findByUuid(String uuid);

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
	public java.util.List<StoreEvents> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<StoreEvents> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator);

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
	public java.util.List<StoreEvents> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first store events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	public StoreEvents findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
				orderByComparator)
		throws NoSuchStoreEventsException;

	/**
	 * Returns the first store events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events, or <code>null</code> if a matching store events could not be found
	 */
	public StoreEvents fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator);

	/**
	 * Returns the last store events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	public StoreEvents findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
				orderByComparator)
		throws NoSuchStoreEventsException;

	/**
	 * Returns the last store events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events, or <code>null</code> if a matching store events could not be found
	 */
	public StoreEvents fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator);

	/**
	 * Returns the store eventses before and after the current store events in the ordered set where uuid = &#63;.
	 *
	 * @param eventId the primary key of the current store events
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next store events
	 * @throws NoSuchStoreEventsException if a store events with the primary key could not be found
	 */
	public StoreEvents[] findByUuid_PrevAndNext(
			long eventId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
				orderByComparator)
		throws NoSuchStoreEventsException;

	/**
	 * Removes all the store eventses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of store eventses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching store eventses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the store eventses where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @return the matching store eventses
	 */
	public java.util.List<StoreEvents> findByEventType(String eventType);

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
	public java.util.List<StoreEvents> findByEventType(
		String eventType, int start, int end);

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
	public java.util.List<StoreEvents> findByEventType(
		String eventType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator);

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
	public java.util.List<StoreEvents> findByEventType(
		String eventType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first store events in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	public StoreEvents findByEventType_First(
			String eventType,
			com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
				orderByComparator)
		throws NoSuchStoreEventsException;

	/**
	 * Returns the first store events in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events, or <code>null</code> if a matching store events could not be found
	 */
	public StoreEvents fetchByEventType_First(
		String eventType,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator);

	/**
	 * Returns the last store events in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	public StoreEvents findByEventType_Last(
			String eventType,
			com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
				orderByComparator)
		throws NoSuchStoreEventsException;

	/**
	 * Returns the last store events in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events, or <code>null</code> if a matching store events could not be found
	 */
	public StoreEvents fetchByEventType_Last(
		String eventType,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator);

	/**
	 * Returns the store eventses before and after the current store events in the ordered set where eventType = &#63;.
	 *
	 * @param eventId the primary key of the current store events
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next store events
	 * @throws NoSuchStoreEventsException if a store events with the primary key could not be found
	 */
	public StoreEvents[] findByEventType_PrevAndNext(
			long eventId, String eventType,
			com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
				orderByComparator)
		throws NoSuchStoreEventsException;

	/**
	 * Removes all the store eventses where eventType = &#63; from the database.
	 *
	 * @param eventType the event type
	 */
	public void removeByEventType(String eventType);

	/**
	 * Returns the number of store eventses where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @return the number of matching store eventses
	 */
	public int countByEventType(String eventType);

	/**
	 * Returns all the store eventses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching store eventses
	 */
	public java.util.List<StoreEvents> findByUser(long userId);

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
	public java.util.List<StoreEvents> findByUser(
		long userId, int start, int end);

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
	public java.util.List<StoreEvents> findByUser(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator);

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
	public java.util.List<StoreEvents> findByUser(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first store events in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	public StoreEvents findByUser_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
				orderByComparator)
		throws NoSuchStoreEventsException;

	/**
	 * Returns the first store events in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events, or <code>null</code> if a matching store events could not be found
	 */
	public StoreEvents fetchByUser_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator);

	/**
	 * Returns the last store events in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	public StoreEvents findByUser_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
				orderByComparator)
		throws NoSuchStoreEventsException;

	/**
	 * Returns the last store events in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events, or <code>null</code> if a matching store events could not be found
	 */
	public StoreEvents fetchByUser_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator);

	/**
	 * Returns the store eventses before and after the current store events in the ordered set where userId = &#63;.
	 *
	 * @param eventId the primary key of the current store events
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next store events
	 * @throws NoSuchStoreEventsException if a store events with the primary key could not be found
	 */
	public StoreEvents[] findByUser_PrevAndNext(
			long eventId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
				orderByComparator)
		throws NoSuchStoreEventsException;

	/**
	 * Removes all the store eventses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUser(long userId);

	/**
	 * Returns the number of store eventses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching store eventses
	 */
	public int countByUser(long userId);

	/**
	 * Returns all the store eventses where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @return the matching store eventses
	 */
	public java.util.List<StoreEvents> findByUserAndEventType(
		String eventType, long userId);

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
	public java.util.List<StoreEvents> findByUserAndEventType(
		String eventType, long userId, int start, int end);

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
	public java.util.List<StoreEvents> findByUserAndEventType(
		String eventType, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator);

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
	public java.util.List<StoreEvents> findByUserAndEventType(
		String eventType, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first store events in the ordered set where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	public StoreEvents findByUserAndEventType_First(
			String eventType, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
				orderByComparator)
		throws NoSuchStoreEventsException;

	/**
	 * Returns the first store events in the ordered set where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events, or <code>null</code> if a matching store events could not be found
	 */
	public StoreEvents fetchByUserAndEventType_First(
		String eventType, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator);

	/**
	 * Returns the last store events in the ordered set where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	public StoreEvents findByUserAndEventType_Last(
			String eventType, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
				orderByComparator)
		throws NoSuchStoreEventsException;

	/**
	 * Returns the last store events in the ordered set where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events, or <code>null</code> if a matching store events could not be found
	 */
	public StoreEvents fetchByUserAndEventType_Last(
		String eventType, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator);

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
	public StoreEvents[] findByUserAndEventType_PrevAndNext(
			long eventId, String eventType, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
				orderByComparator)
		throws NoSuchStoreEventsException;

	/**
	 * Removes all the store eventses where eventType = &#63; and userId = &#63; from the database.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 */
	public void removeByUserAndEventType(String eventType, long userId);

	/**
	 * Returns the number of store eventses where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @return the number of matching store eventses
	 */
	public int countByUserAndEventType(String eventType, long userId);

	/**
	 * Caches the store events in the entity cache if it is enabled.
	 *
	 * @param storeEvents the store events
	 */
	public void cacheResult(StoreEvents storeEvents);

	/**
	 * Caches the store eventses in the entity cache if it is enabled.
	 *
	 * @param storeEventses the store eventses
	 */
	public void cacheResult(java.util.List<StoreEvents> storeEventses);

	/**
	 * Creates a new store events with the primary key. Does not add the store events to the database.
	 *
	 * @param eventId the primary key for the new store events
	 * @return the new store events
	 */
	public StoreEvents create(long eventId);

	/**
	 * Removes the store events with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param eventId the primary key of the store events
	 * @return the store events that was removed
	 * @throws NoSuchStoreEventsException if a store events with the primary key could not be found
	 */
	public StoreEvents remove(long eventId) throws NoSuchStoreEventsException;

	public StoreEvents updateImpl(StoreEvents storeEvents);

	/**
	 * Returns the store events with the primary key or throws a <code>NoSuchStoreEventsException</code> if it could not be found.
	 *
	 * @param eventId the primary key of the store events
	 * @return the store events
	 * @throws NoSuchStoreEventsException if a store events with the primary key could not be found
	 */
	public StoreEvents findByPrimaryKey(long eventId)
		throws NoSuchStoreEventsException;

	/**
	 * Returns the store events with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param eventId the primary key of the store events
	 * @return the store events, or <code>null</code> if a store events with the primary key could not be found
	 */
	public StoreEvents fetchByPrimaryKey(long eventId);

	/**
	 * Returns all the store eventses.
	 *
	 * @return the store eventses
	 */
	public java.util.List<StoreEvents> findAll();

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
	public java.util.List<StoreEvents> findAll(int start, int end);

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
	public java.util.List<StoreEvents> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator);

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
	public java.util.List<StoreEvents> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StoreEvents>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the store eventses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of store eventses.
	 *
	 * @return the number of store eventses
	 */
	public int countAll();

}