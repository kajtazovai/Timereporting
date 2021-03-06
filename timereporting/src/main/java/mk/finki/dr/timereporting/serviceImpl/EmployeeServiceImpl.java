package mk.finki.dr.timereporting.serviceImpl;

import java.util.List;

import mk.finki.dr.timereporting.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mk.finki.dr.timereporting.models.Employee;
import mk.finki.dr.timereporting.repositories.EmployeeRepository;
import mk.finki.dr.timereporting.services.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepository repo;
	
	@Override
	public List<Employee> findAll() {
		return repo.findAll();
	}

	@Override
	public Employee findOne(Integer id) {
		return repo.getOne(id);
	}

	@Override
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Employee save(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public Employee findByUsername(String username) {
		return repo.findByUsername(username);
	}

	@Override
	public Employee login(User user) {
		return repo.findByUsernameAndPassword(user.getUsername(),user.getPassword());
	}


}
