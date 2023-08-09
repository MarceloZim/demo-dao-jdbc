package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: seller findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);

		System.out.println("=== TEST 2: seller findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);

			System.out.println("=== TEST 4: seller insert ===");
			Department newDepartment = new Department(7, "Saiscobs");
			departmentDao.insert(newDepartment);
			System.out.println("Inserted! New id = " + newDepartment.getId());

			System.out.println("=== TEST 4: seller update ===");
			newDepartment = new Department(6, "Zim");
			departmentDao.update(newDepartment);
			System.out.println("Inserted! New id = " + newDepartment.getId());

			System.out.println("=== TEST 6: seller deleteById ===");
			System.out.println("Enter id for delete teste: ");
			int id = sc.nextInt();
			departmentDao.deleteById(id);
			System.out.println("Delete completed");

		}
	}
}