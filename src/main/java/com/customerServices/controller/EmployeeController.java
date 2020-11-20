package com.customerServices.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customerServices.dao.CustomerDao;
import com.customerServices.model.Employee;
import com.customerServices.services.error.CSNotFountException;
import com.customerServices.util.Validate;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired(required = true)
	@Qualifier("customerDao")
	  private CustomerDao customerDao;
	
	@ApiOperation(value="employee update")
	@RequestMapping(value="/employee/place/{place}/salary/{percentage} ",method=RequestMethod.PUT,produces="application/json")
	public ResponseEntity create(@PathVariable("place") String place,
			@PathVariable("percentage") Integer percentage
			){
		Object result=null;
		 Validate validate= new Validate();
		 validate.percentageValidation(percentage);
		 int  employeeUpdate = customerDao.updateEmployee(percentage,place);
		// System.out.println("mapId/////////////"+customerByEmail.get("id"));
		 if(employeeUpdate > 0) {
			 return new ResponseEntity<>("Successfully updated employee", HttpStatus.OK); 
		 }else {
			 return new ResponseEntity<>("Failed",HttpStatus.INTERNAL_SERVER_ERROR); 
		 }
	}
	
	@ApiOperation(value="Return employee Details by given place")
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/employee/{place}",method=RequestMethod.GET,produces="application/json")
	public ResponseEntity customerByPlace(@PathVariable("place") String place){
		List<Employee> result=new ArrayList<>();
		Pageable pageWithFiveElements = PageRequest.of(0, 5);

		  if(place!=null){
			  result=customerDao.findAllByPlace(place,pageWithFiveElements);
		 if(result.isEmpty()){ throw new CSNotFountException("Employee not found");
		  } }
		
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	
	@ApiOperation(value="Return employee Details by given competencies")
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/employee/{competencies}",method=RequestMethod.GET,produces="application/json")
	public ResponseEntity customerByCompetencies(@PathVariable("competencies") Integer competencies){
		List<Employee> result=new ArrayList<>();
		  if(competencies!=null){
			  result=customerDao.findAllByCompetencies(competencies);
		 if(result.isEmpty()){ throw new CSNotFountException("Employee not found");
		  } }
		
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
}
