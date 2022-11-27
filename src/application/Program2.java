package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depdao = DaoFactory.createDepartmentDao();
		
		System.out.println("FIND BY ID(DEPARTMENT)");
		Department deo = depdao.findById(2);
		System.out.println(deo);
		
		System.out.println("\nFIND ALL DEPARTMENTS");
		List<Department> list = depdao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\nINSERT DEPARTMENT");
		depdao.insert(new Department(null, "Teste"));
		System.out.println(depdao.findById(5));
		
		System.out.println("\nUPDATE DEPARTMENT");
		Department deo2 = new Department(5, "Teste2");
		depdao.update(deo2);
		System.out.println(depdao.findById(5));
		
//		System.out.println("\nDELETE DEPARTMENT");
//		depdao.deleteById(6);
//		List<Department> list2 = depdao.findAll();
//		for(Department dep : list2) {
//			System.out.println(dep);
//		}
	}
	
}
