package com.pinnacle.restfulwebservices.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pinnacle.restfulwebservices.bean.Properties;
import com.pinnacle.restfulwebservices.dao.PropertyDAO;
import com.pinnacle.restfulwebservices.exception.PropertyNotFoundException;

@RestController
public class PinnacleController {

	@Autowired
	private PropertyDAO propertyRepository;
	
	@GetMapping(path = "/properties")
	public List<Properties> getProperties() {

		return propertyRepository.findAll();

	}

	@GetMapping(path = "/properties/name/{propertyName}")
	public Optional<Properties> getPropertyByName(@PathVariable String propertyName) {

		Optional<Properties> property = propertyRepository.findByName(propertyName);
		
		if (!property.isPresent()) {
			throw new PropertyNotFoundException("PropertyName: " + propertyName);
		}

		return property;

	}
	
	@GetMapping(path = "/properties/{propertyId}")
	public Optional<Properties> getPropertyByName(@PathVariable Integer propertyId) {

		Optional<Properties> property = propertyRepository.findById(propertyId);
		
		if (!property.isPresent()) {
			throw new PropertyNotFoundException("PropertyName: " + propertyId);
		}

		return property;

	}

	@PostMapping("/properties")
	Properties newProperty(@Valid @RequestBody Properties newProperty) {
		
		
		return propertyRepository.save(newProperty);
	}
	
	  @PutMapping("/properties/{propertyId}")
	  Properties updateProperty(@RequestBody Properties property, @PathVariable Integer propertyId) {

		  Optional<Properties> existingProperty = propertyRepository.findById(propertyId);
			
			if (!existingProperty.isPresent()) {
				throw new PropertyNotFoundException("PropertyID: " + propertyId);
			} 

			return propertyRepository.save(property);

			//return ResponseEntity.noContent().build();
	  }
	  
	  @DeleteMapping("/properties/{propertyId}")
	  void deleteEmployee(@PathVariable Integer propertyId) {
		  propertyRepository.deleteById(propertyId);
	  }

}
