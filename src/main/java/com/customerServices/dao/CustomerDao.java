package com.customerServices.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.customerServices.model.Employee;

@Transactional
@Qualifier("customerDao")
@EnableJpaRepositories
public interface CustomerDao extends PagingAndSortingRepository<Employee, Integer> {
	
	@Transactional
	@Modifying
	@Query(value = "update Employee emp set emp.salary = salary + salary * :percentage / 100 where emp.place = :place")
	int updateEmployee(@Param("percentage") int percentage, @Param("place") String place);

	List<Employee> findAllByPlace(String place, Pageable pageable);
	
	List<Employee> findAllByCompetencies(Integer competencies);
}
