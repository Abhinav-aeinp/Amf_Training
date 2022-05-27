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

package com.liferay.training.amf.search.result.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.amf.search.result.model.SearchResults;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the search results service. This utility wraps <code>com.liferay.training.amf.search.result.service.persistence.impl.SearchResultsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SearchResultsPersistence
 * @generated
 */
public class SearchResultsUtil {

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
	public static void clearCache(SearchResults searchResults) {
		getPersistence().clearCache(searchResults);
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
	public static Map<Serializable, SearchResults> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SearchResults> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SearchResults> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SearchResults> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SearchResults> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SearchResults update(SearchResults searchResults) {
		return getPersistence().update(searchResults);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SearchResults update(
		SearchResults searchResults, ServiceContext serviceContext) {

		return getPersistence().update(searchResults, serviceContext);
	}

	/**
	 * Returns all the search resultses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching search resultses
	 */
	public static List<SearchResults> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the search resultses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchResultsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of search resultses
	 * @param end the upper bound of the range of search resultses (not inclusive)
	 * @return the range of matching search resultses
	 */
	public static List<SearchResults> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the search resultses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchResultsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of search resultses
	 * @param end the upper bound of the range of search resultses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching search resultses
	 */
	public static List<SearchResults> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SearchResults> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the search resultses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchResultsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of search resultses
	 * @param end the upper bound of the range of search resultses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching search resultses
	 */
	public static List<SearchResults> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SearchResults> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first search results in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search results
	 * @throws NoSuchSearchResultsException if a matching search results could not be found
	 */
	public static SearchResults findByUuid_First(
			String uuid, OrderByComparator<SearchResults> orderByComparator)
		throws com.liferay.training.amf.search.result.exception.
			NoSuchSearchResultsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first search results in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search results, or <code>null</code> if a matching search results could not be found
	 */
	public static SearchResults fetchByUuid_First(
		String uuid, OrderByComparator<SearchResults> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last search results in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search results
	 * @throws NoSuchSearchResultsException if a matching search results could not be found
	 */
	public static SearchResults findByUuid_Last(
			String uuid, OrderByComparator<SearchResults> orderByComparator)
		throws com.liferay.training.amf.search.result.exception.
			NoSuchSearchResultsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last search results in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search results, or <code>null</code> if a matching search results could not be found
	 */
	public static SearchResults fetchByUuid_Last(
		String uuid, OrderByComparator<SearchResults> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the search resultses before and after the current search results in the ordered set where uuid = &#63;.
	 *
	 * @param fooId the primary key of the current search results
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next search results
	 * @throws NoSuchSearchResultsException if a search results with the primary key could not be found
	 */
	public static SearchResults[] findByUuid_PrevAndNext(
			long fooId, String uuid,
			OrderByComparator<SearchResults> orderByComparator)
		throws com.liferay.training.amf.search.result.exception.
			NoSuchSearchResultsException {

		return getPersistence().findByUuid_PrevAndNext(
			fooId, uuid, orderByComparator);
	}

	/**
	 * Removes all the search resultses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of search resultses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching search resultses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the search results where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSearchResultsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching search results
	 * @throws NoSuchSearchResultsException if a matching search results could not be found
	 */
	public static SearchResults findByUUID_G(String uuid, long groupId)
		throws com.liferay.training.amf.search.result.exception.
			NoSuchSearchResultsException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the search results where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching search results, or <code>null</code> if a matching search results could not be found
	 */
	public static SearchResults fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the search results where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching search results, or <code>null</code> if a matching search results could not be found
	 */
	public static SearchResults fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the search results where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the search results that was removed
	 */
	public static SearchResults removeByUUID_G(String uuid, long groupId)
		throws com.liferay.training.amf.search.result.exception.
			NoSuchSearchResultsException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of search resultses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching search resultses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the search resultses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching search resultses
	 */
	public static List<SearchResults> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the search resultses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchResultsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of search resultses
	 * @param end the upper bound of the range of search resultses (not inclusive)
	 * @return the range of matching search resultses
	 */
	public static List<SearchResults> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the search resultses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchResultsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of search resultses
	 * @param end the upper bound of the range of search resultses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching search resultses
	 */
	public static List<SearchResults> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SearchResults> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the search resultses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchResultsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of search resultses
	 * @param end the upper bound of the range of search resultses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching search resultses
	 */
	public static List<SearchResults> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SearchResults> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first search results in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search results
	 * @throws NoSuchSearchResultsException if a matching search results could not be found
	 */
	public static SearchResults findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SearchResults> orderByComparator)
		throws com.liferay.training.amf.search.result.exception.
			NoSuchSearchResultsException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first search results in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search results, or <code>null</code> if a matching search results could not be found
	 */
	public static SearchResults fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SearchResults> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last search results in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search results
	 * @throws NoSuchSearchResultsException if a matching search results could not be found
	 */
	public static SearchResults findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SearchResults> orderByComparator)
		throws com.liferay.training.amf.search.result.exception.
			NoSuchSearchResultsException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last search results in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search results, or <code>null</code> if a matching search results could not be found
	 */
	public static SearchResults fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SearchResults> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the search resultses before and after the current search results in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param fooId the primary key of the current search results
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next search results
	 * @throws NoSuchSearchResultsException if a search results with the primary key could not be found
	 */
	public static SearchResults[] findByUuid_C_PrevAndNext(
			long fooId, String uuid, long companyId,
			OrderByComparator<SearchResults> orderByComparator)
		throws com.liferay.training.amf.search.result.exception.
			NoSuchSearchResultsException {

		return getPersistence().findByUuid_C_PrevAndNext(
			fooId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the search resultses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of search resultses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching search resultses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the search resultses where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the matching search resultses
	 */
	public static List<SearchResults> findByField2(boolean field2) {
		return getPersistence().findByField2(field2);
	}

	/**
	 * Returns a range of all the search resultses where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchResultsModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of search resultses
	 * @param end the upper bound of the range of search resultses (not inclusive)
	 * @return the range of matching search resultses
	 */
	public static List<SearchResults> findByField2(
		boolean field2, int start, int end) {

		return getPersistence().findByField2(field2, start, end);
	}

	/**
	 * Returns an ordered range of all the search resultses where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchResultsModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of search resultses
	 * @param end the upper bound of the range of search resultses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching search resultses
	 */
	public static List<SearchResults> findByField2(
		boolean field2, int start, int end,
		OrderByComparator<SearchResults> orderByComparator) {

		return getPersistence().findByField2(
			field2, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the search resultses where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchResultsModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of search resultses
	 * @param end the upper bound of the range of search resultses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching search resultses
	 */
	public static List<SearchResults> findByField2(
		boolean field2, int start, int end,
		OrderByComparator<SearchResults> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByField2(
			field2, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first search results in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search results
	 * @throws NoSuchSearchResultsException if a matching search results could not be found
	 */
	public static SearchResults findByField2_First(
			boolean field2, OrderByComparator<SearchResults> orderByComparator)
		throws com.liferay.training.amf.search.result.exception.
			NoSuchSearchResultsException {

		return getPersistence().findByField2_First(field2, orderByComparator);
	}

	/**
	 * Returns the first search results in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search results, or <code>null</code> if a matching search results could not be found
	 */
	public static SearchResults fetchByField2_First(
		boolean field2, OrderByComparator<SearchResults> orderByComparator) {

		return getPersistence().fetchByField2_First(field2, orderByComparator);
	}

	/**
	 * Returns the last search results in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search results
	 * @throws NoSuchSearchResultsException if a matching search results could not be found
	 */
	public static SearchResults findByField2_Last(
			boolean field2, OrderByComparator<SearchResults> orderByComparator)
		throws com.liferay.training.amf.search.result.exception.
			NoSuchSearchResultsException {

		return getPersistence().findByField2_Last(field2, orderByComparator);
	}

	/**
	 * Returns the last search results in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search results, or <code>null</code> if a matching search results could not be found
	 */
	public static SearchResults fetchByField2_Last(
		boolean field2, OrderByComparator<SearchResults> orderByComparator) {

		return getPersistence().fetchByField2_Last(field2, orderByComparator);
	}

	/**
	 * Returns the search resultses before and after the current search results in the ordered set where field2 = &#63;.
	 *
	 * @param fooId the primary key of the current search results
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next search results
	 * @throws NoSuchSearchResultsException if a search results with the primary key could not be found
	 */
	public static SearchResults[] findByField2_PrevAndNext(
			long fooId, boolean field2,
			OrderByComparator<SearchResults> orderByComparator)
		throws com.liferay.training.amf.search.result.exception.
			NoSuchSearchResultsException {

		return getPersistence().findByField2_PrevAndNext(
			fooId, field2, orderByComparator);
	}

	/**
	 * Removes all the search resultses where field2 = &#63; from the database.
	 *
	 * @param field2 the field2
	 */
	public static void removeByField2(boolean field2) {
		getPersistence().removeByField2(field2);
	}

	/**
	 * Returns the number of search resultses where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the number of matching search resultses
	 */
	public static int countByField2(boolean field2) {
		return getPersistence().countByField2(field2);
	}

	/**
	 * Caches the search results in the entity cache if it is enabled.
	 *
	 * @param searchResults the search results
	 */
	public static void cacheResult(SearchResults searchResults) {
		getPersistence().cacheResult(searchResults);
	}

	/**
	 * Caches the search resultses in the entity cache if it is enabled.
	 *
	 * @param searchResultses the search resultses
	 */
	public static void cacheResult(List<SearchResults> searchResultses) {
		getPersistence().cacheResult(searchResultses);
	}

	/**
	 * Creates a new search results with the primary key. Does not add the search results to the database.
	 *
	 * @param fooId the primary key for the new search results
	 * @return the new search results
	 */
	public static SearchResults create(long fooId) {
		return getPersistence().create(fooId);
	}

	/**
	 * Removes the search results with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fooId the primary key of the search results
	 * @return the search results that was removed
	 * @throws NoSuchSearchResultsException if a search results with the primary key could not be found
	 */
	public static SearchResults remove(long fooId)
		throws com.liferay.training.amf.search.result.exception.
			NoSuchSearchResultsException {

		return getPersistence().remove(fooId);
	}

	public static SearchResults updateImpl(SearchResults searchResults) {
		return getPersistence().updateImpl(searchResults);
	}

	/**
	 * Returns the search results with the primary key or throws a <code>NoSuchSearchResultsException</code> if it could not be found.
	 *
	 * @param fooId the primary key of the search results
	 * @return the search results
	 * @throws NoSuchSearchResultsException if a search results with the primary key could not be found
	 */
	public static SearchResults findByPrimaryKey(long fooId)
		throws com.liferay.training.amf.search.result.exception.
			NoSuchSearchResultsException {

		return getPersistence().findByPrimaryKey(fooId);
	}

	/**
	 * Returns the search results with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fooId the primary key of the search results
	 * @return the search results, or <code>null</code> if a search results with the primary key could not be found
	 */
	public static SearchResults fetchByPrimaryKey(long fooId) {
		return getPersistence().fetchByPrimaryKey(fooId);
	}

	/**
	 * Returns all the search resultses.
	 *
	 * @return the search resultses
	 */
	public static List<SearchResults> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the search resultses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchResultsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of search resultses
	 * @param end the upper bound of the range of search resultses (not inclusive)
	 * @return the range of search resultses
	 */
	public static List<SearchResults> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the search resultses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchResultsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of search resultses
	 * @param end the upper bound of the range of search resultses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of search resultses
	 */
	public static List<SearchResults> findAll(
		int start, int end,
		OrderByComparator<SearchResults> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the search resultses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SearchResultsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of search resultses
	 * @param end the upper bound of the range of search resultses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of search resultses
	 */
	public static List<SearchResults> findAll(
		int start, int end, OrderByComparator<SearchResults> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the search resultses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of search resultses.
	 *
	 * @return the number of search resultses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SearchResultsPersistence getPersistence() {
		return _persistence;
	}

	private static volatile SearchResultsPersistence _persistence;

}