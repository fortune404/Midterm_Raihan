package math.problems;

import databases.ConnectToSqlDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) throws SQLException {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

		//find lowest number from the array

		System.out.println("Lowest number: "+getLowest(array,array.length));

		int lowestV = getLowest(array,array.length);

//		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
//		List<String> lowestValue = new ArrayList<String>();

//		Connection connection = null;
//		Statement statement = null;

//		String url = "jdbc:mysql://localhost:3306/pnt?serverTimezone=UTC";
//
//		connection = DriverManager.getConnection(url, "root","root");
		try {
			//connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
			//lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

			Class.forName("com.mysql.cj.jdbc.Driver");//

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC","root","root");
			Statement statement = conn.createStatement();
			String insertQuery = "INSERT INTO owners(ownerNumber) VALUES ("+lowestV+");";
			statement.executeQuery(insertQuery);

		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
//		for(String st:lowestValue){
//			System.out.println(st);
//		}
	}


	public static int getLowest(int[] array, int total){
		int temp;
		for (int i = 0; i < total; i++)
		{
			for (int j = i + 1; j < total; j++)
			{
				if (array[i] > array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[0];
	}

}
