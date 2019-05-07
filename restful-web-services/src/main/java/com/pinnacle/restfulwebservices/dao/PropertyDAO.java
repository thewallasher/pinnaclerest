package com.pinnacle.restfulwebservices.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pinnacle.restfulwebservices.bean.Properties;

@Repository
public interface PropertyDAO extends JpaRepository <Properties, Integer> {
	
	Optional<Properties> findByName(String name);

}
