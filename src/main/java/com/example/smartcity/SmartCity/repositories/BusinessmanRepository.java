package com.example.smartcity.SmartCity.repositories;

import com.example.smartcity.SmartCity.entities.Businessman;
import com.example.smartcity.SmartCity.entities.Registration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessmanRepository extends CrudRepository<Businessman, Long> {
    Businessman findByUsername(String username);
}
