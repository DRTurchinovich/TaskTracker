package DbSettings;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCConnectWithSelect {

    public static void main(String[] args) {

        List<DBTask> result = new ArrayList<>();

        String SQL_SELECT = "Select * from task";

        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/tasktracker", "postgres", "123123");
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

//                int id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");
                String description  = resultSet.getString("Description");
                String status  = resultSet.getString("Status");

                DBTask obj = new DBTask();
                obj.setId(resultSet.getInt("ID"));
                obj.setName(name);
                obj.setDescription(description);
                obj.setStatus(status);

                result.add(obj);
            }
            result.forEach(x -> System.out.println(x));

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}