import AlishevJDBCAPI.Dota2DAO;
import AlishevJDBCAPI.models.Hero;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dota2DAO dota2DAO = new Dota2DAO();
        Hero hero = new Hero();
        hero.setId(5);
        hero.setName("Axe");
        hero.setRole("Hardlane");
        hero.setAttributes("Strength");

//        List<Hero> heroList = dota2DAO.index();
//        System.out.println(heroList);

        dota2DAO.save(hero);

    }
}
