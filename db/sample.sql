create database b3Hex;

show databases;

drop database b3Hex;

create database b3Hex;

use b3Hex;  -- to do all operations inside the b3hex db

CREATE TABLE student(
student_ID INT UNSIGNED NOT NULL,
name VARCHAR(40) NOT NULL,
major VARCHAR(20),
grade VARCHAR(5));

show tables;

describe student;

desc student;

drop table student;

CREATE TABLE student(
student_ID INT UNSIGNED NOT NULL,
name VARCHAR(40) NOT NULL,
major VARCHAR(20),
grade VARCHAR(5));

ALTER TABLE student ADD  phone INT;
ALTER TABLE student ADD PRIMARY KEY (student_ID);

alter table student add country varchar(25) NOT NULL DEFAULT 'India';

CREATE TABLE employees(
employee_id INT,
last_name VARCHAR(25) NOT NULL,
email VARCHAR(25),
CONSTRAINT emp_email_uk UNIQUE(email)
);

describe employees;
ALTER TABLE employees
ALTER last_name SET DEFAULT 'user333';

alter table student drop major;
desc student;

alter table student alter phone SET DEFAULT  12345;


INSERT INTO student  SET student_ID=12, fname= 'user1', grade = 'A' ,phone=456,nation='china';

select * from student;

INSERT INTO student  SET student_ID=45, fname= 'user2', grade = 'c' ;

INSERT INTO student  SET student_ID=222, fname= 'user4444', grade = 'E' ;


ALTER TABLE "table_name" RENAME COLUMN "column 1" TO "column 2";

ALTER TABLE student RENAME COLUMN country TO nation;


INSERT INTO student
VALUES (234,'user1111','B',8709880,'US');

INSERT INTO student (student_ID, fname)
VALUES (2343241, 'abc');

INSERT INTO student
VALUES (23455,'user1111','B',8709880);

SELECT * FROM  student;

--   DAY 2
SELECT nation FROM student;

SELECT * FROM  student WHERE student_ID = 45;
SELECT fname FROM  student WHERE nation = 'US';

SELECT * FROM student;

UPDATE student
SET phone = 4567
WHERE student_ID = 12;

UPDATE student
SET phone = 11111;

SET SQL_SAFE_UPDATES = 0;

UPDATE student
SET grade = 'A' , nation = 'uk'
where student_ID = 45;

DELETE FROM student WHERE student_ID = 2343241;
DELETE FROM student ;

desc student;
desc employees;

ALTER TABLE employees ADD student_ID INT NOT NULL;

ALTER TABLE employees DROP column student_ID;

ALTER TABLE employees ADD student_ID  INT UNSIGNED NOT NULL;

ALTER TABLE employees 
ADD CONSTRAINT student_ID_FK
FOREIGN KEY (student_ID)
REFERENCES student (student_ID);

ALTER TABLE employees
DROP FOREIGN KEY student_ID_FK;

TRUNCATE TABLE student;


create table dhaba (
foodId int unsigned not null,
foodName VARCHAR(20),
quantity int unsigned ,
check(quantity>0)
);

insert into dhaba 
values(1,"pizza",40);
insert into dhaba 
values(2,"pizza",40);
insert into dhaba 
values(4,"BURGER",30);
insert into dhaba 
values(3,"FRIES",20);
insert into dhaba 
values(46,"coke",2);
insert into dhaba 
values(56,"vada",2);
insert into dhaba 
values(11,"pasta",1);
insert into dhaba 
values(99,"lasagne",5);
SELECT * FROM dhaba;

select foodname from dhaba;
select distinct(foodname)  from dhaba;

select foodname as name  from dhaba;

select quantity  qty  from dhaba;

select quantity  "no"  from dhaba;

select count(*) from dhaba;


select max(quantity) from dhaba;


select min(quantity) from dhaba;

SELECT SUM(quantity) FROM dhaba;

SELECT AVG(quantity) FROM dhaba;

show databases;
select  foodName,quantity+100  from dhaba;

select * from dhaba;

select * from dhaba
where quantity  =20 OR quantity = 30;

SELECT * 
FROM dhaba
WHERE foodId BETWEEN 2 AND 46;


SELECT * FROM dhaba
WHERE foodName IN ('pasta','FRIES','vada');

SELECT * FROM dhaba
WHERE quantity IN (40,1,2);

SELECT * FROM dhaba
WHERE quantity NOT IN (40,1,2);

select * from dhaba
where foodName like '%a';

select * from dhaba
order by foodName asc;

