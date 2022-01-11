/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veille;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patri
 */
public class DragonDB {

    static public List<Dragon> getDragon() {

        List<Dragon> dragons = new ArrayList<>();
        try {

            String query = "SELECT  id_dragon, dragon , sexe, longueur, nombre_ecailles, crache_feu,comportement_amoureux FROM dragons";

            Connection cnx = ConnectionDB.connect();
            System.out.println("cnx" + cnx);
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);

            int i = 0;

            while (resultSet.next()) {

                Dragon dragon = new Dragon();
                dragon.setId_dragon(resultSet.getInt(1));
                dragon.setDragon(resultSet.getString(2));
                dragon.setSexe(resultSet.getString(3));
                dragon.setLongueur(resultSet.getInt(4));
                dragon.setNombre_ecailles(resultSet.getInt(5));
                dragon.setCrache_feu(resultSet.getString(6));
                dragon.setComportement_amoureux(resultSet.getString(7));
                dragons.add(dragon);
                System.out.println(" dragons => "+dragons);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

            return dragons;
        }

    }

}
