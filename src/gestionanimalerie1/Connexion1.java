/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionanimalerie1;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Utilisateur
 */
public class Connexion1 {
    Connection con;
    public Connexion1() {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:animalerieDB.db");
            System.out.println("Connection etablie!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
}

