package com.spansystems.springmvc.controller;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.ModelMap;

import com.spansystems.springmvc.dao.EmployeeDaoImpl;
import com.spansystems.springmvc.model.Employee;
import com.spansystems.springmvc.service.EmployeeServiceImpl;

public class AppControllerTest {
	@InjectMocks
	private AppController appController;

	private ModelMap model;

	@Mock
	private EmployeeServiceImpl empService;

	@Mock
	private EmployeeDaoImpl empDao;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Before
	public void setUp() throws Exception {

		model = new ModelMap();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testListEmployees() {
		when(empDao.findAllEmployees()).thenReturn(prepareEmployee());
		when(empService.findAllEmployees()).thenReturn(prepareEmployee());		
		assertNotNull(appController.listEmployees(model));

	}

	private List<Employee> prepareEmployee() {
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Keith");
		emp1.setJoiningDate(new LocalDate("2010-05-24"));
		emp1.setSalary(new BigDecimal("51000"));
		emp1.setSsn("01");
		empList.add(emp1);
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("George");
		emp2.setJoiningDate(new LocalDate("2010-11-12"));
		emp2.setSalary(new BigDecimal("92000"));
		emp2.setSsn("02");
		empList.add(emp2);
		return empList;
	}

}
