create index IX_9F477D79 on SearchBox_SearchBox (field2);
create index IX_CD28CF41 on SearchBox_SearchBox (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A96E3203 on SearchBox_SearchBox (uuid_[$COLUMN_LENGTH:75$], groupId);