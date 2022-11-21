package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("FIND BY ID (SELLER):");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\nFIND BY DEPARTMENT(SELLER)");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\nFIND BY DEPARTMENT(SELLER)");
		List<Seller> list2 = sellerDao.findAll();
		for (Seller obj : list2) {
			System.out.println(obj);
		}
		
		System.out.println("\nINSERT IN SELLER");
		Seller sel = new Seller(null, "Lied", "lied@gmail.com", new Date(), 5000.0, department);
		sellerDao.insert(sel);
		for (Seller obj : list2) {
			System.out.println(obj);
		}
		
	}

}
