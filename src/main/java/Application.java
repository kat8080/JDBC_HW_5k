import java.sql.*;
import org.example.*;

public class Application {
    public static void main(String[] args) throws SQLException {

        Employee employee = new Employee(8,"Мишка","Михаил","муж",23,3);

        EmployeeDao employeeDao = new EmployeeDaoImpl();
        employeeDao.getAllEmployee().forEach(System.out::println);

        Integer employeeId = employeeDao.add(employee);
        System.out.println(employeeDao.getAllEmployee());
        System.out.println();
        employeeDao.updateEmployee(employeeId, employee);
        employeeDao.deleteEmployee(employeeDao.getById(employeeId));
        System.out.println(employeeDao.getById(4));
//    final String user = "postgres";
//    final String password = "33dom33";
//    final String url = "jdbc:postgresql://localhost:5432/employee";
//
//        try (final Connection connection = DriverManager.getConnection(url, user, password);
//    PreparedStatement statement=connection.prepareStatement("SELECT * FROM employee WHERE id = (?)")) {
//
//        statement.setInt(1,1);
//        final ResultSet resultSet = statement.executeQuery();
//
//        if (resultSet.next()) {
//            String name = "Name: " + resultSet.getString("last_name");
//            String surname = "Surname: " + resultSet.getString("first_name");
//            String gender = "Gender: " + resultSet.getString(4);
//            int age = resultSet.getInt(5);
//
//            System.out.println(name);
//            System.out.println(surname);
//            System.out.println(gender);
//            System.out.println("Age: " + age);
//        }
//    }
//
}
}
