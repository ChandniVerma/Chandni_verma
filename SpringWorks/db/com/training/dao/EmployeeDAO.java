package com.training.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.training.entity.Employee;
import com.training.interfaces.IEmployeeDAO;
import com.training.mappers.EmployeeMapper;

public class EmployeeDAO  implements IEmployeeDAO{
	
	@Autowired
	private DataSource dataSource;
	
	
	private JdbcTemplate jdbcTemplateObject;
	

	@Override
	public void deleteEmployee(int empId) {
		
		String sql="delete from employee where empid=?";
		jdbcTemplateObject.update(sql, empId);
		System.out.println("Delete the id"+empId);
		return;
        
		
	}

	@Override
	public void updateEmployee(int empId, double empNewSalary) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDataSource(DataSource dataSource) {
		
		this.dataSource=dataSource;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
	}

	@Override
	public com.training.entity.Employee getEmployee(int empId) {
		
		String sql="select empid,empname,empsal from employee where empid=?";
		
		com.training.entity.Employee emp=jdbcTemplateObject.queryForObject(sql, new Object[] {empId},new EmployeeMapper());

		return emp;
	}

	@Override
	public void insertEmployee(com.training.entity.Employee employee) {
		// TODO Auto-generated method stub
		
		String sql="insert into employee(empid,empname,empsal)"+"values(?,?,?)";
		jdbcTemplateObject.update(sql, employee.getEmpId(), employee.getEmpName(),employee.getEmpSal());
		
	System.out.println("Record Created "+ employee);
		
	}

	@Override
	public List<com.training.entity.Employee> getAllEmps() {
		String sql="select empid, empname, empsal from employee";
		List<Employee> list=new ArrayList<>();
		List<Map<String,Object>>rows=jdbcTemplateObject.queryForList(sql);
		
		 for(Map row:rows) {
			Employee employee=new Employee();
			employee.setEmpId(Integer.parseInt(row.get("empid").toString()));
			employee.setEmpName((row.get("empname").toString()));
			employee.setEmpSal(Double.parseDouble(row.get("empid").toString()));
			list.add(employee);
		}
		
		return list;
	}

}
