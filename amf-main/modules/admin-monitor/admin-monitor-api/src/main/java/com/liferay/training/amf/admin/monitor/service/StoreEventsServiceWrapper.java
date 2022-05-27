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
 * Provides a wrapper for {@link StoreEventsService}.
 *
 * @author Brian Wing Shun Chan
 * @see StoreEventsService
 * @generated
 */
public class StoreEventsServiceWrapper
	implements ServiceWrapper<StoreEventsService>, StoreEventsService {

	public StoreEventsServiceWrapper(StoreEventsService storeEventsService) {
		_storeEventsService = storeEventsService;
	}

	@Override
	public boolean checkPermissions(
			long groupId, String resourceName, String primaryKey,
			String actionId)
		throws com.liferay.portal.kernel.security.auth.PrincipalException {

		return _storeEventsService.checkPermissions(
			groupId, resourceName, primaryKey, actionId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _storeEventsService.getOSGiServiceIdentifier();
	}

	@Override
	public StoreEventsService getWrappedService() {
		return _storeEventsService;
	}

	@Override
	public void setWrappedService(StoreEventsService storeEventsService) {
		_storeEventsService = storeEventsService;
	}

	private StoreEventsService _storeEventsService;

}