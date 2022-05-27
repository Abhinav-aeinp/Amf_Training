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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.training.amf.search.result.exception.NoSuchSearchResultsException;
import com.liferay.training.amf.search.result.model.SearchResults;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the search results service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SearchResultsUtil
 * @generated
 */
@ProviderType
public interface SearchResultsPersistence
	extends BasePersistence<SearchResults> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SearchResultsUtil} to access the search results persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the search resultses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching search resultses
	 */
	public java.util.List<SearchResults> findByUuid(String uuid);

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
	public java.util.List<SearchResults> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<SearchResults> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
			orderByComparator);

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
	public java.util.List<SearchResults> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first search results in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search results
	 * @throws NoSuchSearchResultsException if a matching search results could not be found
	 */
	public SearchResults findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
				orderByComparator)
		throws NoSuchSearchResultsException;

	/**
	 * Returns the first search results in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search results, or <code>null</code> if a matching search results could not be found
	 */
	public SearchResults fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
			orderByComparator);

	/**
	 * Returns the last search results in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search results
	 * @throws NoSuchSearchResultsException if a matching search results could not be found
	 */
	public SearchResults findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
				orderByComparator)
		throws NoSuchSearchResultsException;

	/**
	 * Returns the last search results in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search results, or <code>null</code> if a matching search results could not be found
	 */
	public SearchResults fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
			orderByComparator);

	/**
	 * Returns the search resultses before and after the current search results in the ordered set where uuid = &#63;.
	 *
	 * @param fooId the primary key of the current search results
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next search results
	 * @throws NoSuchSearchResultsException if a search results with the primary key could not be found
	 */
	public SearchResults[] findByUuid_PrevAndNext(
			long fooId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
				orderByComparator)
		throws NoSuchSearchResultsException;

	/**
	 * Removes all the search resultses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of search resultses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching search resultses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the search results where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSearchResultsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching search results
	 * @throws NoSuchSearchResultsException if a matching search results could not be found
	 */
	public SearchResults findByUUID_G(String uuid, long groupId)
		throws NoSuchSearchResultsException;

	/**
	 * Returns the search results where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching search results, or <code>null</code> if a matching search results could not be found
	 */
	public SearchResults fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the search results where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching search results, or <code>null</code> if a matching search results could not be found
	 */
	public SearchResults fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the search results where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the search results that was removed
	 */
	public SearchResults removeByUUID_G(String uuid, long groupId)
		throws NoSuchSearchResultsException;

	/**
	 * Returns the number of search resultses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching search resultses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the search resultses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching search resultses
	 */
	public java.util.List<SearchResults> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<SearchResults> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<SearchResults> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
			orderByComparator);

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
	public java.util.List<SearchResults> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first search results in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search results
	 * @throws NoSuchSearchResultsException if a matching search results could not be found
	 */
	public SearchResults findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
				orderByComparator)
		throws NoSuchSearchResultsException;

	/**
	 * Returns the first search results in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search results, or <code>null</code> if a matching search results could not be found
	 */
	public SearchResults fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
			orderByComparator);

	/**
	 * Returns the last search results in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search results
	 * @throws NoSuchSearchResultsException if a matching search results could not be found
	 */
	public SearchResults findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
				orderByComparator)
		throws NoSuchSearchResultsException;

	/**
	 * Returns the last search results in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search results, or <code>null</code> if a matching search results could not be found
	 */
	public SearchResults fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
			orderByComparator);

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
	public SearchResults[] findByUuid_C_PrevAndNext(
			long fooId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
				orderByComparator)
		throws NoSuchSearchResultsException;

	/**
	 * Removes all the search resultses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of search resultses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching search resultses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the search resultses where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the matching search resultses
	 */
	public java.util.List<SearchResults> findByField2(boolean field2);

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
	public java.util.List<SearchResults> findByField2(
		boolean field2, int start, int end);

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
	public java.util.List<SearchResults> findByField2(
		boolean field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
			orderByComparator);

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
	public java.util.List<SearchResults> findByField2(
		boolean field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first search results in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search results
	 * @throws NoSuchSearchResultsException if a matching search results could not be found
	 */
	public SearchResults findByField2_First(
			boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
				orderByComparator)
		throws NoSuchSearchResultsException;

	/**
	 * Returns the first search results in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search results, or <code>null</code> if a matching search results could not be found
	 */
	public SearchResults fetchByField2_First(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
			orderByComparator);

	/**
	 * Returns the last search results in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search results
	 * @throws NoSuchSearchResultsException if a matching search results could not be found
	 */
	public SearchResults findByField2_Last(
			boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
				orderByComparator)
		throws NoSuchSearchResultsException;

	/**
	 * Returns the last search results in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search results, or <code>null</code> if a matching search results could not be found
	 */
	public SearchResults fetchByField2_Last(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
			orderByComparator);

	/**
	 * Returns the search resultses before and after the current search results in the ordered set where field2 = &#63;.
	 *
	 * @param fooId the primary key of the current search results
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next search results
	 * @throws NoSuchSearchResultsException if a search results with the primary key could not be found
	 */
	public SearchResults[] findByField2_PrevAndNext(
			long fooId, boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
				orderByComparator)
		throws NoSuchSearchResultsException;

	/**
	 * Removes all the search resultses where field2 = &#63; from the database.
	 *
	 * @param field2 the field2
	 */
	public void removeByField2(boolean field2);

	/**
	 * Returns the number of search resultses where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the number of matching search resultses
	 */
	public int countByField2(boolean field2);

	/**
	 * Caches the search results in the entity cache if it is enabled.
	 *
	 * @param searchResults the search results
	 */
	public void cacheResult(SearchResults searchResults);

	/**
	 * Caches the search resultses in the entity cache if it is enabled.
	 *
	 * @param searchResultses the search resultses
	 */
	public void cacheResult(java.util.List<SearchResults> searchResultses);

	/**
	 * Creates a new search results with the primary key. Does not add the search results to the database.
	 *
	 * @param fooId the primary key for the new search results
	 * @return the new search results
	 */
	public SearchResults create(long fooId);

	/**
	 * Removes the search results with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fooId the primary key of the search results
	 * @return the search results that was removed
	 * @throws NoSuchSearchResultsException if a search results with the primary key could not be found
	 */
	public SearchResults remove(long fooId) throws NoSuchSearchResultsException;

	public SearchResults updateImpl(SearchResults searchResults);

	/**
	 * Returns the search results with the primary key or throws a <code>NoSuchSearchResultsException</code> if it could not be found.
	 *
	 * @param fooId the primary key of the search results
	 * @return the search results
	 * @throws NoSuchSearchResultsException if a search results with the primary key could not be found
	 */
	public SearchResults findByPrimaryKey(long fooId)
		throws NoSuchSearchResultsException;

	/**
	 * Returns the search results with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fooId the primary key of the search results
	 * @return the search results, or <code>null</code> if a search results with the primary key could not be found
	 */
	public SearchResults fetchByPrimaryKey(long fooId);

	/**
	 * Returns all the search resultses.
	 *
	 * @return the search resultses
	 */
	public java.util.List<SearchResults> findAll();

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
	public java.util.List<SearchResults> findAll(int start, int end);

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
	public java.util.List<SearchResults> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
			orderByComparator);

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
	public java.util.List<SearchResults> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchResults>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the search resultses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of search resultses.
	 *
	 * @return the number of search resultses
	 */
	public int countAll();

}