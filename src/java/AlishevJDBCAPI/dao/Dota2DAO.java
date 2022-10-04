package AlishevJDBCAPI.dao;

import AlishevJDBCAPI.models.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Dota2DAO {

    private final JdbcTemplate jdbcTemplate;

   @Autowired
    public Dota2DAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Hero> index() {
        return jdbcTemplate.query("SELECT * FROM heroes", new BeanPropertyRowMapper<>(Hero.class));
    }

    public void save (Hero hero) {
       jdbcTemplate.update("INSERT INTO heroes VALUES (hero.getId(),?,?,?)", hero.getName(), hero.getRole(), hero.getAttributes());

    }

    public void update(Hero updatedHero) {
        jdbcTemplate.update("UPDATE heroes SET name=?, role=?, attribute=? WHERE id=hero.getId()",
                updatedHero.getName(), updatedHero.getRole(), updatedHero.getAttributes());

    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM heroes WHERE id = hero.getId()", id);
    }

    public Hero show (int id) {
       return jdbcTemplate.query("SELECT * FROM heroes WHERE id=?", new Object[]{id},new BeanPropertyRowMapper<>(Hero.class))
               .stream().findAny().orElse(null);

    }




}
