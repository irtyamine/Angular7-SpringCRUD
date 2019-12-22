package com.crud.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.common.ResponseObject;
import com.crud.model.EmployeeModel;
import com.crud.service.EmployeeService;

@RestController
public class EmployeeCtrl {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("getName")
	public String getName(){
		
		return "Gaurav C";
	}

	@GetMapping("getEmployee")
	public EmployeeModel getEmployee() {
		return new EmployeeModel("Gaurav","Mumbai",54,789456613);
	}
	
	@GetMapping("getAllEmp")
	public HashMap<String,EmployeeModel> getAllEmp(){
		
		HashMap<String,EmployeeModel> map = new HashMap<>();
		map.put("bms", new EmployeeModel("Gaurav","Mumbai",54,789456613));
		map.put("two", new EmployeeModel("Gaurav","Mumbai",54,789456613));
		map.put("dhoni", new EmployeeModel("Gaurav","Mumbai",54,789456613));
		map.put("abhinav", new EmployeeModel("Gaurav","Mumbai",54,789456613));
		return map;
		
	}
	
	@PostMapping("saveData")
	public String saveEmp(@RequestBody EmployeeModel model){
		return employeeService.saveData(model);
	}
	
	@GetMapping("getDBEmp")
	public ResponseObject getDBEmp(){
		return employeeService.getDBData();
	}
	
	@PostMapping("getOneEmp")
	public ResponseObject getOneEmp(@RequestBody Long id) {
		return employeeService.getOneEmp(id);
	}
	
	
	@PostMapping("getByName")
	public ResponseObject getByName(@RequestBody EmployeeModel model) {
		return employeeService.getByName(model);
	}
	
	@PostMapping("getNameList")
	public ResponseObject getNameList(@RequestBody Long id) {
		return employeeService.getNameList(id);
	}

	@PostMapping("getNameListHql")
	public ResponseObject getNameListHql(@RequestBody Long id) {
		return employeeService.getNameHql(id);
	}
	
	//url parameter sequence should be same as path variable
	//URL: http://localhost:8080/crud/updateData/2/Kolhapur
	@PostMapping("updateData/{id}/{city}")
	public ResponseObject updateData(@PathVariable String city,@PathVariable long id ) {
		return employeeService.updateData(id,city);
	}
	
	@PostMapping("updateByParam")
	public ResponseObject updateByParam(@RequestParam(value="id") long id , @RequestParam(value="city") String city){
		return employeeService.updateData(id,city);
	}
	
	
	
}
