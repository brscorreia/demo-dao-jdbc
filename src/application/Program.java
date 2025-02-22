package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Department obj = new Department(1, "Books");

		// Seller seller = new Seller(21 , "Bob", "bob@mail", new Date(), 3000.0, obj);

		SellerDao sellerDao = DaoFactory.createSellerDao();

		Seller seller = sellerDao.findById(1);

		System.out.println(seller);
		/*
		 * System.out.println("\n=== TEST 2: seller findByDepartment =====");
		 * 
		 * Department department = new Department(2, null);
		 * 
		 * List<Seller> list = sellerDao.findByDepartment(department);
		 * 
		 * for (Seller obj : list) { System.out.println(obj); }
		 * 
		 * System.out.println("\n=== TEST 3: seller findByDepartment ====="); list =
		 * sellerDao.findAll(); for (Seller obj : list) { System.out.println(obj); }
		 * 
		 * System.out.println("\n=== TEST 4: seller insert ====="); Seller newSeller =
		 * new Seller(null, "Greg", "greg@mail.com", new Date(), 4000.0, department);
		 * sellerDao.insert(newSeller); System.out.println("Inserted new id = " +
		 * newSeller.getId());
		 * 
		 * System.out.println("\n=== TEST 5: seller update ====="); seller =
		 * sellerDao.findById(1); seller.setName("Martha Waine");
		 * sellerDao.update(seller);
		 * 
		 * System.out.println("\n=== TEST 6: seller delete =====");
		 * System.out.println("Enter id for delete test: \n"); int id = sc.nextInt();
		 * sellerDao.deleteById(id); System.out.println("Delete completed");
		 */

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("\n=== TEST: Department find by ID =====");

		Department dep = departmentDao.findById(1);

		System.out.println(dep);

		System.out.println("\n=== TEST: Department find all =====");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

		/*
		 * System.out.println("\n=== TEST: Department insert ====="); Department newDep
		 * = new Department(null, "teste"); departmentDao.insert(newDep);
		 * System.out.println("Inserted new id = " + newDep.getId());
		 */

		/*
		 * System.out.println("\n=== TEST: department update ====="); dep =
		 * departmentDao.findById(1); dep.setName("updateName");
		 * departmentDao.update(dep);
		 */

		System.out.println("\n=== TEST: department delete =====");
		System.out.println("Enter id for delete test: \n");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		sc.close();
	}
}
