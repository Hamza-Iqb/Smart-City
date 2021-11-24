package com.example.smartcity.SmartCity.repositories;

import com.example.smartcity.SmartCity.entities.Registration;
import com.example.smartcity.SmartCity.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findByUsername(String username);
}
