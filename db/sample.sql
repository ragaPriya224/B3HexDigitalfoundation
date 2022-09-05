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
