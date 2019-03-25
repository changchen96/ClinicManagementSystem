/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicsystem;

import java.sql.SQLException;

/**
 *
 * @author c7-ong
 */
public class ClinicSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            databaseConn.openConn();
            LoginGUI loginMenu = new LoginGUI();
            loginMenu.setVisible(true);
        }
        catch(SQLException ex)
        {
            System.out.print("Error:");
            System.out.print(ex);
        }
        
    }
    
}
