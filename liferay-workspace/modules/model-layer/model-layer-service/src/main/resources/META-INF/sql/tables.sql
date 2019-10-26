create table School_Student (
	uuid_ VARCHAR(75) null,
	studentId LONG not null primary key,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	fatherName VARCHAR(75) null,
	male BOOLEAN,
	addressId INTEGER,
	dob DATE null,
	email VARCHAR(75) null
);