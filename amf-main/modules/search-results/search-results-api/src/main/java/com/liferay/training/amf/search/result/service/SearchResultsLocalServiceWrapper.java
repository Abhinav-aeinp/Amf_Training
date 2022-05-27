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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SearchResultsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SearchResultsLocalService
 * @generated
 */
public class SearchResultsLocalServiceWrapper
	implements SearchResultsLocalService,
			   ServiceWrapper<SearchResultsLocalService> {

	public SearchResultsLocalServiceWrapper(
		SearchResultsLocalService searchResultsLocalService) {

		_searchResultsLocalService = searchResultsLocalService;
	}

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
	@Override
	public com.liferay.training.amf.search.result.model.SearchResults
		addSearchResults(
			com.liferay.training.amf.search.result.model.SearchResults
				searchResults) {

		return _searchResultsLocalService.addSearchResults(searchResults);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _searchResultsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new search results with the primary key. Does not add the search results to the database.
	 *
	 * @param fooId the primary key for the new search results
	 * @return the new search results
	 */
	@Override
	public com.liferay.training.amf.search.result.model.SearchResults
		createSearchResults(long fooId) {

		return _searchResultsLocalService.createSearchResults(fooId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _searchResultsLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.liferay.training.amf.search.result.model.SearchResults
			deleteSearchResults(long fooId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _searchResultsLocalService.deleteSearchResults(fooId);
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
	@Override
	public com.liferay.training.amf.search.result.model.SearchResults
		deleteSearchResults(
			com.liferay.training.amf.search.result.model.SearchResults
				searchResults) {

		return _searchResultsLocalService.deleteSearchResults(searchResults);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _searchResultsLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _searchResultsLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _searchResultsLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _searchResultsLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _searchResultsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _searchResultsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.amf.search.result.model.SearchResults
		fetchSearchResults(long fooId) {

		return _searchResultsLocalService.fetchSearchResults(fooId);
	}

	/**
	 * Returns the search results matching the UUID and group.
	 *
	 * @param uuid the search results's UUID
	 * @param groupId the primary key of the group
	 * @return the matching search results, or <code>null</code> if a matching search results could not be found
	 */
	@Override
	public com.liferay.training.amf.search.result.model.SearchResults
		fetchSearchResultsByUuidAndGroupId(String uuid, long groupId) {

		return _searchResultsLocalService.fetchSearchResultsByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _searchResultsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _searchResultsLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _searchResultsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _searchResultsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _searchResultsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the search results with the primary key.
	 *
	 * @param fooId the primary key of the search results
	 * @return the search results
	 * @throws PortalException if a search results with the primary key could not be found
	 */
	@Override
	public com.liferay.training.amf.search.result.model.SearchResults
			getSearchResults(long fooId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _searchResultsLocalService.getSearchResults(fooId);
	}

	/**
	 * Returns the search results matching the UUID and group.
	 *
	 * @param uuid the search results's UUID
	 * @param groupId the primary key of the group
	 * @return the matching search results
	 * @throws PortalException if a matching search results could not be found
	 */
	@Override
	public com.liferay.training.amf.search.result.model.SearchResults
			getSearchResultsByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _searchResultsLocalService.getSearchResultsByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List
		<com.liferay.training.amf.search.result.model.SearchResults>
			getSearchResultses(int start, int end) {

		return _searchResultsLocalService.getSearchResultses(start, end);
	}

	/**
	 * Returns all the search resultses matching the UUID and company.
	 *
	 * @param uuid the UUID of the search resultses
	 * @param companyId the primary key of the company
	 * @return the matching search resultses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.liferay.training.amf.search.result.model.SearchResults>
			getSearchResultsesByUuidAndCompanyId(String uuid, long companyId) {

		return _searchResultsLocalService.getSearchResultsesByUuidAndCompanyId(
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
	@Override
	public java.util.List
		<com.liferay.training.amf.search.result.model.SearchResults>
			getSearchResultsesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.training.amf.search.result.model.SearchResults>
						orderByComparator) {

		return _searchResultsLocalService.getSearchResultsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of search resultses.
	 *
	 * @return the number of search resultses
	 */
	@Override
	public int getSearchResultsesCount() {
		return _searchResultsLocalService.getSearchResultsesCount();
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
	@Override
	public com.liferay.training.amf.search.result.model.SearchResults
		updateSearchResults(
			com.liferay.training.amf.search.result.model.SearchResults
				searchResults) {

		return _searchResultsLocalService.updateSearchResults(searchResults);
	}

	@Override
	public SearchResultsLocalService getWrappedService() {
		return _searchResultsLocalService;
	}

	@Override
	public void setWrappedService(
		SearchResultsLocalService searchResultsLocalService) {

		_searchResultsLocalService = searchResultsLocalService;
	}

	private SearchResultsLocalService _searchResultsLocalService;

}