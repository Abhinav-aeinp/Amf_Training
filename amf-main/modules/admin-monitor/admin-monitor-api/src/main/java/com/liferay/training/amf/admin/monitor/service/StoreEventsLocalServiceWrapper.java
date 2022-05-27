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

package com.liferay.training.amf.admin.monitor.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StoreEventsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see StoreEventsLocalService
 * @generated
 */
public class StoreEventsLocalServiceWrapper
	implements ServiceWrapper<StoreEventsLocalService>,
			   StoreEventsLocalService {

	public StoreEventsLocalServiceWrapper(
		StoreEventsLocalService storeEventsLocalService) {

		_storeEventsLocalService = storeEventsLocalService;
	}

	/**
	 * Adds the store events to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StoreEventsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param storeEvents the store events
	 * @return the store events that was added
	 */
	@Override
	public com.liferay.training.amf.admin.monitor.model.StoreEvents
		addStoreEvents(
			com.liferay.training.amf.admin.monitor.model.StoreEvents
				storeEvents) {

		return _storeEventsLocalService.addStoreEvents(storeEvents);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _storeEventsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new store events with the primary key. Does not add the store events to the database.
	 *
	 * @param eventId the primary key for the new store events
	 * @return the new store events
	 */
	@Override
	public com.liferay.training.amf.admin.monitor.model.StoreEvents
		createStoreEvents(long eventId) {

		return _storeEventsLocalService.createStoreEvents(eventId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _storeEventsLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the store events with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StoreEventsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param eventId the primary key of the store events
	 * @return the store events that was removed
	 * @throws PortalException if a store events with the primary key could not be found
	 */
	@Override
	public com.liferay.training.amf.admin.monitor.model.StoreEvents
			deleteStoreEvents(long eventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _storeEventsLocalService.deleteStoreEvents(eventId);
	}

	/**
	 * Deletes the store events from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StoreEventsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param storeEvents the store events
	 * @return the store events that was removed
	 */
	@Override
	public com.liferay.training.amf.admin.monitor.model.StoreEvents
		deleteStoreEvents(
			com.liferay.training.amf.admin.monitor.model.StoreEvents
				storeEvents) {

		return _storeEventsLocalService.deleteStoreEvents(storeEvents);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _storeEventsLocalService.dynamicQuery();
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

		return _storeEventsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.amf.admin.monitor.model.impl.StoreEventsModelImpl</code>.
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

		return _storeEventsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.amf.admin.monitor.model.impl.StoreEventsModelImpl</code>.
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

		return _storeEventsLocalService.dynamicQuery(
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

		return _storeEventsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _storeEventsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.amf.admin.monitor.model.StoreEvents
		fetchStoreEvents(long eventId) {

		return _storeEventsLocalService.fetchStoreEvents(eventId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _storeEventsLocalService.getActionableDynamicQuery();
	}

	@Override
	public int getEventCount(String eventType) {
		return _storeEventsLocalService.getEventCount(eventType);
	}

	@Override
	public java.util.List
		<com.liferay.training.amf.admin.monitor.model.StoreEvents> getEvents(
			String eventType, int start, int end) {

		return _storeEventsLocalService.getEvents(eventType, start, end);
	}

	@Override
	public java.util.List
		<com.liferay.training.amf.admin.monitor.model.StoreEvents>
			getEventsByUser(String eventType, long userId, int start, int end) {

		return _storeEventsLocalService.getEventsByUser(
			eventType, userId, start, end);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _storeEventsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _storeEventsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _storeEventsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the store events with the primary key.
	 *
	 * @param eventId the primary key of the store events
	 * @return the store events
	 * @throws PortalException if a store events with the primary key could not be found
	 */
	@Override
	public com.liferay.training.amf.admin.monitor.model.StoreEvents
			getStoreEvents(long eventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _storeEventsLocalService.getStoreEvents(eventId);
	}

	/**
	 * Returns a range of all the store eventses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.amf.admin.monitor.model.impl.StoreEventsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of store eventses
	 * @param end the upper bound of the range of store eventses (not inclusive)
	 * @return the range of store eventses
	 */
	@Override
	public java.util.List
		<com.liferay.training.amf.admin.monitor.model.StoreEvents>
			getStoreEventses(int start, int end) {

		return _storeEventsLocalService.getStoreEventses(start, end);
	}

	/**
	 * Returns the number of store eventses.
	 *
	 * @return the number of store eventses
	 */
	@Override
	public int getStoreEventsesCount() {
		return _storeEventsLocalService.getStoreEventsesCount();
	}

	@Override
	public int getUserEventCount(String eventType, long userId) {
		return _storeEventsLocalService.getUserEventCount(eventType, userId);
	}

	@Override
	public void setEventFields(
		com.liferay.portal.kernel.model.User user,
		com.liferay.training.amf.admin.monitor.model.StoreEvents storeEvent,
		String eventType) {

		_storeEventsLocalService.setEventFields(user, storeEvent, eventType);
	}

	/**
	 * Updates the store events in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StoreEventsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param storeEvents the store events
	 * @return the store events that was updated
	 */
	@Override
	public com.liferay.training.amf.admin.monitor.model.StoreEvents
		updateStoreEvents(
			com.liferay.training.amf.admin.monitor.model.StoreEvents
				storeEvents) {

		return _storeEventsLocalService.updateStoreEvents(storeEvents);
	}

	@Override
	public StoreEventsLocalService getWrappedService() {
		return _storeEventsLocalService;
	}

	@Override
	public void setWrappedService(
		StoreEventsLocalService storeEventsLocalService) {

		_storeEventsLocalService = storeEventsLocalService;
	}

	private StoreEventsLocalService _storeEventsLocalService;

}