create index IX_43A1E50F on SearchResults_SearchResults (field2);
create index IX_8AEF3357 on SearchResults_SearchResults (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_BC8AA399 on SearchResults_SearchResults (uuid_[$COLUMN_LENGTH:75$], groupId);