create table StoreEvents_StoreEvents (
	uuid_ VARCHAR(75) null,
	eventId LONG not null primary key,
	logged DATE null,
	userId LONG,
	userName VARCHAR(75) null,
	requestIp VARCHAR(75) null,
	eventType VARCHAR(75) null
);