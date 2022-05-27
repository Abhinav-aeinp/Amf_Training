<%@ include file="/init.jsp" %>

<liferay-ui:success key="searchSuccess" message="search-succeeded" />
<liferay-ui:error key="searchFailed" message="search-failed" />

<p>
	<b><liferay-ui:message key="search-here"/></b>
</p>

<portlet:actionURL name="/search/box/lookup" var="lookupZipURL" />

<aui:form action="${lookupZipURL}" method="post">
	<aui:input label="Enter India Zip" name="enter-US-zip" type="text" value="${enteredZip}" >
		<aui:validator name="required" errorMessage="Please enter a value."></aui:validator>
		<aui:validator name="number" errorMessage="Value must be a number."></aui:validator>
		<aui:validator name="maxLength" errorMessage="Length must be 6.">6</aui:validator>
		<aui:validator name="minLength" errorMessage="Length must be 6.">6</aui:validator>
	</aui:input>
	<aui:button name="submit" value="Submit" type="submit"/>
</aui:form>