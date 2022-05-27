<%@ include file="/init.jsp" %>

<portlet:renderURL var="viewAdminEventsURL">
</portlet:renderURL>

<liferay-ui:tabs param="currTab" names="All,Registration,Login"
	refresh="true" url="${viewAdminEventsURL}">
	<div>
		<liferay-ui:search-container searchContainer="${displayAdminEvents}"
			iteratorURL="${portletURL}">
			<liferay-ui:search-container-row
				className="com.liferay.training.admin.monitor.model.StoreEvents"
				modelVar="storeEvents">
				<liferay-ui:search-container-column-date name="Date-Time"
					value="${storeEvents.getLogged()}" />

				<liferay-ui:search-container-column-text name="Username"
					value="${storeEvents.getUserName()}" />

				<liferay-ui:search-container-column-text name="User ID"
					value="(${storeEvents.getUserId()})" />

				<liferay-ui:search-container-column-text name="Request IP"
					value="${storeEvents.getRequestIp()}" />

				<liferay-ui:search-container-column-text name="Event"
					value="${storeEvents.getEventType()}" />

			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator markupView="lexicon" />
		</liferay-ui:search-container>
	</div>
</liferay-ui:tabs>