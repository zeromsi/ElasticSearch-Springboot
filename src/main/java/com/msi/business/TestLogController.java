package com.msi.business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.msi.data.TestLog;
import com.msi.repository.TestLogRepository;



@CrossOrigin
@RestController
@RequestMapping("tests")
public class TestLogController {
	
	@Autowired
	TestLogRepository testRepository;
	
	@GetMapping
	public List<TestLog> all() {
		Iterator<TestLog> iterator=testRepository.findAll().iterator();
		List<TestLog> students=new ArrayList<>();
		while(iterator.hasNext()) {
			students.add(iterator.next());
		}
		return students;
	}
	
	@PostMapping
	public boolean add(@RequestBody TestLog student) {
		try {
			testRepository.save(student);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	@GetMapping("/{id}")
	public Optional<TestLog> findById(@PathVariable String id) {
		return testRepository.findById(id);
	}


}
