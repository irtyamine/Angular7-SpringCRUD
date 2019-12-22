package com.crud.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.crud.dto.EmployeeDetailsDto;

public interface EmployeeRepo extends JpaRepository<EmployeeDetailsDto, Long> {
	
	//QueryMethod
	public EmployeeDetailsDto findByNameAndAge(String name,long age);

	
	//Native Query     Note: It is wrong Practice , Never Use Native query in Repo .................Always use HQL
    @Query(value="select Full_name from Employee_Details where age=?1",nativeQuery=true)	
	public List<String> puralelo(long age);
    
    //Using HQl
    @Query(value="select name from EmployeeDetailsDto where age=:age")	
   	public List<String> puraMatlo(long age);
	
    
    //Update using @Modifying
    @Modifying
    @Query(value="update EmployeeDetailsDto set city=:c where empId=:emp")
    public int updateData(long emp,String c);
	

}
