

alter table Person add column address_id int(100);


create table Person_Address ( address_id int(100) not null auto_increment, address_line1 varchar(200) not null, address_line2 varchar(200), city varchar(200) not null, state varchar(200) , country varchar(200) , Primary key (address_id));

alter table Person add  Foreign Key(address_id) References Person_Address(address_id);

create table  Course ( course_id int(100) not null auto_increment, course_Name varchar(200) not null, course_desc varchar(800) not null,start_date timestamp, end_date timestamp , Primary Key (course_id) );

create table Student (student_Id int(100) not null auto_increment, student_user_id varchar(200), personId int(100) not null, student_email varchar(100) not null, student_type varchar(100) not null, Primary key(student_Id) );


 create table Campus ( campusId int(100) not null , campus_name varchar(200) , campus_code varchar(100) not null );
  ALTER TABLE Campus add primary key(campusId);
  ALTER TABLE Campus modify column campusId int(100) auto_increment;


 create table Student_course (student_Id int(100) not null, course_id int(100) not null, campus_Id int(100 ) not null );

 alter table Student_course add FOREIGN key (student_Id) references Student(student_Id);
 alter table Student_course add FOREIGN key (course_id) references Course(course_id);
 alter table Student_course add FOREIGN key (campus_id) references Campus(campusId);

 alter table Student_course add  UNIQUE key uk  (campus_id,student_Id,course_id) ;
 alter table Student_course add  PRIMARY key pk  (campus_id,course_id) ;




