package com.crud.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.common.ResponseObject;
import com.crud.dto.EmployeeDetailsDto;
import com.crud.model.EmployeeModel;
import com.crud.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	@Autowired
	private ResponseObject responseObject;
	
	@Transactional
	public String saveData(EmployeeModel model){
		
		System.out.println("--model===="+model.toString());
		
		EmployeeDetailsDto dto = new EmployeeDetailsDto();
		dto.setName(model.getName());
		dto.setCity(model.getCity());
		dto.setMobileNo(model.getMobile());
		dto.setAge(model.getAge());
		employeeRepo.save(dto);
		return "success";
	}
	
	@Transactional
	public ResponseObject getDBData(){
		responseObject.add("empList",employeeRepo.findAll());
		responseObject.setMsg("Fetched data successfully");
		return responseObject;
	}
	
	@Transactional
	public ResponseObject getOneEmp(Long id) {
		responseObject.add("count",employeeRepo.count());
		responseObject.add("emp",employeeRepo.findById(id));
		return responseObject;
	}
	
	@Transactional
	public ResponseObject getByName(EmployeeModel model) {
		responseObject.add("count",employeeRepo.findByNameAndAge(model.getName(),model.getAge()));
		return responseObject;
	}
	
	@Transactional
	public ResponseObject getNameList(long id) {
		responseObject.add("NameList",employeeRepo.puralelo(id));
		return responseObject;
	}
	
	@Transactional
	public ResponseObject getNameHql(long id) {
		responseObject.add("NameList",employeeRepo.puraMatlo(id));
		return responseObject;
	}
	
	@Transactional
	public ResponseObject updateData(long empId,String c) {
		
		System.out.println("empId=="+empId+"  city=="+c);
		
		responseObject.add("Rows Effected",employeeRepo.updateData(empId,c ));
		return responseObject;
	}

}
