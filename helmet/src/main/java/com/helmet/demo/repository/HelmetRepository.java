package com.helmet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helmet.demo.model.HelmetModel;

@Repository
public interface HelmetRepository extends JpaRepository<HelmetModel,Integer> {
 
}
