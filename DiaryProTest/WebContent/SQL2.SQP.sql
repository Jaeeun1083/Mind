drop table member;
drop table memberdiary;
drop table memberdiary_lmage;


create table member(
	id varchar2(30),
	pw varchar2(30),
	name varchar2(30),
	phone varchar2(30)
);

create table memberdiary(
	id varchar2(20),
	star varchar2(30),
	text varchar2(20),
	m_date date
);

create table memberdiary_lmage(
	id varchar2(30),
	fileName varchar2(200),
	fileRealName varchar2(30),
	m_date date
);


select * from member;

select * from memberdiary;

select * from memberdiary_lmage;






