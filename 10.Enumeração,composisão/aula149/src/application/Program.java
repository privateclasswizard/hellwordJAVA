package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter departament's name: ");
		String departmentName = sc.nextLine();
		Department newDepart = new Department(departmentName);
		
		System.out.println("Eneter Woker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Lavel: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double workerBaseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, newDepart);

		//		System.out.println("parou aqui");
//		System.out.println(worker);
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
//		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
		
		System.out.print("How many contracts to this worker: ");
		int n = sc.nextInt();
		for(int i = 1; i<n; i++ ) {
			System.out.println("Enter contract#"+i+" Data:");
			
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf1.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartament().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		sc.close();
	}

}
