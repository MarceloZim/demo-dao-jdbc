package model.dao;

import model.dao.impl.SallerDaoJDBC;

public class DaoFactory {

	public static SallerDao createSallerDao() {
		return new SallerDaoJDBC();
	}
}
