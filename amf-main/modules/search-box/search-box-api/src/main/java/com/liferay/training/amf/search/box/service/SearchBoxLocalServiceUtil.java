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

package com.liferay.training.amf.search.box.service;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.amf.search.box.model.SearchBox;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SearchBox. This utility wraps
 * <code>com.liferay.training.amf.search.box.service.impl.SearchBoxLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SearchBoxLocalService
 * @generated
 */
public class SearchBoxLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.amf.search.box.service.impl.SearchBoxLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the search box to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SearchBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param searchBox the search box
	 * @return the search box that was added
	 */
	public static SearchBox addSearchBox(SearchBox searchBox) {
		return getService().addSearchBox(searchBox);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new search box with the primary key. Does not add the search box to the database.
	 *
	 * @param fooId the primary key for the new search box
	 * @return the new search box
	 */
	public static SearchBox createSearchBox(long fooId) {
		return getService().createSearchBox(fooId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the search box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SearchBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fooId the primary key of the search box
	 * @return the search box that was removed
	 * @throws PortalException if a search box with the primary key could not be found
	 */
	public static SearchBox deleteSearchBox(long fooId) throws PortalException {
		return getService().deleteSearchBox(fooId);
	}

	/**
	 * Deletes the search box from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SearchBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param searchBox the search box
	 * @return the search box that was removed
	 */
	public static SearchBox deleteSearchBox(SearchBox searchBox) {
		return getService().deleteSearchBox(searchBox);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.amf.search.box.model.impl.SearchBoxModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.amf.search.box.model.impl.SearchBoxModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static SearchBox fetchSearchBox(long fooId) {
		return getService().fetchSearchBox(fooId);
	}

	/**
	 * Returns the search box matching the UUID and group.
	 *
	 * @param uuid the search box's UUID
	 * @param groupId the primary key of the group
	 * @return the matching search box, or <code>null</code> if a matching search box could not be found
	 */
	public static SearchBox fetchSearchBoxByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchSearchBoxByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the search box with the primary key.
	 *
	 * @param fooId the primary key of the search box
	 * @return the search box
	 * @throws PortalException if a search box with the primary key could not be found
	 */
	public static SearchBox getSearchBox(long fooId) throws PortalException {
		return getService().getSearchBox(fooId);
	}

	/**
	 * Returns the search box matching the UUID and group.
	 *
	 * @param uuid the search box's UUID
	 * @param groupId the primary key of the group
	 * @return the matching search box
	 * @throws PortalException if a matching search box could not be found
	 */
	public static SearchBox getSearchBoxByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getSearchBoxByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the search boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.amf.search.box.model.impl.SearchBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of search boxes
	 * @param end the upper bound of the range of search boxes (not inclusive)
	 * @return the range of search boxes
	 */
	public static List<SearchBox> getSearchBoxes(int start, int end) {
		return getService().getSearchBoxes(start, end);
	}

	/**
	 * Returns all the search boxes matching the UUID and company.
	 *
	 * @param uuid the UUID of the search boxes
	 * @param companyId the primary key of the company
	 * @return the matching search boxes, or an empty list if no matches were found
	 */
	public static List<SearchBox> getSearchBoxesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getSearchBoxesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of search boxes matching the UUID and company.
	 *
	 * @param uuid the UUID of the search boxes
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of search boxes
	 * @param end the upper bound of the range of search boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching search boxes, or an empty list if no matches were found
	 */
	public static List<SearchBox> getSearchBoxesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SearchBox> orderByComparator) {

		return getService().getSearchBoxesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of search boxes.
	 *
	 * @return the number of search boxes
	 */
	public static int getSearchBoxesCount() {
		return getService().getSearchBoxesCount();
	}

	/**
	 * Updates the search box in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SearchBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param searchBox the search box
	 * @return the search box that was updated
	 */
	public static SearchBox updateSearchBox(SearchBox searchBox) {
		return getService().updateSearchBox(searchBox);
	}

	public static SearchBoxLocalService getService() {
		return _service;
	}

	private static volatile SearchBoxLocalService _service;

}