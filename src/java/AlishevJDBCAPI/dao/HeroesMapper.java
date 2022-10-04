package AlishevJDBCAPI.dao;

import AlishevJDBCAPI.models.Hero;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HeroesMapper implements RowMapper<Hero> {

    @Override
    public Hero mapRow(ResultSet resultSet, int i) throws SQLException {
        Hero hero = new Hero();

        hero.setId(resultSet.getInt("id"));
        hero.setName(resultSet.getString("name"));
        hero.setRole(resultSet.getString("role"));
        hero.setAttributes(resultSet.getString("attributes"));

        return hero;
    }
}
