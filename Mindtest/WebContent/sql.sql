

create table members(
	Email varchar2(30),
	Id varchar2(20),
	Pw varchar2(20),
	Nick varchar2(20),
	Address varchar2(100)
);

insert into members values('admin', 'admin', '1234', 'admin', 'admin');

select * from MEMBERS

insert into members values('test1','test1','1234','test1','광주광역시')