package mk.finki.dr.timereporting.services;

import java.util.List;

import mk.finki.dr.timereporting.dto.User;
import mk.finki.dr.timereporting.models.Employee;

public interface EmployeeService {

	 List<Employee> findAll();
	 Employee findOne(Integer id);
	 void deleteEmployee(Integer id);
	 Employee save(Employee employee);
	 Employee findByUsername(String username);
	Employee login(User user);
}
