package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department finById ====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: department findAll ====");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: department insert ====");
		Department dep = new Department(null, "Lou�a");
		departmentDao.insert(dep);
		System.out.println("Department inserted! id: " + dep.getId());
		
		System.out.println("\n=== TEST 4: department update ====");
		dep = departmentDao.findById(6);
		dep.setName("Limpeza");
		departmentDao.update(dep);
		System.out.println("Updated completed");		
		
		System.out.println("\n=== TEST 5: department delete ====");
		departmentDao.deleteById(10);
		System.out.println("Delete completed!");
	}

}
