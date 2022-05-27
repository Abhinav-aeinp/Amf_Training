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

package com.liferay.training.amf.search.box.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.amf.search.box.model.SearchBox;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the search box service. This utility wraps <code>com.liferay.training.amf.search.box.service.persistence.impl.SearchBoxPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SearchBoxPersistence
 * @generated
 */
public class SearchBoxUtil {

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
	public static void clearCache(SearchBox searchBox) {
		getPersistence().clearCache(searchBox);
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
	public static Map<Serializable, SearchBox> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SearchBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SearchBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SearchBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SearchBox> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SearchBox update(SearchBox searchBox) {
		return getPersistence().update(searchBox);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SearchBox update(
		SearchBox searchBox, ServiceContext serviceContext) {

		return getPersistence().update(searchBox, serviceContext);
	}

	/**
	 * Returns all the search boxes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching search boxes
	 */
	public static List<SearchBox> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the search boxes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchBoxModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of search boxes
	 * @param end the upper bound of the range of search boxes (not inclusive)
	 * @return the range of matching search boxes
	 */
	public static List<SearchBox> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the search boxes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchBoxModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of search boxes
	 * @param end the upper bound of the range of search boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching search boxes
	 */
	public static List<SearchBox> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SearchBox> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the search boxes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchBoxModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of search boxes
	 * @param end the upper bound of the range of search boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching search boxes
	 */
	public static List<SearchBox> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SearchBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first search box in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search box
	 * @throws NoSuchSearchBoxException if a matching search box could not be found
	 */
	public static SearchBox findByUuid_First(
			String uuid, OrderByComparator<SearchBox> orderByComparator)
		throws com.liferay.training.amf.search.box.exception.
			NoSuchSearchBoxException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first search box in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search box, or <code>null</code> if a matching search box could not be found
	 */
	public static SearchBox fetchByUuid_First(
		String uuid, OrderByComparator<SearchBox> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last search box in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search box
	 * @throws NoSuchSearchBoxException if a matching search box could not be found
	 */
	public static SearchBox findByUuid_Last(
			String uuid, OrderByComparator<SearchBox> orderByComparator)
		throws com.liferay.training.amf.search.box.exception.
			NoSuchSearchBoxException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last search box in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search box, or <code>null</code> if a matching search box could not be found
	 */
	public static SearchBox fetchByUuid_Last(
		String uuid, OrderByComparator<SearchBox> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the search boxes before and after the current search box in the ordered set where uuid = &#63;.
	 *
	 * @param fooId the primary key of the current search box
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next search box
	 * @throws NoSuchSearchBoxException if a search box with the primary key could not be found
	 */
	public static SearchBox[] findByUuid_PrevAndNext(
			long fooId, String uuid,
			OrderByComparator<SearchBox> orderByComparator)
		throws com.liferay.training.amf.search.box.exception.
			NoSuchSearchBoxException {

		return getPersistence().findByUuid_PrevAndNext(
			fooId, uuid, orderByComparator);
	}

	/**
	 * Removes all the search boxes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of search boxes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching search boxes
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the search box where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSearchBoxException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching search box
	 * @throws NoSuchSearchBoxException if a matching search box could not be found
	 */
	public static SearchBox findByUUID_G(String uuid, long groupId)
		throws com.liferay.training.amf.search.box.exception.
			NoSuchSearchBoxException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the search box where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching search box, or <code>null</code> if a matching search box could not be found
	 */
	public static SearchBox fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the search box where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching search box, or <code>null</code> if a matching search box could not be found
	 */
	public static SearchBox fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the search box where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the search box that was removed
	 */
	public static SearchBox removeByUUID_G(String uuid, long groupId)
		throws com.liferay.training.amf.search.box.exception.
			NoSuchSearchBoxException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of search boxes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching search boxes
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the search boxes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching search boxes
	 */
	public static List<SearchBox> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the search boxes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchBoxModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of search boxes
	 * @param end the upper bound of the range of search boxes (not inclusive)
	 * @return the range of matching search boxes
	 */
	public static List<SearchBox> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the search boxes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchBoxModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of search boxes
	 * @param end the upper bound of the range of search boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching search boxes
	 */
	public static List<SearchBox> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SearchBox> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the search boxes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchBoxModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of search boxes
	 * @param end the upper bound of the range of search boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching search boxes
	 */
	public static List<SearchBox> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SearchBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first search box in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search box
	 * @throws NoSuchSearchBoxException if a matching search box could not be found
	 */
	public static SearchBox findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SearchBox> orderByComparator)
		throws com.liferay.training.amf.search.box.exception.
			NoSuchSearchBoxException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first search box in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search box, or <code>null</code> if a matching search box could not be found
	 */
	public static SearchBox fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SearchBox> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last search box in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search box
	 * @throws NoSuchSearchBoxException if a matching search box could not be found
	 */
	public static SearchBox findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SearchBox> orderByComparator)
		throws com.liferay.training.amf.search.box.exception.
			NoSuchSearchBoxException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last search box in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search box, or <code>null</code> if a matching search box could not be found
	 */
	public static SearchBox fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SearchBox> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the search boxes before and after the current search box in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param fooId the primary key of the current search box
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next search box
	 * @throws NoSuchSearchBoxException if a search box with the primary key could not be found
	 */
	public static SearchBox[] findByUuid_C_PrevAndNext(
			long fooId, String uuid, long companyId,
			OrderByComparator<SearchBox> orderByComparator)
		throws com.liferay.training.amf.search.box.exception.
			NoSuchSearchBoxException {

		return getPersistence().findByUuid_C_PrevAndNext(
			fooId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the search boxes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of search boxes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching search boxes
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the search boxes where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the matching search boxes
	 */
	public static List<SearchBox> findByField2(boolean field2) {
		return getPersistence().findByField2(field2);
	}

	/**
	 * Returns a range of all the search boxes where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchBoxModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of search boxes
	 * @param end the upper bound of the range of search boxes (not inclusive)
	 * @return the range of matching search boxes
	 */
	public static List<SearchBox> findByField2(
		boolean field2, int start, int end) {

		return getPersistence().findByField2(field2, start, end);
	}

	/**
	 * Returns an ordered range of all the search boxes where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchBoxModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of search boxes
	 * @param end the upper bound of the range of search boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching search boxes
	 */
	public static List<SearchBox> findByField2(
		boolean field2, int start, int end,
		OrderByComparator<SearchBox> orderByComparator) {

		return getPersistence().findByField2(
			field2, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the search boxes where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchBoxModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of search boxes
	 * @param end the upper bound of the range of search boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching search boxes
	 */
	public static List<SearchBox> findByField2(
		boolean field2, int start, int end,
		OrderByComparator<SearchBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByField2(
			field2, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first search box in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search box
	 * @throws NoSuchSearchBoxException if a matching search box could not be found
	 */
	public static SearchBox findByField2_First(
			boolean field2, OrderByComparator<SearchBox> orderByComparator)
		throws com.liferay.training.amf.search.box.exception.
			NoSuchSearchBoxException {

		return getPersistence().findByField2_First(field2, orderByComparator);
	}

	/**
	 * Returns the first search box in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search box, or <code>null</code> if a matching search box could not be found
	 */
	public static SearchBox fetchByField2_First(
		boolean field2, OrderByComparator<SearchBox> orderByComparator) {

		return getPersistence().fetchByField2_First(field2, orderByComparator);
	}

	/**
	 * Returns the last search box in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search box
	 * @throws NoSuchSearchBoxException if a matching search box could not be found
	 */
	public static SearchBox findByField2_Last(
			boolean field2, OrderByComparator<SearchBox> orderByComparator)
		throws com.liferay.training.amf.search.box.exception.
			NoSuchSearchBoxException {

		return getPersistence().findByField2_Last(field2, orderByComparator);
	}

	/**
	 * Returns the last search box in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search box, or <code>null</code> if a matching search box could not be found
	 */
	public static SearchBox fetchByField2_Last(
		boolean field2, OrderByComparator<SearchBox> orderByComparator) {

		return getPersistence().fetchByField2_Last(field2, orderByComparator);
	}

	/**
	 * Returns the search boxes before and after the current search box in the ordered set where field2 = &#63;.
	 *
	 * @param fooId the primary key of the current search box
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next search box
	 * @throws NoSuchSearchBoxException if a search box with the primary key could not be found
	 */
	public static SearchBox[] findByField2_PrevAndNext(
			long fooId, boolean field2,
			OrderByComparator<SearchBox> orderByComparator)
		throws com.liferay.training.amf.search.box.exception.
			NoSuchSearchBoxException {

		return getPersistence().findByField2_PrevAndNext(
			fooId, field2, orderByComparator);
	}

	/**
	 * Removes all the search boxes where field2 = &#63; from the database.
	 *
	 * @param field2 the field2
	 */
	public static void removeByField2(boolean field2) {
		getPersistence().removeByField2(field2);
	}

	/**
	 * Returns the number of search boxes where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the number of matching search boxes
	 */
	public static int countByField2(boolean field2) {
		return getPersistence().countByField2(field2);
	}

	/**
	 * Caches the search box in the entity cache if it is enabled.
	 *
	 * @param searchBox the search box
	 */
	public static void cacheResult(SearchBox searchBox) {
		getPersistence().cacheResult(searchBox);
	}

	/**
	 * Caches the search boxes in the entity cache if it is enabled.
	 *
	 * @param searchBoxes the search boxes
	 */
	public static void cacheResult(List<SearchBox> searchBoxes) {
		getPersistence().cacheResult(searchBoxes);
	}

	/**
	 * Creates a new search box with the primary key. Does not add the search box to the database.
	 *
	 * @param fooId the primary key for the new search box
	 * @return the new search box
	 */
	public static SearchBox create(long fooId) {
		return getPersistence().create(fooId);
	}

	/**
	 * Removes the search box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fooId the primary key of the search box
	 * @return the search box that was removed
	 * @throws NoSuchSearchBoxException if a search box with the primary key could not be found
	 */
	public static SearchBox remove(long fooId)
		throws com.liferay.training.amf.search.box.exception.
			NoSuchSearchBoxException {

		return getPersistence().remove(fooId);
	}

	public static SearchBox updateImpl(SearchBox searchBox) {
		return getPersistence().updateImpl(searchBox);
	}

	/**
	 * Returns the search box with the primary key or throws a <code>NoSuchSearchBoxException</code> if it could not be found.
	 *
	 * @param fooId the primary key of the search box
	 * @return the search box
	 * @throws NoSuchSearchBoxException if a search box with the primary key could not be found
	 */
	public static SearchBox findByPrimaryKey(long fooId)
		throws com.liferay.training.amf.search.box.exception.
			NoSuchSearchBoxException {

		return getPersistence().findByPrimaryKey(fooId);
	}

	/**
	 * Returns the search box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fooId the primary key of the search box
	 * @return the search box, or <code>null</code> if a search box with the primary key could not be found
	 */
	public static SearchBox fetchByPrimaryKey(long fooId) {
		return getPersistence().fetchByPrimaryKey(fooId);
	}

	/**
	 * Returns all the search boxes.
	 *
	 * @return the search boxes
	 */
	public static List<SearchBox> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the search boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of search boxes
	 * @param end the upper bound of the range of search boxes (not inclusive)
	 * @return the range of search boxes
	 */
	public static List<SearchBox> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the search boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of search boxes
	 * @param end the upper bound of the range of search boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of search boxes
	 */
	public static List<SearchBox> findAll(
		int start, int end, OrderByComparator<SearchBox> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the search boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of search boxes
	 * @param end the upper bound of the range of search boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of search boxes
	 */
	public static List<SearchBox> findAll(
		int start, int end, OrderByComparator<SearchBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the search boxes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of search boxes.
	 *
	 * @return the number of search boxes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SearchBoxPersistence getPersistence() {
		return _persistence;
	}

	private static volatile SearchBoxPersistence _persistence;

}