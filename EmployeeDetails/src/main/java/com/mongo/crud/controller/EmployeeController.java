package com.mongo.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mongo.crud.model.EmployeeModel;
import com.mongo.crud.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/employee/")
public class EmployeeController {
	
	
	@Autowired
	EmployeeRepository empRepo;
	
	@PostMapping
	public ResponseEntity<?> insertData(@RequestBody EmployeeModel empModel) {
		return ResponseEntity.ok(empRepo.save(empModel));
	}
	
	@GetMapping
	public List<EmployeeModel> getAllDetails() {
		return empRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getDataById(@PathVariable int id) {
		return ResponseEntity.ok(empRepo.findById(id));
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateData(@RequestBody EmployeeModel empModel, @PathVariable int id) {	
		return ResponseEntity.ok(empRepo.save(empModel));
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteDataById(@PathVariable int id) {
		empRepo.deleteById(id);
		return ResponseEntity.ok("Data has been deleted from the database Id = " + id);
	}
	
	@DeleteMapping
	public ResponseEntity<?> deleteAllDetails() {
		try {
			empRepo.deleteAll();
			return ResponseEntity.ok("All Data has been deleted");
		}catch (Exception e) {
			return ResponseEntity.ok("Data has not been deleted");
		}
	}
}
