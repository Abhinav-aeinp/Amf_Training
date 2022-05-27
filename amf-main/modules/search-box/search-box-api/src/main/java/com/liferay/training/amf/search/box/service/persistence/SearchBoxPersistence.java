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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.training.amf.search.box.exception.NoSuchSearchBoxException;
import com.liferay.training.amf.search.box.model.SearchBox;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the search box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SearchBoxUtil
 * @generated
 */
@ProviderType
public interface SearchBoxPersistence extends BasePersistence<SearchBox> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SearchBoxUtil} to access the search box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the search boxes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching search boxes
	 */
	public java.util.List<SearchBox> findByUuid(String uuid);

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
	public java.util.List<SearchBox> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<SearchBox> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
			orderByComparator);

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
	public java.util.List<SearchBox> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first search box in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search box
	 * @throws NoSuchSearchBoxException if a matching search box could not be found
	 */
	public SearchBox findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
				orderByComparator)
		throws NoSuchSearchBoxException;

	/**
	 * Returns the first search box in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search box, or <code>null</code> if a matching search box could not be found
	 */
	public SearchBox fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
			orderByComparator);

	/**
	 * Returns the last search box in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search box
	 * @throws NoSuchSearchBoxException if a matching search box could not be found
	 */
	public SearchBox findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
				orderByComparator)
		throws NoSuchSearchBoxException;

	/**
	 * Returns the last search box in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search box, or <code>null</code> if a matching search box could not be found
	 */
	public SearchBox fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
			orderByComparator);

	/**
	 * Returns the search boxes before and after the current search box in the ordered set where uuid = &#63;.
	 *
	 * @param fooId the primary key of the current search box
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next search box
	 * @throws NoSuchSearchBoxException if a search box with the primary key could not be found
	 */
	public SearchBox[] findByUuid_PrevAndNext(
			long fooId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
				orderByComparator)
		throws NoSuchSearchBoxException;

	/**
	 * Removes all the search boxes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of search boxes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching search boxes
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the search box where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSearchBoxException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching search box
	 * @throws NoSuchSearchBoxException if a matching search box could not be found
	 */
	public SearchBox findByUUID_G(String uuid, long groupId)
		throws NoSuchSearchBoxException;

	/**
	 * Returns the search box where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching search box, or <code>null</code> if a matching search box could not be found
	 */
	public SearchBox fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the search box where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching search box, or <code>null</code> if a matching search box could not be found
	 */
	public SearchBox fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the search box where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the search box that was removed
	 */
	public SearchBox removeByUUID_G(String uuid, long groupId)
		throws NoSuchSearchBoxException;

	/**
	 * Returns the number of search boxes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching search boxes
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the search boxes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching search boxes
	 */
	public java.util.List<SearchBox> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<SearchBox> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<SearchBox> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
			orderByComparator);

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
	public java.util.List<SearchBox> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first search box in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search box
	 * @throws NoSuchSearchBoxException if a matching search box could not be found
	 */
	public SearchBox findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
				orderByComparator)
		throws NoSuchSearchBoxException;

	/**
	 * Returns the first search box in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search box, or <code>null</code> if a matching search box could not be found
	 */
	public SearchBox fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
			orderByComparator);

	/**
	 * Returns the last search box in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search box
	 * @throws NoSuchSearchBoxException if a matching search box could not be found
	 */
	public SearchBox findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
				orderByComparator)
		throws NoSuchSearchBoxException;

	/**
	 * Returns the last search box in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search box, or <code>null</code> if a matching search box could not be found
	 */
	public SearchBox fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
			orderByComparator);

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
	public SearchBox[] findByUuid_C_PrevAndNext(
			long fooId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
				orderByComparator)
		throws NoSuchSearchBoxException;

	/**
	 * Removes all the search boxes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of search boxes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching search boxes
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the search boxes where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the matching search boxes
	 */
	public java.util.List<SearchBox> findByField2(boolean field2);

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
	public java.util.List<SearchBox> findByField2(
		boolean field2, int start, int end);

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
	public java.util.List<SearchBox> findByField2(
		boolean field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
			orderByComparator);

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
	public java.util.List<SearchBox> findByField2(
		boolean field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first search box in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search box
	 * @throws NoSuchSearchBoxException if a matching search box could not be found
	 */
	public SearchBox findByField2_First(
			boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
				orderByComparator)
		throws NoSuchSearchBoxException;

	/**
	 * Returns the first search box in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching search box, or <code>null</code> if a matching search box could not be found
	 */
	public SearchBox fetchByField2_First(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
			orderByComparator);

	/**
	 * Returns the last search box in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search box
	 * @throws NoSuchSearchBoxException if a matching search box could not be found
	 */
	public SearchBox findByField2_Last(
			boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
				orderByComparator)
		throws NoSuchSearchBoxException;

	/**
	 * Returns the last search box in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching search box, or <code>null</code> if a matching search box could not be found
	 */
	public SearchBox fetchByField2_Last(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
			orderByComparator);

	/**
	 * Returns the search boxes before and after the current search box in the ordered set where field2 = &#63;.
	 *
	 * @param fooId the primary key of the current search box
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next search box
	 * @throws NoSuchSearchBoxException if a search box with the primary key could not be found
	 */
	public SearchBox[] findByField2_PrevAndNext(
			long fooId, boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
				orderByComparator)
		throws NoSuchSearchBoxException;

	/**
	 * Removes all the search boxes where field2 = &#63; from the database.
	 *
	 * @param field2 the field2
	 */
	public void removeByField2(boolean field2);

	/**
	 * Returns the number of search boxes where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the number of matching search boxes
	 */
	public int countByField2(boolean field2);

	/**
	 * Caches the search box in the entity cache if it is enabled.
	 *
	 * @param searchBox the search box
	 */
	public void cacheResult(SearchBox searchBox);

	/**
	 * Caches the search boxes in the entity cache if it is enabled.
	 *
	 * @param searchBoxes the search boxes
	 */
	public void cacheResult(java.util.List<SearchBox> searchBoxes);

	/**
	 * Creates a new search box with the primary key. Does not add the search box to the database.
	 *
	 * @param fooId the primary key for the new search box
	 * @return the new search box
	 */
	public SearchBox create(long fooId);

	/**
	 * Removes the search box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fooId the primary key of the search box
	 * @return the search box that was removed
	 * @throws NoSuchSearchBoxException if a search box with the primary key could not be found
	 */
	public SearchBox remove(long fooId) throws NoSuchSearchBoxException;

	public SearchBox updateImpl(SearchBox searchBox);

	/**
	 * Returns the search box with the primary key or throws a <code>NoSuchSearchBoxException</code> if it could not be found.
	 *
	 * @param fooId the primary key of the search box
	 * @return the search box
	 * @throws NoSuchSearchBoxException if a search box with the primary key could not be found
	 */
	public SearchBox findByPrimaryKey(long fooId)
		throws NoSuchSearchBoxException;

	/**
	 * Returns the search box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fooId the primary key of the search box
	 * @return the search box, or <code>null</code> if a search box with the primary key could not be found
	 */
	public SearchBox fetchByPrimaryKey(long fooId);

	/**
	 * Returns all the search boxes.
	 *
	 * @return the search boxes
	 */
	public java.util.List<SearchBox> findAll();

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
	public java.util.List<SearchBox> findAll(int start, int end);

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
	public java.util.List<SearchBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
			orderByComparator);

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
	public java.util.List<SearchBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchBox>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the search boxes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of search boxes.
	 *
	 * @return the number of search boxes
	 */
	public int countAll();

}