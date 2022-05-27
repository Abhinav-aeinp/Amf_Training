<%@ include file="/init.jsp" %>

<c:if test="${not empty zipCode}">
	<liferay-ui:message key="Search Results for ${zipCode}"/>
</c:if>

<div>
	<liferay-ui:search-container
		searchContainer="${displayResultsContainer}" >
		<liferay-ui:search-container-row
			className="com.liferay.portal.kernel.model.User"
			modelVar="user">
			<liferay-ui:search-container-column-text name="First Name"
				value="${user.getFirstName()}" />

			<liferay-ui:search-container-column-text name="Last Initial"
				value="${user.getLastName().charAt(0)}." />

			<liferay-ui:search-container-column-text name="User ID"
				value="(${user.getUserId()})" />

			<liferay-ui:search-container-column-text name="Email"
				value="${user.getEmailAddress()}" />

		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator markupView="lexicon" />
	</liferay-ui:search-container>
</div>