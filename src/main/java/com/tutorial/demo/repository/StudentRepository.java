package com.tutorial.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.demo.entity.Student;


public interface StudentRepository extends JpaRepository<Student,Long>{

}
