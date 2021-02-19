drop table memberdiary;

create table member(
	id varchar2(20),
	pw varchar2(30),
	name varchar2(20),
	phone number(20)
);


select * from MEMBERdiary

insert into member values('admin','1234','admin',123);

delete * from member where id != 'admin'

create table memberdiary(
	diaryid varchar2(30),
	score number(10),
	m_date varchar2(30)
);

insert into memberdiary values('admin',-2,'21/02/15');

delete memberdiary where m_date='21/02/17'

select score,m_date from memberdiary where diaryid='admin';