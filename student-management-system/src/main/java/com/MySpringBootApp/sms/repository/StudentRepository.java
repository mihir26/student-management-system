package com.MySpringBootApp.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import  com.MySpringBootApp.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
