package bytemare.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataBase {

	// Connection object
	static Connection con = null;
	// Statement object
	private Statement stmt;
	// Constant for Database URL
	public String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	// Constant for Database Username
	public String DB_USER = "c##test";
	// Constant for Database Password
	public String DB_PASSWORD = "test";

	public ArrayList<Customer> getData() throws ClassNotFoundException, SQLException {

		String query = "select FIRST_NAME,LAST_NAME,SSN,PHONE_NUMBER,DOB,EMAIL from TEST4 where rownum <2 ";

		ArrayList<Customer> customeRS = new ArrayList<Customer>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			if (conn != null) {
				System.out.println("Connected to the database!");
				stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				Customer customer = new Customer();
				while (rs.next()) {

					customer.setFirstName(rs.getString("FIRST_NAME"));
					customer.setLastName(rs.getString("LAST_NAME"));
					customer.setSsn(rs.getString("SSN"));
					customer.setPhoneNumber(rs.getString("PHONE_NUMBER"));
					customer.setDob(rs.getDate("DOB"));
					customer.setEmail(rs.getString("EMAIL"));
					customeRS.add(customer);

				}

			} else {
				System.out.println("Failed to make connection!");
			}

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				stmt.close();
				con.close();
			}
		}

		return customeRS;
	}

}
