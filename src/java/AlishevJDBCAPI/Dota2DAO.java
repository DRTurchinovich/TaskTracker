package AlishevJDBCAPI;

import AlishevJDBCAPI.models.Hero;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Dota2DAO {
    private static final String URL = "jdbc:postgresql://localhost:5432/dota2";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "123123";

    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Hero> index() {
        List<Hero> name = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM heroes";
            ResultSet resultSet = statement.executeQuery(SQL);


            while (resultSet.next()) {
                Hero hero = new Hero();

                hero.setId(resultSet.getInt("id"));
                hero.setName(resultSet.getString("name"));
                hero.setRole(resultSet.getString("role"));
                hero.setAttributes(resultSet.getString("attributes"));

                name.add(hero);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return name;
    }

    public void save (Hero hero) {
        try {
            Statement statement = connection.createStatement();
            String SQL = "INSERT INTO heroes VALUES(" + hero.getId() + ",'" + hero.getName() + "'," + "'" + hero.getRole() + "'" + ",'" + hero.getAttributes() + "')";


            statement.executeUpdate(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
