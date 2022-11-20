package model.dao;

import db.DB;
import model.dao.impc.DepartmentDaoJDBC;
import model.dao.impc.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC();
	}
}
