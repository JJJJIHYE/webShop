create table t_member( 
  id varchar(10) primary key,
  pwd varchar2(20), 
  name varchar2(50) ,
  email varchar2(20),
  joinDate date 
);


insert into t_member values('jjae','1234','지혜','potere22@naver.com', sysdate);

select*from t_member;

commit

create table member( 
  mid number primary key,
  mpassword varchar2(20), 
  mname varchar2(50) ,
  phone varchar2(20) ,
  address varchar2(100),
  email varchar2(20)
);

insert into member 
values(3, '1234', 'jihye','010-1234-1234' ,
     '서울시 강서구 마곡동', 'jihye22@naver.com'); 
     
select * from  member;