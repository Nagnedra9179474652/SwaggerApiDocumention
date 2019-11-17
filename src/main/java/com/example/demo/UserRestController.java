package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
public class UserRestController {

	ConcurrentMap<String, Student> student = new ConcurrentHashMap<>();

	@GetMapping("/{userId}")
	@ApiOperation(value = "", notes = "provide an id to look up specific contact from address book", response = Student.class)
	public Student getUser(@PathVariable String userId) {
		return student.get(userId);
	}

	@GetMapping("/")
	public List<Student> getAllUser() {
		return new ArrayList<Student>(student.values());
	}

	@PostMapping("/")
	public Student createUser(@RequestBody Student st) {
		return student.put(st.getId(), st);
	}

}
