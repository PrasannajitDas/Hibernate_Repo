package hibernateDemocls.controller;

import java.util.Scanner;

import hibernateDemocls.dao.StudentDao;

public class DeleteStudentController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to delete :");
		int id = sc.nextInt();

		StudentDao s = new StudentDao();
		s.deleteStudentById(id);

	}

}
