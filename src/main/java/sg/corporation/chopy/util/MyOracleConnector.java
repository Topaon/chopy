package sg.corporation.chopy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import sg.corporation.chopy.entity.Recipe;

public class MyOracleConnector {
	public static String getRecipeWithId(int id) {
		String recipeName = "";
		
		String url = "jdbc:oracle:thin:@chopyoracle.ckjgk0obymny.eu-north-1.rds.amazonaws.com:1521:orcl";
		String user = "chopyadmin";
		String password = "chopychopy";

		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM recipe WHERE id = " + id);
			rs.next();
			recipeName = rs.getString("name");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recipeName;
	}
}
