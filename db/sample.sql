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
