package application;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SallerDao;
import model.entities.Department;
import model.entities.Saller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		Saller saller = new Saller(28, "Marcelo", "marcelod112233@gmail.com", new Date(), 3000.00, obj);
		System.out.println(saller);

		SallerDao sallerdao = DaoFactory.createSallerDao();
	}

}
