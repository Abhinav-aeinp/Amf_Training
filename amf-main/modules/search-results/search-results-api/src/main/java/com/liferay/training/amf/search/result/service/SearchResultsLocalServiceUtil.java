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

package com.liferay.training.amf.search.result.service;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.amf.search.result.model.SearchResults;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SearchResults. This utility wraps
 * <code>com.liferay.training.amf.search.result.service.impl.SearchResultsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SearchResultsLocalService
 * @generated
 */
public class SearchResultsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.amf.search.result.service.impl.SearchResultsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the search results to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SearchResultsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param searchResults the search results
	 * @return the search results that was added
	 */
	public static SearchResults addSearchResults(SearchResults searchResults) {
		return getService().addSearchResults(searchResults);
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
	 * Creates a new search results with the primary key. Does not add the search results to the database.
	 *
	 * @param fooId the primary key for the new search results
	 * @return the new search results
	 */
	public static SearchResults createSearchResults(long fooId) {
		return getService().createSearchResults(fooId);
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
	 * Deletes the search results with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SearchResultsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fooId the primary key of the search results
	 * @return the search results that was removed
	 * @throws PortalException if a search results with the primary key could not be found
	 */
	public static SearchResults deleteSearchResults(long fooId)
		throws PortalException {

		return getService().deleteSearchResults(fooId);
	}

	/**
	 * Deletes the search results from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SearchResultsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param searchResults the search results
	 * @return the search results that was removed
	 */
	public static SearchResults deleteSearchResults(
		SearchResults searchResults) {

		return getService().deleteSearchResults(searchResults);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.amf.search.result.model.impl.SearchResultsModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.amf.search.result.model.impl.SearchResultsModelImpl</code>.
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

	public static SearchResults fetchSearchResults(long fooId) {
		return getService().fetchSearchResults(fooId);
	}

	/**
	 * Returns the search results matching the UUID and group.
	 *
	 * @param uuid the search results's UUID
	 * @param groupId the primary key of the group
	 * @return the matching search results, or <code>null</code> if a matching search results could not be found
	 */
	public static SearchResults fetchSearchResultsByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchSearchResultsByUuidAndGroupId(uuid, groupId);
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
	 * Returns the search results with the primary key.
	 *
	 * @param fooId the primary key of the search results
	 * @return the search results
	 * @throws PortalException if a search results with the primary key could not be found
	 */
	public static SearchResults getSearchResults(long fooId)
		throws PortalException {

		return getService().getSearchResults(fooId);
	}

	/**
	 * Returns the search results matching the UUID and group.
	 *
	 * @param uuid the search results's UUID
	 * @param groupId the primary key of the group
	 * @return the matching search results
	 * @throws PortalException if a matching search results could not be found
	 */
	public static SearchResults getSearchResultsByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getSearchResultsByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the search resultses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.amf.search.result.model.impl.SearchResultsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of search resultses
	 * @param end the upper bound of the range of search resultses (not inclusive)
	 * @return the range of search resultses
	 */
	public static List<SearchResults> getSearchResultses(int start, int end) {
		return getService().getSearchResultses(start, end);
	}

	/**
	 * Returns all the search resultses matching the UUID and company.
	 *
	 * @param uuid the UUID of the search resultses
	 * @param companyId the primary key of the company
	 * @return the matching search resultses, or an empty list if no matches were found
	 */
	public static List<SearchResults> getSearchResultsesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getSearchResultsesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of search resultses matching the UUID and company.
	 *
	 * @param uuid the UUID of the search resultses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of search resultses
	 * @param end the upper bound of the range of search resultses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching search resultses, or an empty list if no matches were found
	 */
	public static List<SearchResults> getSearchResultsesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SearchResults> orderByComparator) {

		return getService().getSearchResultsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of search resultses.
	 *
	 * @return the number of search resultses
	 */
	public static int getSearchResultsesCount() {
		return getService().getSearchResultsesCount();
	}

	/**
	 * Updates the search results in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SearchResultsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param searchResults the search results
	 * @return the search results that was updated
	 */
	public static SearchResults updateSearchResults(
		SearchResults searchResults) {

		return getService().updateSearchResults(searchResults);
	}

	public static SearchResultsLocalService getService() {
		return _service;
	}

	private static volatile SearchResultsLocalService _service;

}