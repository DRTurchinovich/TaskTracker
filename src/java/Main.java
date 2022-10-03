import AlishevJDBCAPI.Dota2DAO;
import AlishevJDBCAPI.models.Hero;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dota2DAO dota2DAO = new Dota2DAO();
        Hero hero = new Hero();
        hero.setId(6);
        hero.setName("Drow Ranger");
        hero.setRole("Carry");
        hero.setAttributes("Agility");


        dota2DAO.save(hero);

    }
}
