package design;

import databases.ConnectToSqlDB;

import java.util.*;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args)throws Exception {

		EmployeeInfo e1 = new EmployeeInfo("Bob Stone",304,"QA",6500000,'M');
		EmployeeInfo e2 = new EmployeeInfo("Eddie Brock",405, "QA", 8000000, 'M');
		EmployeeInfo e3 = new EmployeeInfo("Peter Parker",101, "Dev", 5500000, 'M');
		EmployeeInfo e4 = new EmployeeInfo("Linda Hamilton",365,"Dev",7500000,'F');
		EmployeeInfo e5 = new EmployeeInfo("Kevin Hart",369, "Dev",9000000, 'M');

		System.out.println(e1.getName());
		System.out.println(e1.getEmployeeId());
		System.out.println(e1.getSalary());
		System.out.println(e1.getDept("QA"));
		System.out.println(e1.getGender());
		e1.farewell(9/2/2020);
		e1.calculateSalary();
		e1.assignDepartment();

		EmployeeInfo.calculateEmployeeBonus(10,80000);
		EmployeeInfo.setCompanyName("AAA Insurance");
		System.out.println(EmployeeInfo.getCompanyName());
		System.out.println(EmployeeInfo.calculateEmployeePension());

		Map<Integer, List<Object>> employeeInfo = new HashMap<Integer, List<Object>>();
		List<Object> emp1 = new ArrayList<Object>();
		emp1.add(e1.employeeName());
		emp1.add(e1.employeeId());
		emp1.add(e1.calculateSalary());

		List<Object> emp2 = new ArrayList<Object>();
		emp2.add(e2.employeeName());
		emp2.add(e2.employeeId());
		emp2.add(e2.calculateSalary());

		employeeInfo.put(1, emp1);
		employeeInfo.put(2, emp2);

		List empInfo = new ArrayList();
		empInfo = emp2;

		ConnectToSqlDB connect = new ConnectToSqlDB();
		ConnectToSqlDB.connectToSqlDatabase();

		//connect.createTableFromStringToMySql("Employee_Records","Emp_Info");

		connect.insertDataFromArrayListToSqlTable(empInfo, "Employee_Records","Emp_Info");

		//converting List<Object> to List<String>
		List<String> stringList = new ArrayList<String>();
		List<Object> objectList = Arrays.asList(stringList.toArray());

		connect.readDataBase("Employee_Records","Emp_Info");


	}

}
