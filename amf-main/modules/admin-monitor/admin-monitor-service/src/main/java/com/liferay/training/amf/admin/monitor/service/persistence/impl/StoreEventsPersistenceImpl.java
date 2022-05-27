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

package com.liferay.training.amf.admin.monitor.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.training.amf.admin.monitor.exception.NoSuchStoreEventsException;
import com.liferay.training.amf.admin.monitor.model.StoreEvents;
import com.liferay.training.amf.admin.monitor.model.impl.StoreEventsImpl;
import com.liferay.training.amf.admin.monitor.model.impl.StoreEventsModelImpl;
import com.liferay.training.amf.admin.monitor.service.persistence.StoreEventsPersistence;
import com.liferay.training.amf.admin.monitor.service.persistence.StoreEventsUtil;
import com.liferay.training.amf.admin.monitor.service.persistence.impl.constants.StoreEventsPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the store events service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = StoreEventsPersistence.class)
public class StoreEventsPersistenceImpl
	extends BasePersistenceImpl<StoreEvents> implements StoreEventsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>StoreEventsUtil</code> to access the store events persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		StoreEventsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the store eventses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching store eventses
	 */
	@Override
	public List<StoreEvents> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<StoreEvents> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<StoreEvents> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<StoreEvents> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<StoreEvents> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<StoreEvents> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<StoreEvents> list = null;

		if (useFinderCache) {
			list = (List<StoreEvents>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (StoreEvents storeEvents : list) {
					if (!uuid.equals(storeEvents.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_STOREEVENTS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(StoreEventsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<StoreEvents>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first store events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	@Override
	public StoreEvents findByUuid_First(
			String uuid, OrderByComparator<StoreEvents> orderByComparator)
		throws NoSuchStoreEventsException {

		StoreEvents storeEvents = fetchByUuid_First(uuid, orderByComparator);

		if (storeEvents != null) {
			return storeEvents;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchStoreEventsException(sb.toString());
	}

	/**
	 * Returns the first store events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events, or <code>null</code> if a matching store events could not be found
	 */
	@Override
	public StoreEvents fetchByUuid_First(
		String uuid, OrderByComparator<StoreEvents> orderByComparator) {

		List<StoreEvents> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last store events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	@Override
	public StoreEvents findByUuid_Last(
			String uuid, OrderByComparator<StoreEvents> orderByComparator)
		throws NoSuchStoreEventsException {

		StoreEvents storeEvents = fetchByUuid_Last(uuid, orderByComparator);

		if (storeEvents != null) {
			return storeEvents;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchStoreEventsException(sb.toString());
	}

	/**
	 * Returns the last store events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events, or <code>null</code> if a matching store events could not be found
	 */
	@Override
	public StoreEvents fetchByUuid_Last(
		String uuid, OrderByComparator<StoreEvents> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<StoreEvents> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public StoreEvents[] findByUuid_PrevAndNext(
			long eventId, String uuid,
			OrderByComparator<StoreEvents> orderByComparator)
		throws NoSuchStoreEventsException {

		uuid = Objects.toString(uuid, "");

		StoreEvents storeEvents = findByPrimaryKey(eventId);

		Session session = null;

		try {
			session = openSession();

			StoreEvents[] array = new StoreEventsImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, storeEvents, uuid, orderByComparator, true);

			array[1] = storeEvents;

			array[2] = getByUuid_PrevAndNext(
				session, storeEvents, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected StoreEvents getByUuid_PrevAndNext(
		Session session, StoreEvents storeEvents, String uuid,
		OrderByComparator<StoreEvents> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_STOREEVENTS_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(StoreEventsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(storeEvents)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<StoreEvents> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the store eventses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (StoreEvents storeEvents :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(storeEvents);
		}
	}

	/**
	 * Returns the number of store eventses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching store eventses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_STOREEVENTS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"storeEvents.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(storeEvents.uuid IS NULL OR storeEvents.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByEventType;
	private FinderPath _finderPathWithoutPaginationFindByEventType;
	private FinderPath _finderPathCountByEventType;

	/**
	 * Returns all the store eventses where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @return the matching store eventses
	 */
	@Override
	public List<StoreEvents> findByEventType(String eventType) {
		return findByEventType(
			eventType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<StoreEvents> findByEventType(
		String eventType, int start, int end) {

		return findByEventType(eventType, start, end, null);
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
	@Override
	public List<StoreEvents> findByEventType(
		String eventType, int start, int end,
		OrderByComparator<StoreEvents> orderByComparator) {

		return findByEventType(eventType, start, end, orderByComparator, true);
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
	@Override
	public List<StoreEvents> findByEventType(
		String eventType, int start, int end,
		OrderByComparator<StoreEvents> orderByComparator,
		boolean useFinderCache) {

		eventType = Objects.toString(eventType, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByEventType;
				finderArgs = new Object[] {eventType};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByEventType;
			finderArgs = new Object[] {
				eventType, start, end, orderByComparator
			};
		}

		List<StoreEvents> list = null;

		if (useFinderCache) {
			list = (List<StoreEvents>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (StoreEvents storeEvents : list) {
					if (!eventType.equals(storeEvents.getEventType())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_STOREEVENTS_WHERE);

			boolean bindEventType = false;

			if (eventType.isEmpty()) {
				sb.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_3);
			}
			else {
				bindEventType = true;

				sb.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(StoreEventsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEventType) {
					queryPos.add(eventType);
				}

				list = (List<StoreEvents>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first store events in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	@Override
	public StoreEvents findByEventType_First(
			String eventType, OrderByComparator<StoreEvents> orderByComparator)
		throws NoSuchStoreEventsException {

		StoreEvents storeEvents = fetchByEventType_First(
			eventType, orderByComparator);

		if (storeEvents != null) {
			return storeEvents;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("eventType=");
		sb.append(eventType);

		sb.append("}");

		throw new NoSuchStoreEventsException(sb.toString());
	}

	/**
	 * Returns the first store events in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events, or <code>null</code> if a matching store events could not be found
	 */
	@Override
	public StoreEvents fetchByEventType_First(
		String eventType, OrderByComparator<StoreEvents> orderByComparator) {

		List<StoreEvents> list = findByEventType(
			eventType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last store events in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	@Override
	public StoreEvents findByEventType_Last(
			String eventType, OrderByComparator<StoreEvents> orderByComparator)
		throws NoSuchStoreEventsException {

		StoreEvents storeEvents = fetchByEventType_Last(
			eventType, orderByComparator);

		if (storeEvents != null) {
			return storeEvents;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("eventType=");
		sb.append(eventType);

		sb.append("}");

		throw new NoSuchStoreEventsException(sb.toString());
	}

	/**
	 * Returns the last store events in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events, or <code>null</code> if a matching store events could not be found
	 */
	@Override
	public StoreEvents fetchByEventType_Last(
		String eventType, OrderByComparator<StoreEvents> orderByComparator) {

		int count = countByEventType(eventType);

		if (count == 0) {
			return null;
		}

		List<StoreEvents> list = findByEventType(
			eventType, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public StoreEvents[] findByEventType_PrevAndNext(
			long eventId, String eventType,
			OrderByComparator<StoreEvents> orderByComparator)
		throws NoSuchStoreEventsException {

		eventType = Objects.toString(eventType, "");

		StoreEvents storeEvents = findByPrimaryKey(eventId);

		Session session = null;

		try {
			session = openSession();

			StoreEvents[] array = new StoreEventsImpl[3];

			array[0] = getByEventType_PrevAndNext(
				session, storeEvents, eventType, orderByComparator, true);

			array[1] = storeEvents;

			array[2] = getByEventType_PrevAndNext(
				session, storeEvents, eventType, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected StoreEvents getByEventType_PrevAndNext(
		Session session, StoreEvents storeEvents, String eventType,
		OrderByComparator<StoreEvents> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_STOREEVENTS_WHERE);

		boolean bindEventType = false;

		if (eventType.isEmpty()) {
			sb.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_3);
		}
		else {
			bindEventType = true;

			sb.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(StoreEventsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindEventType) {
			queryPos.add(eventType);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(storeEvents)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<StoreEvents> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the store eventses where eventType = &#63; from the database.
	 *
	 * @param eventType the event type
	 */
	@Override
	public void removeByEventType(String eventType) {
		for (StoreEvents storeEvents :
				findByEventType(
					eventType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(storeEvents);
		}
	}

	/**
	 * Returns the number of store eventses where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @return the number of matching store eventses
	 */
	@Override
	public int countByEventType(String eventType) {
		eventType = Objects.toString(eventType, "");

		FinderPath finderPath = _finderPathCountByEventType;

		Object[] finderArgs = new Object[] {eventType};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_STOREEVENTS_WHERE);

			boolean bindEventType = false;

			if (eventType.isEmpty()) {
				sb.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_3);
			}
			else {
				bindEventType = true;

				sb.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEventType) {
					queryPos.add(eventType);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_EVENTTYPE_EVENTTYPE_2 =
		"storeEvents.eventType = ?";

	private static final String _FINDER_COLUMN_EVENTTYPE_EVENTTYPE_3 =
		"(storeEvents.eventType IS NULL OR storeEvents.eventType = '')";

	private FinderPath _finderPathWithPaginationFindByUser;
	private FinderPath _finderPathWithoutPaginationFindByUser;
	private FinderPath _finderPathCountByUser;

	/**
	 * Returns all the store eventses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching store eventses
	 */
	@Override
	public List<StoreEvents> findByUser(long userId) {
		return findByUser(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<StoreEvents> findByUser(long userId, int start, int end) {
		return findByUser(userId, start, end, null);
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
	@Override
	public List<StoreEvents> findByUser(
		long userId, int start, int end,
		OrderByComparator<StoreEvents> orderByComparator) {

		return findByUser(userId, start, end, orderByComparator, true);
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
	@Override
	public List<StoreEvents> findByUser(
		long userId, int start, int end,
		OrderByComparator<StoreEvents> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUser;
				finderArgs = new Object[] {userId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUser;
			finderArgs = new Object[] {userId, start, end, orderByComparator};
		}

		List<StoreEvents> list = null;

		if (useFinderCache) {
			list = (List<StoreEvents>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (StoreEvents storeEvents : list) {
					if (userId != storeEvents.getUserId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_STOREEVENTS_WHERE);

			sb.append(_FINDER_COLUMN_USER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(StoreEventsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				list = (List<StoreEvents>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first store events in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	@Override
	public StoreEvents findByUser_First(
			long userId, OrderByComparator<StoreEvents> orderByComparator)
		throws NoSuchStoreEventsException {

		StoreEvents storeEvents = fetchByUser_First(userId, orderByComparator);

		if (storeEvents != null) {
			return storeEvents;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchStoreEventsException(sb.toString());
	}

	/**
	 * Returns the first store events in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events, or <code>null</code> if a matching store events could not be found
	 */
	@Override
	public StoreEvents fetchByUser_First(
		long userId, OrderByComparator<StoreEvents> orderByComparator) {

		List<StoreEvents> list = findByUser(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last store events in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events
	 * @throws NoSuchStoreEventsException if a matching store events could not be found
	 */
	@Override
	public StoreEvents findByUser_Last(
			long userId, OrderByComparator<StoreEvents> orderByComparator)
		throws NoSuchStoreEventsException {

		StoreEvents storeEvents = fetchByUser_Last(userId, orderByComparator);

		if (storeEvents != null) {
			return storeEvents;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchStoreEventsException(sb.toString());
	}

	/**
	 * Returns the last store events in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events, or <code>null</code> if a matching store events could not be found
	 */
	@Override
	public StoreEvents fetchByUser_Last(
		long userId, OrderByComparator<StoreEvents> orderByComparator) {

		int count = countByUser(userId);

		if (count == 0) {
			return null;
		}

		List<StoreEvents> list = findByUser(
			userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public StoreEvents[] findByUser_PrevAndNext(
			long eventId, long userId,
			OrderByComparator<StoreEvents> orderByComparator)
		throws NoSuchStoreEventsException {

		StoreEvents storeEvents = findByPrimaryKey(eventId);

		Session session = null;

		try {
			session = openSession();

			StoreEvents[] array = new StoreEventsImpl[3];

			array[0] = getByUser_PrevAndNext(
				session, storeEvents, userId, orderByComparator, true);

			array[1] = storeEvents;

			array[2] = getByUser_PrevAndNext(
				session, storeEvents, userId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected StoreEvents getByUser_PrevAndNext(
		Session session, StoreEvents storeEvents, long userId,
		OrderByComparator<StoreEvents> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_STOREEVENTS_WHERE);

		sb.append(_FINDER_COLUMN_USER_USERID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(StoreEventsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(userId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(storeEvents)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<StoreEvents> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the store eventses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUser(long userId) {
		for (StoreEvents storeEvents :
				findByUser(
					userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(storeEvents);
		}
	}

	/**
	 * Returns the number of store eventses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching store eventses
	 */
	@Override
	public int countByUser(long userId) {
		FinderPath finderPath = _finderPathCountByUser;

		Object[] finderArgs = new Object[] {userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_STOREEVENTS_WHERE);

			sb.append(_FINDER_COLUMN_USER_USERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USER_USERID_2 =
		"storeEvents.userId = ?";

	private FinderPath _finderPathWithPaginationFindByUserAndEventType;
	private FinderPath _finderPathWithoutPaginationFindByUserAndEventType;
	private FinderPath _finderPathCountByUserAndEventType;

	/**
	 * Returns all the store eventses where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @return the matching store eventses
	 */
	@Override
	public List<StoreEvents> findByUserAndEventType(
		String eventType, long userId) {

		return findByUserAndEventType(
			eventType, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<StoreEvents> findByUserAndEventType(
		String eventType, long userId, int start, int end) {

		return findByUserAndEventType(eventType, userId, start, end, null);
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
	@Override
	public List<StoreEvents> findByUserAndEventType(
		String eventType, long userId, int start, int end,
		OrderByComparator<StoreEvents> orderByComparator) {

		return findByUserAndEventType(
			eventType, userId, start, end, orderByComparator, true);
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
	@Override
	public List<StoreEvents> findByUserAndEventType(
		String eventType, long userId, int start, int end,
		OrderByComparator<StoreEvents> orderByComparator,
		boolean useFinderCache) {

		eventType = Objects.toString(eventType, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUserAndEventType;
				finderArgs = new Object[] {eventType, userId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUserAndEventType;
			finderArgs = new Object[] {
				eventType, userId, start, end, orderByComparator
			};
		}

		List<StoreEvents> list = null;

		if (useFinderCache) {
			list = (List<StoreEvents>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (StoreEvents storeEvents : list) {
					if (!eventType.equals(storeEvents.getEventType()) ||
						(userId != storeEvents.getUserId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_STOREEVENTS_WHERE);

			boolean bindEventType = false;

			if (eventType.isEmpty()) {
				sb.append(_FINDER_COLUMN_USERANDEVENTTYPE_EVENTTYPE_3);
			}
			else {
				bindEventType = true;

				sb.append(_FINDER_COLUMN_USERANDEVENTTYPE_EVENTTYPE_2);
			}

			sb.append(_FINDER_COLUMN_USERANDEVENTTYPE_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(StoreEventsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEventType) {
					queryPos.add(eventType);
				}

				queryPos.add(userId);

				list = (List<StoreEvents>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public StoreEvents findByUserAndEventType_First(
			String eventType, long userId,
			OrderByComparator<StoreEvents> orderByComparator)
		throws NoSuchStoreEventsException {

		StoreEvents storeEvents = fetchByUserAndEventType_First(
			eventType, userId, orderByComparator);

		if (storeEvents != null) {
			return storeEvents;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("eventType=");
		sb.append(eventType);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchStoreEventsException(sb.toString());
	}

	/**
	 * Returns the first store events in the ordered set where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store events, or <code>null</code> if a matching store events could not be found
	 */
	@Override
	public StoreEvents fetchByUserAndEventType_First(
		String eventType, long userId,
		OrderByComparator<StoreEvents> orderByComparator) {

		List<StoreEvents> list = findByUserAndEventType(
			eventType, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public StoreEvents findByUserAndEventType_Last(
			String eventType, long userId,
			OrderByComparator<StoreEvents> orderByComparator)
		throws NoSuchStoreEventsException {

		StoreEvents storeEvents = fetchByUserAndEventType_Last(
			eventType, userId, orderByComparator);

		if (storeEvents != null) {
			return storeEvents;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("eventType=");
		sb.append(eventType);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchStoreEventsException(sb.toString());
	}

	/**
	 * Returns the last store events in the ordered set where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store events, or <code>null</code> if a matching store events could not be found
	 */
	@Override
	public StoreEvents fetchByUserAndEventType_Last(
		String eventType, long userId,
		OrderByComparator<StoreEvents> orderByComparator) {

		int count = countByUserAndEventType(eventType, userId);

		if (count == 0) {
			return null;
		}

		List<StoreEvents> list = findByUserAndEventType(
			eventType, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public StoreEvents[] findByUserAndEventType_PrevAndNext(
			long eventId, String eventType, long userId,
			OrderByComparator<StoreEvents> orderByComparator)
		throws NoSuchStoreEventsException {

		eventType = Objects.toString(eventType, "");

		StoreEvents storeEvents = findByPrimaryKey(eventId);

		Session session = null;

		try {
			session = openSession();

			StoreEvents[] array = new StoreEventsImpl[3];

			array[0] = getByUserAndEventType_PrevAndNext(
				session, storeEvents, eventType, userId, orderByComparator,
				true);

			array[1] = storeEvents;

			array[2] = getByUserAndEventType_PrevAndNext(
				session, storeEvents, eventType, userId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected StoreEvents getByUserAndEventType_PrevAndNext(
		Session session, StoreEvents storeEvents, String eventType, long userId,
		OrderByComparator<StoreEvents> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_STOREEVENTS_WHERE);

		boolean bindEventType = false;

		if (eventType.isEmpty()) {
			sb.append(_FINDER_COLUMN_USERANDEVENTTYPE_EVENTTYPE_3);
		}
		else {
			bindEventType = true;

			sb.append(_FINDER_COLUMN_USERANDEVENTTYPE_EVENTTYPE_2);
		}

		sb.append(_FINDER_COLUMN_USERANDEVENTTYPE_USERID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(StoreEventsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindEventType) {
			queryPos.add(eventType);
		}

		queryPos.add(userId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(storeEvents)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<StoreEvents> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the store eventses where eventType = &#63; and userId = &#63; from the database.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserAndEventType(String eventType, long userId) {
		for (StoreEvents storeEvents :
				findByUserAndEventType(
					eventType, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(storeEvents);
		}
	}

	/**
	 * Returns the number of store eventses where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @return the number of matching store eventses
	 */
	@Override
	public int countByUserAndEventType(String eventType, long userId) {
		eventType = Objects.toString(eventType, "");

		FinderPath finderPath = _finderPathCountByUserAndEventType;

		Object[] finderArgs = new Object[] {eventType, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_STOREEVENTS_WHERE);

			boolean bindEventType = false;

			if (eventType.isEmpty()) {
				sb.append(_FINDER_COLUMN_USERANDEVENTTYPE_EVENTTYPE_3);
			}
			else {
				bindEventType = true;

				sb.append(_FINDER_COLUMN_USERANDEVENTTYPE_EVENTTYPE_2);
			}

			sb.append(_FINDER_COLUMN_USERANDEVENTTYPE_USERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEventType) {
					queryPos.add(eventType);
				}

				queryPos.add(userId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USERANDEVENTTYPE_EVENTTYPE_2 =
		"storeEvents.eventType = ? AND ";

	private static final String _FINDER_COLUMN_USERANDEVENTTYPE_EVENTTYPE_3 =
		"(storeEvents.eventType IS NULL OR storeEvents.eventType = '') AND ";

	private static final String _FINDER_COLUMN_USERANDEVENTTYPE_USERID_2 =
		"storeEvents.userId = ?";

	public StoreEventsPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(StoreEvents.class);

		setModelImplClass(StoreEventsImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the store events in the entity cache if it is enabled.
	 *
	 * @param storeEvents the store events
	 */
	@Override
	public void cacheResult(StoreEvents storeEvents) {
		entityCache.putResult(
			StoreEventsImpl.class, storeEvents.getPrimaryKey(), storeEvents);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the store eventses in the entity cache if it is enabled.
	 *
	 * @param storeEventses the store eventses
	 */
	@Override
	public void cacheResult(List<StoreEvents> storeEventses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (storeEventses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (StoreEvents storeEvents : storeEventses) {
			if (entityCache.getResult(
					StoreEventsImpl.class, storeEvents.getPrimaryKey()) ==
						null) {

				cacheResult(storeEvents);
			}
		}
	}

	/**
	 * Clears the cache for all store eventses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(StoreEventsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the store events.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StoreEvents storeEvents) {
		entityCache.removeResult(StoreEventsImpl.class, storeEvents);
	}

	@Override
	public void clearCache(List<StoreEvents> storeEventses) {
		for (StoreEvents storeEvents : storeEventses) {
			entityCache.removeResult(StoreEventsImpl.class, storeEvents);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(StoreEventsImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new store events with the primary key. Does not add the store events to the database.
	 *
	 * @param eventId the primary key for the new store events
	 * @return the new store events
	 */
	@Override
	public StoreEvents create(long eventId) {
		StoreEvents storeEvents = new StoreEventsImpl();

		storeEvents.setNew(true);
		storeEvents.setPrimaryKey(eventId);

		String uuid = PortalUUIDUtil.generate();

		storeEvents.setUuid(uuid);

		return storeEvents;
	}

	/**
	 * Removes the store events with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param eventId the primary key of the store events
	 * @return the store events that was removed
	 * @throws NoSuchStoreEventsException if a store events with the primary key could not be found
	 */
	@Override
	public StoreEvents remove(long eventId) throws NoSuchStoreEventsException {
		return remove((Serializable)eventId);
	}

	/**
	 * Removes the store events with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the store events
	 * @return the store events that was removed
	 * @throws NoSuchStoreEventsException if a store events with the primary key could not be found
	 */
	@Override
	public StoreEvents remove(Serializable primaryKey)
		throws NoSuchStoreEventsException {

		Session session = null;

		try {
			session = openSession();

			StoreEvents storeEvents = (StoreEvents)session.get(
				StoreEventsImpl.class, primaryKey);

			if (storeEvents == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStoreEventsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(storeEvents);
		}
		catch (NoSuchStoreEventsException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected StoreEvents removeImpl(StoreEvents storeEvents) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(storeEvents)) {
				storeEvents = (StoreEvents)session.get(
					StoreEventsImpl.class, storeEvents.getPrimaryKeyObj());
			}

			if (storeEvents != null) {
				session.delete(storeEvents);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (storeEvents != null) {
			clearCache(storeEvents);
		}

		return storeEvents;
	}

	@Override
	public StoreEvents updateImpl(StoreEvents storeEvents) {
		boolean isNew = storeEvents.isNew();

		if (!(storeEvents instanceof StoreEventsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(storeEvents.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(storeEvents);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in storeEvents proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom StoreEvents implementation " +
					storeEvents.getClass());
		}

		StoreEventsModelImpl storeEventsModelImpl =
			(StoreEventsModelImpl)storeEvents;

		if (Validator.isNull(storeEvents.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			storeEvents.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(storeEvents);
			}
			else {
				storeEvents = (StoreEvents)session.merge(storeEvents);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			StoreEventsImpl.class, storeEventsModelImpl, false, true);

		if (isNew) {
			storeEvents.setNew(false);
		}

		storeEvents.resetOriginalValues();

		return storeEvents;
	}

	/**
	 * Returns the store events with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the store events
	 * @return the store events
	 * @throws NoSuchStoreEventsException if a store events with the primary key could not be found
	 */
	@Override
	public StoreEvents findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStoreEventsException {

		StoreEvents storeEvents = fetchByPrimaryKey(primaryKey);

		if (storeEvents == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStoreEventsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return storeEvents;
	}

	/**
	 * Returns the store events with the primary key or throws a <code>NoSuchStoreEventsException</code> if it could not be found.
	 *
	 * @param eventId the primary key of the store events
	 * @return the store events
	 * @throws NoSuchStoreEventsException if a store events with the primary key could not be found
	 */
	@Override
	public StoreEvents findByPrimaryKey(long eventId)
		throws NoSuchStoreEventsException {

		return findByPrimaryKey((Serializable)eventId);
	}

	/**
	 * Returns the store events with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param eventId the primary key of the store events
	 * @return the store events, or <code>null</code> if a store events with the primary key could not be found
	 */
	@Override
	public StoreEvents fetchByPrimaryKey(long eventId) {
		return fetchByPrimaryKey((Serializable)eventId);
	}

	/**
	 * Returns all the store eventses.
	 *
	 * @return the store eventses
	 */
	@Override
	public List<StoreEvents> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<StoreEvents> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<StoreEvents> findAll(
		int start, int end, OrderByComparator<StoreEvents> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<StoreEvents> findAll(
		int start, int end, OrderByComparator<StoreEvents> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<StoreEvents> list = null;

		if (useFinderCache) {
			list = (List<StoreEvents>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_STOREEVENTS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_STOREEVENTS;

				sql = sql.concat(StoreEventsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<StoreEvents>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the store eventses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (StoreEvents storeEvents : findAll()) {
			remove(storeEvents);
		}
	}

	/**
	 * Returns the number of store eventses.
	 *
	 * @return the number of store eventses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_STOREEVENTS);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "eventId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_STOREEVENTS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return StoreEventsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the store events persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new StoreEventsModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", StoreEvents.class.getName()));

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathWithPaginationFindByEventType = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEventType",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"eventType"}, true);

		_finderPathWithoutPaginationFindByEventType = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEventType",
			new String[] {String.class.getName()}, new String[] {"eventType"},
			true);

		_finderPathCountByEventType = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEventType",
			new String[] {String.class.getName()}, new String[] {"eventType"},
			false);

		_finderPathWithPaginationFindByUser = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUser",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"userId"}, true);

		_finderPathWithoutPaginationFindByUser = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUser",
			new String[] {Long.class.getName()}, new String[] {"userId"}, true);

		_finderPathCountByUser = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUser",
			new String[] {Long.class.getName()}, new String[] {"userId"},
			false);

		_finderPathWithPaginationFindByUserAndEventType = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserAndEventType",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"eventType", "userId"}, true);

		_finderPathWithoutPaginationFindByUserAndEventType = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserAndEventType",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"eventType", "userId"}, true);

		_finderPathCountByUserAndEventType = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByUserAndEventType",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"eventType", "userId"}, false);

		_setStoreEventsUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setStoreEventsUtilPersistence(null);

		entityCache.removeCache(StoreEventsImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	private void _setStoreEventsUtilPersistence(
		StoreEventsPersistence storeEventsPersistence) {

		try {
			Field field = StoreEventsUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, storeEventsPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = StoreEventsPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = StoreEventsPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = StoreEventsPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_STOREEVENTS =
		"SELECT storeEvents FROM StoreEvents storeEvents";

	private static final String _SQL_SELECT_STOREEVENTS_WHERE =
		"SELECT storeEvents FROM StoreEvents storeEvents WHERE ";

	private static final String _SQL_COUNT_STOREEVENTS =
		"SELECT COUNT(storeEvents) FROM StoreEvents storeEvents";

	private static final String _SQL_COUNT_STOREEVENTS_WHERE =
		"SELECT COUNT(storeEvents) FROM StoreEvents storeEvents WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "storeEvents.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No StoreEvents exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No StoreEvents exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		StoreEventsPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();
	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class StoreEventsModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return new Object[0];
				}

				return null;
			}

			StoreEventsModelImpl storeEventsModelImpl =
				(StoreEventsModelImpl)baseModel;

			long columnBitmask = storeEventsModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(storeEventsModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						storeEventsModelImpl.getColumnBitmask(columnName);
				}

				if (finderPath.isBaseModelResult() &&
					(StoreEventsPersistenceImpl.
						FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
							finderPath.getCacheName())) {

					finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(storeEventsModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			StoreEventsModelImpl storeEventsModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = storeEventsModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = storeEventsModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static final Map<FinderPath, Long>
			_finderPathColumnBitmasksCache = new ConcurrentHashMap<>();

		private static final long _ORDER_BY_COLUMNS_BITMASK;

		static {
			long orderByColumnsBitmask = 0;

			orderByColumnsBitmask |= StoreEventsModelImpl.getColumnBitmask(
				"logged");

			_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
		}

	}

}