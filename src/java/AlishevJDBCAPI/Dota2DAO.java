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
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO heroes VALUES(?,?,?,?)");


            preparedStatement.setInt(1, hero.getId());
            preparedStatement.setString(2, hero.getName());
            preparedStatement.setString(3, hero.getRole());
            preparedStatement.setString(4, hero.getAttributes());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void update(Hero updatedHero) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("UPDATE Hero SET name=?, role=?, attribute=? WHERE id=?");

            preparedStatement.setString(1, updatedHero.getName());
            preparedStatement.setString(2, updatedHero.getRole());
            preparedStatement.setString(3, updatedHero.getAttributes());
            preparedStatement.setInt(4, updatedHero.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void delete(Hero deleteHero) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("DELETE FROM Hero WHERE id=?");

            preparedStatement.setInt(1, deleteHero.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Hero show (Hero hero) {

        Hero newhero = null;
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * FROM heroes WHERE id=?");

            preparedStatement.setInt(1,hero.getId());

           ResultSet resultSet = preparedStatement.executeQuery();

           resultSet.next();

           newhero = new Hero();

           newhero.setId(resultSet.getInt("id"));
           newhero.setName(resultSet.getString("name"));
           newhero.setRole(resultSet.getString("role"));
           newhero.setAttributes(resultSet.getString("attributes"));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
