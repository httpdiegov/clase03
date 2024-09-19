package Model;

import javax.xml.crypto.Data;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeModel {
    public static List<Employee> getEmployees() {
        List<Employee> empleados = new ArrayList<Employee>();

        String query = "Select * from Employee";

        DatabaseConnection dc = DatabaseConnection.getInstance();
        Connection connection = dc.getConnection();

        try {
            Statement stmt = connection.createStatement();
            if (stmt.execute(query)) {
                ResultSet rs = stmt.getResultSet();
                while (rs.next()) {
                    Employee empleado = new Employee(
                            rs.getInt("employeeId"),
                            rs.getString("lastname"),
                            rs.getString("firstname"),
                            rs.getString("title"),
                            rs.getDate("birthDate"),
                            rs.getString("country"),
                            rs.getString("email")
                    );
                    empleados.add(empleado);
                }

            }
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return empleados;
    }

    public static boolean addEmployee(Employee empleado) {
        DatabaseConnection dc = DatabaseConnection.getInstance();
        Connection connection = dc.getConnection();

        String query = "INSERT INTO `northwind`.`employee`" +
                "(`employeeId`," +
                "`lastname`," +
                "`firstname`," +
                "`title`," +
                "`birthDate`," +
                "`country`," +
                "`email`)" +
                "VALUES" +
                "(?,?,?,?,?,?,?);\n";
        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, empleado.getEmployeeId());
            pstmt.setString(2,empleado.getLastname());
            pstmt.setString(3,empleado.getFirstname());
            pstmt.setString(4,empleado.getTitle());
            pstmt.setDate(5,empleado.getBirthDate());
            pstmt.setString(6,empleado.getCountry());
            pstmt.setString(7,empleado.getEmail());

            int rs = pstmt.executeUpdate();

            if(rs>0){
                return true;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
