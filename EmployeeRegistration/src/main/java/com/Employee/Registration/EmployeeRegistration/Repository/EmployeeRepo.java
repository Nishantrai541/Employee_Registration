package com.Employee.Registration.EmployeeRegistration.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Employee.Registration.EmployeeRegistration.Model.EmployeeModel;

public interface EmployeeRepo extends JpaRepository<EmployeeModel, Long>{
	

	@Query("SELECT m FROM EmployeeModel m WHERE LOWER(m.name) LIKE %:name%")
	List<EmployeeModel> getEmpListByName(@Param("name")String name);

}
